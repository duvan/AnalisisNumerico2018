/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.SecanteModel;
import Views.NoLineales.SecanteView;
import java.util.List;

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class SecanteController {
    

    SecanteView secantePanel;
    SecanteModel secanteModel;
    private String valorInicial;
    private String valorSiguiente;
    private String funcion;
    private String tolerancia;
    private String iteraciones;
    

    public SecanteController(SecanteView secantePanel){
        this.secantePanel = secantePanel;
        this.valorInicial = secantePanel.getValorInicial();
        this.valorSiguiente = secantePanel.getValorSiguiente();
        this.funcion = secantePanel.getFuncion();
        this.tolerancia = secantePanel.getTolerancia();
        this.iteraciones = secantePanel.getIteraciones();
        this.secanteModel = new SecanteModel(valorInicial, 
                valorSiguiente, 
                funcion, 
                tolerancia, 
                iteraciones);        
    }

      public void calcular(){
        if(secanteModel.valorInicialEsRaiz()){
            secantePanel.setInfoMessage(valorInicial + " es raiz");
            return;
        } 
        
                List<Object[]> result = secanteModel.calcularRaiz();
        
        for(int i = 0; i < result.size(); i++ ){
            secantePanel.getTableModel().addRow(result.get(i));
        }
        
        if(secanteModel.yFinal == 0){
            secantePanel.setInfoMessage(secanteModel.xFinal + " es raiz");
            return;
        }
        
        if(secanteModel.errorFinal < secanteModel.tolerancia){
            secantePanel.setInfoMessage(secanteModel.xFinal + " es raiz con error de" + secanteModel.errorFinal );
            return;
        }
        
        secantePanel.setInfoMessage("No se encontro raiz");
}
}
