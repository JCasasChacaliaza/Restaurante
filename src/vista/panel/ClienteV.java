/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.panel;

import java.util.logging.Level;
import java.util.logging.Logger;
import vista.tabla.PersonaVT;

/**
 *
 * @author Usuario
 */
public class ClienteV extends javax.swing.JFrame {

    /**
     * Creates new form ClienteV
     */
    public ClienteV() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jpCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClienV = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFechCLV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNDocCliV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRucCliV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        jbAgregarCliV = new javax.swing.JButton();
        jbCancelarCliV = new javax.swing.JButton();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCliente.setBackground(new java.awt.Color(204, 255, 255));
        jpCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jpCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("RUC");
        jpCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));
        jpCliente.add(txtClienV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 30));

        btnBuscarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plato-de-servir.png"))); // NOI18N
        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });
        jpCliente.add(btnBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("N° de Documento:");
        jpCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 20));
        jpCliente.add(txtFechCLV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha:");
        jpCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 70, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comprobante", "BOLETA", "FACTURA" }));
        jpCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo de comprobante:");
        jpCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 60, -1, 20));
        jpCliente.add(txtNDocCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cliente:");
        jpCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 20));
        jpCliente.add(txtRucCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 30));

        jPanel1.add(jpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 630, 180));

        jLabel6.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 24)); // NOI18N
        jLabel6.setText("Datos de Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        jpBotones.setBackground(new java.awt.Color(204, 255, 204));
        jpBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 0), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(51, 51, 0)));
        jpBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAgregarCliV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jbAgregarCliV.setText("Agregar");
        jbAgregarCliV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarCliVActionPerformed(evt);
            }
        });
        jpBotones.add(jbAgregarCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 50));

        jbCancelarCliV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/error.png"))); // NOI18N
        jbCancelarCliV.setText("Cancelar");
        jpBotones.add(jbCancelarCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 50));

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 140, 490));

        jpTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jpTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 590, 230));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tabla Pedido");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpTabla.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        jPanel1.add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 610, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarCliVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarCliVActionPerformed
        PersonaV personaV = null;
        try {
            personaV = new PersonaV();
        } catch (Exception ex) {
            Logger.getLogger(ClienteV.class.getName()).log(Level.SEVERE, null, ex);
        }
        personaV.setVisible(true);
        personaV.setDefaultCloseOperation(personaV.HIDE_ON_CLOSE);

    }//GEN-LAST:event_jbAgregarCliVActionPerformed

    private void btnBuscarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliActionPerformed
         PersonaVT persona = null;
        try {
            persona = new PersonaVT();
        } catch (Exception ex) {
            Logger.getLogger(ClienteV.class.getName()).log(Level.SEVERE, null, ex);
        }
         persona.setVisible(true);
         persona.setDefaultCloseOperation(persona.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnBuscarCliActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAgregarCliV;
    private javax.swing.JButton jbCancelarCliV;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JTextField txtClienV;
    private javax.swing.JTextField txtFechCLV;
    private javax.swing.JTextField txtNDocCliV;
    private javax.swing.JTextField txtRucCliV;
    // End of variables declaration//GEN-END:variables
}
