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
public class RaicesMultiplesModel {
    
    public double tolerancia;
    private double valorInicial;
    private double iteraciones;
    private String funcion;
    private FunctionEvaluator functionEvaluator;

    public RaicesMultiplesModel(String valorInicial, String valorSiguiente, String funcion, String tolerancia, String iteraciones) {
        this.valorInicial = Double.valueOf(valorInicial);
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
 
    
    
    
}
