/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraOfertas;

/**
 *
 * @author kiuub
 */
public class FrameCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form FrameCalculadora
     */
    public FrameCalculadora() {
        initComponents();
        this.setSize(800, 700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSueldoAnual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSueldoMensual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSueldoMensual1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTotalPrestaciones = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAguinaldo = new javax.swing.JTextField();
        txtVacaciones = new javax.swing.JTextField();
        txtPrimaVacacional = new javax.swing.JTextField();
        txtInfonavit = new javax.swing.JTextField();
        txtIMSS = new javax.swing.JTextField();
        txtRCV = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSGMM = new javax.swing.JTextField();
        txtSGMMDep = new javax.swing.JTextField();
        txtVales = new javax.swing.JTextField();
        txtComedor = new javax.swing.JTextField();
        txtSVida = new javax.swing.JTextField();
        txtPersonalDays = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSickDays = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblTotalBofA = new javax.swing.JLabel();
        lblTotalBeneficios = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblTotalCompensacionMensual = new javax.swing.JLabel();
        txtBonusAnual = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculadora de ofertas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(295, 11, 243, 29);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("salario anual");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(23, 69, 80, 14);
        jPanel1.add(txtSueldoAnual);
        txtSueldoAnual.setBounds(120, 70, 96, 23);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("salario mensual");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 70, 100, 14);
        jPanel1.add(txtSueldoMensual);
        txtSueldoMensual.setBounds(340, 70, 96, 23);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dependientes");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 70, 100, 14);
        jPanel1.add(txtSueldoMensual1);
        txtSueldoMensual1.setBounds(570, 70, 96, 23);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Prima Vacacional");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 180, 100, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Vacaciones");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 150, 100, 14);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Aguinaldo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 120, 80, 14);

        lblTotalPrestaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPrestaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblTotalPrestaciones);
        lblTotalPrestaciones.setBounds(180, 300, 160, 23);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("IMSS");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 240, 100, 14);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Infonavit");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(90, 210, 80, 14);
        jPanel1.add(txtAguinaldo);
        txtAguinaldo.setBounds(180, 120, 96, 23);
        jPanel1.add(txtVacaciones);
        txtVacaciones.setBounds(180, 150, 96, 23);
        jPanel1.add(txtPrimaVacacional);
        txtPrimaVacacional.setBounds(180, 180, 96, 23);
        jPanel1.add(txtInfonavit);
        txtInfonavit.setBounds(180, 210, 96, 23);
        jPanel1.add(txtIMSS);
        txtIMSS.setBounds(180, 240, 96, 23);
        jPanel1.add(txtRCV);
        txtRCV.setBounds(180, 270, 96, 23);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("RCV ( Retiro Cecentia en edad)");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 270, 160, 14);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Total de prestaciones :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 300, 160, 14);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("SGMM");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 120, 80, 14);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("SGMM Dep");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(370, 150, 100, 14);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Vales");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(370, 180, 100, 14);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Comedor");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(390, 210, 80, 14);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("SVida");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(370, 240, 100, 14);

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("3 personal Days");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(310, 270, 160, 14);
        jPanel1.add(txtSGMM);
        txtSGMM.setBounds(480, 120, 96, 23);
        jPanel1.add(txtSGMMDep);
        txtSGMMDep.setBounds(480, 150, 96, 23);
        jPanel1.add(txtVales);
        txtVales.setBounds(480, 180, 96, 23);
        jPanel1.add(txtComedor);
        txtComedor.setBounds(480, 210, 96, 23);
        jPanel1.add(txtSVida);
        txtSVida.setBounds(480, 240, 96, 23);
        jPanel1.add(txtPersonalDays);
        txtPersonalDays.setBounds(480, 270, 96, 23);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("3 sick Days");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(310, 300, 160, 14);
        jPanel1.add(txtSickDays);
        txtSickDays.setBounds(480, 300, 96, 23);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Total de BofA :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(310, 330, 160, 14);

        lblTotalBofA.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalBofA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblTotalBofA);
        lblTotalBofA.setBounds(480, 330, 160, 23);

        lblTotalBeneficios.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalBeneficios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblTotalBeneficios);
        lblTotalBeneficios.setBounds(210, 390, 160, 23);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Total de Beneficios :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(40, 390, 160, 14);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Total de Compensaciones mensuales :");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(10, 420, 190, 14);

        lblTotalCompensacionMensual.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCompensacionMensual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblTotalCompensacionMensual);
        lblTotalCompensacionMensual.setBounds(210, 420, 160, 23);
        jPanel1.add(txtBonusAnual);
        txtBonusAnual.setBounds(540, 390, 96, 23);

        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblTotal);
        lblTotal.setBounds(500, 420, 160, 23);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Total :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(330, 430, 160, 14);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("bonus anual");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(370, 390, 160, 14);

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setToolTipText("Activar/Desactivar");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(580, 150, 20, 21);

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setToolTipText("Activar/Desactivar");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(580, 120, 20, 21);

        jRadioButton3.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton3.setToolTipText("Activar/Desactivar");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(580, 210, 20, 21);

        jRadioButton4.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton4.setToolTipText("Activar/Desactivar");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(580, 180, 20, 21);

        jRadioButton6.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton6.setToolTipText("Activar/Desactivar");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(580, 300, 20, 21);

        jRadioButton7.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton7.setToolTipText("Activar/Desactivar");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(580, 240, 20, 21);

        jRadioButton8.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButton8.setToolTipText("Activar/Desactivar");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(580, 270, 20, 21);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 800, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()==true){
        txtSGMM.setEnabled(false);
        txtSGMM.setText("0");
        }else{
            txtSGMM.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton1.isSelected()==true){
        txtSGMMDep.setEnabled(false);
        txtSGMMDep.setText("0");
        }else{
            txtSGMMDep.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton4.isSelected()==true){
        txtVales.setEnabled(false);
        txtVales.setText("0");
        }else{
            txtVales.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()==true){
        txtComedor.setEnabled(false);
        txtComedor.setText("0");
        }else{
            txtComedor.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton7.isSelected()==true){
        txtSVida.setEnabled(false);
        txtSVida.setText("0");
        }else{
            txtSVida.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton8.isSelected()==true){
        txtPersonalDays.setEnabled(false);
        txtPersonalDays.setText("0");
        }else{
            txtPersonalDays.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton6.isSelected()==true){
        txtSickDays.setEnabled(false);
        txtSickDays.setText("0");
        }else{
            txtSickDays.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalBeneficios;
    private javax.swing.JLabel lblTotalBofA;
    private javax.swing.JLabel lblTotalCompensacionMensual;
    private javax.swing.JLabel lblTotalPrestaciones;
    private javax.swing.JTextField txtAguinaldo;
    private javax.swing.JTextField txtBonusAnual;
    private javax.swing.JTextField txtComedor;
    private javax.swing.JTextField txtIMSS;
    private javax.swing.JTextField txtInfonavit;
    private javax.swing.JTextField txtPersonalDays;
    private javax.swing.JTextField txtPrimaVacacional;
    private javax.swing.JTextField txtRCV;
    private javax.swing.JTextField txtSGMM;
    private javax.swing.JTextField txtSGMMDep;
    private javax.swing.JTextField txtSVida;
    private javax.swing.JTextField txtSickDays;
    private javax.swing.JTextField txtSueldoAnual;
    private javax.swing.JTextField txtSueldoMensual;
    private javax.swing.JTextField txtSueldoMensual1;
    private javax.swing.JTextField txtVacaciones;
    private javax.swing.JTextField txtVales;
    // End of variables declaration//GEN-END:variables
}
