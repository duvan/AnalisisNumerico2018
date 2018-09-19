/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JPanel;
import Views.NoLineales.RaicesmultiplesView;
import Model.RaicesMultiplesModel;
import Views.NoLineales.BiseccionView;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author duvandariobarrientosbetancur
 */
public class RaicesMultiplesController {
    RaicesmultiplesView raicesmultiplesPanel;
    RaicesmultiplesModel raicesMultiplesModel;
    private String valorInicial;
    private String funcion;
    private String tolerancia;
    private String iteraciones;
    
    public RaicesmultiplesController(BiseccionView raicesmultiplesPanel){
        this.RaicesmultiplesPanel = raicesmultiplesPanel;
        this.valorInicial = raicesmultiplesPanel.getValorInicial();
        this.funcion = raicesmultiplesPanel.getFuncion();
        this.tolerancia = raicesmultiplesPanel.getTolerancia();
        this.iteraciones = raicesmultiplesPanel.getIteraciones();
        this.raicesmultiplesModel = new raicesmultiplesModel(valorInicial,  
                funcion, 
                tolerancia, 
                iteraciones);
    }
    
    
    
}
