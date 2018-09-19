package Views.NoLineales;

import Model.FunctionEvaluator;
import Model.NumberInputValidator;
import Controllers.PuntoFijoController;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class PuntoFijoView extends javax.swing.JPanel {

    /**
     * Creates new form PuntoFlotanteView
     */
    
    public PuntoFijoView() {
        initComponents();
    }
    
    
    public String getValorInicial() {
        return initialValueTextField.getText();
    }

    public String getFuncionF() {
        return funtionFTextField.getText();
    }

    public String getTolerancia() {
        return toleranceTextField.getText();
    }

    public String getIteraciones() {
        return iterationTextField.getText();
    }
    
    public String getFuncionG() {
        return funtionGTextField.getText();
    }

    public void setInfoMessage(String message){
        infoTextField.setText(message);
    }
    public DefaultTableModel getTableModel(){
        return (DefaultTableModel)jTable1.getModel();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        helpButton = new javax.swing.JButton();
        toGoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        infoTextField = new javax.swing.JTextField();
        funtionFTextField = new javax.swing.JTextField();
        funtionGTextField = new javax.swing.JTextField();
        initialValueTextField = new javax.swing.JTextField();
        toleranceTextField = new javax.swing.JTextField();
        iterationTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Waseem", 0, 36)); // NOI18N
        jLabel1.setText("Punto Fijo");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel2.setText("Funtion f");

        jLabel3.setText("Funtion g");

        jLabel4.setText("Initial Value");

        jLabel5.setText("Tolerance");

        jLabel6.setText("Iteration");

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        toGoButton.setText("To go");
        toGoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGoButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Iterations", "Xn", "F(Xn)", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        infoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoTextFieldActionPerformed(evt);
            }
        });

        funtionFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funtionFTextFieldActionPerformed(evt);
            }
        });

        funtionGTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funtionGTextFieldActionPerformed(evt);
            }
        });

        initialValueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialValueTextFieldActionPerformed(evt);
            }
        });

        toleranceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleranceTextFieldActionPerformed(evt);
            }
        });

        iterationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iterationTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(initialValueTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(funtionGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(funtionFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(helpButton)
                        .addGap(42, 42, 42)
                        .addComponent(toGoButton)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iterationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(toleranceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(180, 180, 180))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addComponent(infoTextField))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(funtionFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toleranceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(funtionGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(helpButton)
                    .addComponent(toGoButton)
                    .addComponent(initialValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(infoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void funtionFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funtionFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funtionFTextFieldActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void toGoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGoButtonActionPerformed
        getTableModel().setRowCount(0);
        infoTextField.setToolTipText("");
        FunctionEvaluator fe = new FunctionEvaluator(funtionFTextField.getText());
        FunctionEvaluator fe = new FunctionEvaluator(funtionGTextField.getText());
        if(fe.isValid(initialValueTextField.getText())){
            PuntoFijoController puntoFijoController = new PuntoFijoController(this);
            puntoFijoController.calcular();
        }else{
            setInfoMessage("la funcion no es valida.");
        }
        
                                            

    }//GEN-LAST:event_toGoButtonActionPerformed

    private void iterationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iterationTextFieldActionPerformed
        NumberInputValidator.validate(evt);
    }//GEN-LAST:event_iterationTextFieldActionPerformed

    private void toleranceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleranceTextFieldActionPerformed
        NumberInputValidator.validate(evt);
    }//GEN-LAST:event_toleranceTextFieldActionPerformed

    private void funtionGTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funtionGTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funtionGTextFieldActionPerformed

    private void initialValueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialValueTextFieldActionPerformed
        NumberInputValidator.validate(evt);
    }//GEN-LAST:event_initialValueTextFieldActionPerformed

    private void infoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField funtionFTextField;
    private javax.swing.JTextField funtionGTextField;
    private javax.swing.JButton helpButton;
    private javax.swing.JTextField infoTextField;
    private javax.swing.JTextField initialValueTextField;
    private javax.swing.JTextField iterationTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton toGoButton;
    private javax.swing.JTextField toleranceTextField;
    // End of variables declaration//GEN-END:variables
}
