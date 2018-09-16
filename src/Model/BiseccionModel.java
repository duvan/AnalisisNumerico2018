/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class BiseccionModel {

    public double ymFinal;
    public double xmFinal;
    public double errorFinal;
    public double tolerancia;
    private double valorInicial;
    private double valorSiguiente;
    private double iteraciones;
    private String funcion;
    private FunctionEvaluator functionEvaluator;
    

    public BiseccionModel(String valorInicial, String valorSiguiente, String funcion, String tolerancia, String iteraciones) {
        this.valorInicial = Double.valueOf(valorInicial);
        this.valorSiguiente = Double.valueOf(valorSiguiente);
        this.iteraciones = Double.valueOf(iteraciones);
        this.tolerancia = Double.valueOf(tolerancia);
        this.funcion = funcion;
        this.functionEvaluator = new FunctionEvaluator(funcion);
    }

    public boolean valorInicialEsRaiz() {
        boolean isValid = functionEvaluator.isValid(valorInicial)
                && functionEvaluator.evaluate(valorInicial) == 0.0;
        return isValid;
    }

    public boolean valorSiguienteEsRaiz() {
        boolean isValid = functionEvaluator.isValid(valorSiguiente)
                && functionEvaluator.evaluate(valorSiguiente) == 0.0;
        return isValid;
    }

    public boolean intervalInvalido() {
        return valorInicial * valorSiguiente > 0;
    }

    public List<Object[]> calcularRaiz() {
        double xi = valorInicial;
        double xs = valorSiguiente;
        double yi = functionEvaluator.evaluate(valorInicial);
        double ys = functionEvaluator.evaluate(valorSiguiente);
        double xm = (xi + xs) / 2;
        double ym = functionEvaluator.evaluate(xm);
        double error = tolerancia + 1;
        int contador = 1;
        List<Object[]> resultado = new ArrayList<Object[]>();
        resultado.add(new Object[]{contador, xi, xs, xm, ym, error});

        while ((ym != 0) && (error > tolerancia) && (contador < iteraciones)) {
            if ((yi * ym) < 0) {
                xs = xm;
                ys = ym;
            } else {
                xi = xm;
                yi = ym;
            }
            double xaux = xm;
            xm = (xi + xs) / 2;
            ym = functionEvaluator.evaluate(xm);
            error = Math.abs(xm - xaux);
            contador++;
            resultado.add(new Object[]{contador, xi, xs, xm, ym, error});
            xmFinal = xm;
            ymFinal = ym; 
            errorFinal = error;
        }
        return resultado;
    }
}
