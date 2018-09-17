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
public class SecanteModel {

    public double tolerancia;
    public double yFinal;
    public double xFinal;
    public double errorFinal;
    private double valorInicial;
    private double valorSiguiente;
    private double iteraciones;
    private String funcion;
    private FunctionEvaluator functionEvaluator;

    public SecanteModel(String valorInicial, String valorSiguiente, String funcion, String tolerancia, String iteraciones) {
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
    
    
    public List<Object[]> calcularRaiz() {
        List<Object[]> resultado = new ArrayList<Object[]>();
        double xi = valorInicial;
        double xs = valorSiguiente;
        double yi = functionEvaluator.evaluate(valorInicial);
        double ys = functionEvaluator.evaluate(valorSiguiente);
        double error = Math.abs(xs - xi);
        int contador = 0;
        resultado.add(new Object[]{contador, xi, yi, null});
        resultado.add(new Object[]{contador, xs, ys, null});
        while (ys != 0 && error > tolerancia && contador < iteraciones && (ys - yi) != 0) {
            double x2 = xs - ((ys * (xs - xi)) / ((ys - yi)));
            yi = ys;
            ys = functionEvaluator.evaluate(x2);
            error = Math.abs((x2 - xs) / x2);
            contador++;
            xi = xs;
            xs = x2;
            resultado.add(new Object[]{contador, x2, ys, error});
            xFinal = xs;
            yFinal = ys; 
            errorFinal = error;

        }
         return resultado;       
    }
}
