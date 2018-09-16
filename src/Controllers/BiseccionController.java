/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import javax.swing.JPanel;
import Views.NoLineales.BiseccionView;
import Model.BiseccionModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class BiseccionController {
    BiseccionView biseccionPanel;
    BiseccionModel biseccionModel;
    private String valorInicial;
    private String valorSiguiente;
    private String funcion;
    private  String tolerancia;
    private String iteraciones;
    
    public BiseccionController(BiseccionView biseccionPanel){
        this.biseccionPanel = biseccionPanel;
        this.valorInicial = biseccionPanel.getValorInicial();
        this.valorSiguiente = biseccionPanel.getValorSiguiente();
        this.funcion = biseccionPanel.getFuncion();
        this.tolerancia = biseccionPanel.getTolerancia();
        this.iteraciones = biseccionPanel.getIteraciones();
        this.biseccionModel = new BiseccionModel(valorInicial, 
                valorSiguiente, 
                funcion, 
                tolerancia, 
                iteraciones);
    }
    
    public void calcular(){
        if(biseccionModel.valorInicialEsRaiz()){
            biseccionPanel.setInfoMessage(valorInicial + " es raiz");
            return;
            
        }   
        if(biseccionModel.valorSiguienteEsRaiz()){
            biseccionPanel.setInfoMessage(valorSiguiente + " es raiz");
            return;
        } 
        if(biseccionModel.intervalInvalido()){
            biseccionPanel.setInfoMessage("no es un intervalo valido");
            return;
        } 
        List<Object[]> result = biseccionModel.calcularRaiz();
        for(int i = 0; i < result.size(); i++ ){
            biseccionPanel.getTableModel().addRow(result.get(i));
        }
        
        if(biseccionModel.ymFinal == 0){
            biseccionPanel.setInfoMessage(biseccionModel.xmFinal + " es raiz");
            return;
        }
        
        if(biseccionModel.errorFinal < biseccionModel.tolerancia){
            biseccionPanel.setInfoMessage(biseccionModel.xmFinal + " es raiz con error de" + biseccionModel.errorFinal );
            return;
        }
        
        biseccionPanel.setInfoMessage("No se encontro raiz");
    }
    
    
    
}
