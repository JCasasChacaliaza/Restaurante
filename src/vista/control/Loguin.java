
package vista.control;

import javax.swing.JOptionPane;

public class Loguin extends javax.swing.JFrame {

    public Loguin() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrarLoguin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnInciarSesion = new javax.swing.JButton();
        pasContraLoguin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrarLoguin.setBackground(new java.awt.Color(204, 51, 0));
        btnCerrarLoguin.setForeground(new java.awt.Color(255, 51, 51));
        btnCerrarLoguin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/error.png"))); // NOI18N
        btnCerrarLoguin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrarLoguin.setBorderPainted(false);
        btnCerrarLoguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarLoguinActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarLoguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 50, 50));

        jLabel1.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 50));

        jLabel2.setFont(new java.awt.Font("Geometr212 BkCn BT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 170, 40));

        btnInciarSesion.setBackground(new java.awt.Color(0, 0, 204));
        btnInciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnInciarSesion.setText("Iniciar sesión");
        btnInciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInciarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(btnInciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 30));
        jPanel1.add(pasContraLoguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarLoguinActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_btnCerrarLoguinActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
            
         
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnInciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInciarSesionMouseClicked
        
        String Usuario = "admin";
        String Contra = "123";

        String Pass = new  String (pasContraLoguin.getPassword());
        
        if (txtUsuario.getText().equals(Usuario)&& Pass.equals(Contra)){
            Principal p = new Principal();
            p.setVisible(true);
            dispose();                    
}    else
           JOptionPane.showMessageDialog(this ,"Usuario o contraseña incorrecto");
            
    }//GEN-LAST:event_btnInciarSesionMouseClicked
    
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
            java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loguin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarLoguin;
    private javax.swing.JButton btnInciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pasContraLoguin;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
