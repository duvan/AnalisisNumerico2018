/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PuntoFijoModel;
import Views.NoLineales.PuntoFijoView;
import java.util.List;


/**
 *
 * @author duvandariobarrientosbetancur
 */
public class PuntoFijoController {
    PuntoFijoView puntoFijoPanel;
    PuntoFijoModel puntoFijoModel;
    private String valorInicial;
    private String funcionF;
    private String funcionG;
    private String tolerancia;
    private String iteraciones;
    
    public PuntoFijoController(PuntoFijoView puntoFijoPanel){
        this.puntoFijoPanel = puntoFijoPanel;
        this.valorInicial = puntoFijoPanel.getValorInicial();
        this.funcionF = puntoFijoPanel.getFuncion();
        this.funcionG = puntoFijoPanel.getFuncion();
        this.tolerancia = puntoFijoPanel.getTolerancia();
        this.iteraciones = puntoFijoPanel.getIteraciones();
        this.puntoFijoModel = new puntoFijoModel(valorInicial,  
                funcionF,
                funcionG,
                tolerancia, 
                iteraciones);        
    }
    
          public void calcular(){
        
}
    
}
