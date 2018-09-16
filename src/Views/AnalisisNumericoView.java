/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import Views.Helpers.BienvenidaView;
import Views.NoLineales.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class AnalisisNumericoView extends javax.swing.JFrame {
    private BienvenidaView bienvenidaView;
    private SecanteView secanteView;
    private BiseccionView biseccionView;
    private EliminacionGaussianaView eliminacionGaussianaView;
    private NewtonView newtonView;
    private PuntoFijoView puntoFijoView;
    private ReglaFalsaView reglaFalsaView;
    private RaicesMultiplesView raicesMultiplesView;
    private BusquedasIncrementalesView busquedasIncrementalesView;
  
    private JPanel currentPanel; 
    /**
     * Creates new form AnalisisNumericoView
     */
    public AnalisisNumericoView() {
        initComponents();
        setSize(830,720);
        setResizable(false);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){}
        
        bienvenidaView = new BienvenidaView();
        
        setCurrentView(bienvenidaView);
    }
    
    private void setCurrentView(JPanel newPanel){
        if(currentPanel != null) {
            currentPanel.setVisible(false);
        }
        newPanel.setSize(830,720);
        currentPanel = newPanel; 
        add(BorderLayout.CENTER,currentPanel);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        noLinealesMenuItem = new javax.swing.JMenu();
        secanteMenuItem = new javax.swing.JMenuItem();
        biseccionMenuItem = new javax.swing.JMenuItem();
        puntoFijoMenuItem = new javax.swing.JMenuItem();
        newtonMenuItem = new javax.swing.JMenuItem();
        raicesMultiplesMenuItem = new javax.swing.JMenuItem();
        busquedasIncrementalesMenuItem = new javax.swing.JMenuItem();
        eliminacionGaussianaMenuItem = new javax.swing.JMenuItem();
        reglaFalsaMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisis Numerico");

        jMenu1.setText("Funciones");

        noLinealesMenuItem.setText("No Lineales");

        secanteMenuItem.setText("Secante");
        secanteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secanteMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(secanteMenuItem);

        biseccionMenuItem.setText("Bisección");
        biseccionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biseccionMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(biseccionMenuItem);

        puntoFijoMenuItem.setText("Punto Fijo");
        puntoFijoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoFijoMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(puntoFijoMenuItem);

        newtonMenuItem.setText("Newton");
        newtonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtonMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(newtonMenuItem);

        raicesMultiplesMenuItem.setText("Raices Multiples");
        raicesMultiplesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raicesMultiplesMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(raicesMultiplesMenuItem);

        busquedasIncrementalesMenuItem.setText("Busquedas Incrementales");
        busquedasIncrementalesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedasIncrementalesMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(busquedasIncrementalesMenuItem);

        eliminacionGaussianaMenuItem.setText("Eliminación Gaussina");
        eliminacionGaussianaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminacionGaussianaMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(eliminacionGaussianaMenuItem);

        reglaFalsaMenuItem.setText("Regla Falsa");
        reglaFalsaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglaFalsaMenuItemActionPerformed(evt);
            }
        });
        noLinealesMenuItem.add(reglaFalsaMenuItem);

        jMenu1.add(noLinealesMenuItem);

        jMenu3.setText("Lineales");
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void biseccionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biseccionMenuItemActionPerformed
        biseccionView = new BiseccionView();
        setCurrentView(biseccionView);
    }//GEN-LAST:event_biseccionMenuItemActionPerformed

    private void puntoFijoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoFijoMenuItemActionPerformed
        puntoFijoView = new PuntoFijoView();
        setCurrentView(puntoFijoView);
    }//GEN-LAST:event_puntoFijoMenuItemActionPerformed

    private void raicesMultiplesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raicesMultiplesMenuItemActionPerformed
        raicesMultiplesView = new RaicesMultiplesView();
        setCurrentView(raicesMultiplesView);
    }//GEN-LAST:event_raicesMultiplesMenuItemActionPerformed

    private void secanteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secanteMenuItemActionPerformed
        secanteView = new SecanteView();
        setCurrentView(secanteView);
    }//GEN-LAST:event_secanteMenuItemActionPerformed

    private void newtonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtonMenuItemActionPerformed
         newtonView = new NewtonView();
        setCurrentView(newtonView);
    }//GEN-LAST:event_newtonMenuItemActionPerformed

    private void eliminacionGaussianaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminacionGaussianaMenuItemActionPerformed
        eliminacionGaussianaView = new EliminacionGaussianaView();
        setCurrentView(eliminacionGaussianaView);
    }//GEN-LAST:event_eliminacionGaussianaMenuItemActionPerformed

    private void reglaFalsaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglaFalsaMenuItemActionPerformed
        reglaFalsaView = new ReglaFalsaView();
        setCurrentView(reglaFalsaView);
    }//GEN-LAST:event_reglaFalsaMenuItemActionPerformed

    private void busquedasIncrementalesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedasIncrementalesMenuItemActionPerformed
        busquedasIncrementalesView = new BusquedasIncrementalesView();
        setCurrentView(busquedasIncrementalesView);
    }//GEN-LAST:event_busquedasIncrementalesMenuItemActionPerformed
   
  
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem biseccionMenuItem;
    private javax.swing.JMenuItem busquedasIncrementalesMenuItem;
    private javax.swing.JMenuItem eliminacionGaussianaMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem newtonMenuItem;
    private javax.swing.JMenu noLinealesMenuItem;
    private javax.swing.JMenuItem puntoFijoMenuItem;
    private javax.swing.JMenuItem raicesMultiplesMenuItem;
    private javax.swing.JMenuItem reglaFalsaMenuItem;
    private javax.swing.JMenuItem secanteMenuItem;
    // End of variables declaration//GEN-END:variables
}