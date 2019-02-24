package vista.control;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.panel.HorarioV;
import vista.panel.MesaV;
import vista.panel.PersonaV;
import vista.panel.PlatosV;
import vista.panel.SucursalV;

import vista.panel.UbigeoView;
import vista.panel.VentaV;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnSucursal = new javax.swing.JButton();
        btnMesa = new javax.swing.JButton();
        btnPlato = new javax.swing.JButton();
        btnPersona = new javax.swing.JButton();
        btnUbigeo = new javax.swing.JButton();
        jpTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setBackground(new java.awt.Color(102, 255, 102));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/senal-de-trafico.png"))); // NOI18N

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(76, 76, 76))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jPanel1.add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 700, 600));

        jpBotones.setBackground(new java.awt.Color(0, 204, 255));
        jpBotones.setForeground(new java.awt.Color(102, 255, 102));

        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnHorario.setText("Horario");
        btnHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioActionPerformed(evt);
            }
        });

        btnSucursal.setText("Sucursal");
        btnSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalActionPerformed(evt);
            }
        });

        btnMesa.setText("Mesa");
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });

        btnPlato.setText("Platos");
        btnPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatoActionPerformed(evt);
            }
        });

        btnPersona.setText("Persona");
        btnPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonaActionPerformed(evt);
            }
        });

        btnUbigeo.setText("Ubigeo");
        btnUbigeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbigeoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnPlato, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnUbigeo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(btnSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addComponent(btnPersona)
                .addGap(8, 8, 8)
                .addComponent(btnPlato)
                .addGap(8, 8, 8)
                .addComponent(btnMesa)
                .addGap(8, 8, 8)
                .addComponent(btnSucursal)
                .addGap(8, 8, 8)
                .addComponent(btnVenta)
                .addGap(8, 8, 8)
                .addComponent(btnUbigeo)
                .addGap(8, 8, 8)
                .addComponent(btnHorario)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 340));

        jpTitulo.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("GREETHING", 0, 57)); // NOI18N
        jLabel1.setText("Sistema de Restaurante");

        javax.swing.GroupLayout jpTituloLayout = new javax.swing.GroupLayout(jpTitulo);
        jpTitulo.setLayout(jpTituloLayout);
        jpTituloLayout.setHorizontalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
        );
        jpTituloLayout.setVerticalGroup(
            jpTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jpTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonaActionPerformed
        PersonaV persona = null;
        try {
            persona = new PersonaV();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        persona.setVisible(true);
        persona.setDefaultCloseOperation(persona.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnPersonaActionPerformed

    private void btnPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatoActionPerformed
        PlatosV platos = new PlatosV();
        platos.setVisible(true);
        platos.setDefaultCloseOperation(platos.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnPlatoActionPerformed

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
        MesaV mesa = new MesaV();
        mesa.setVisible(true);
        mesa.setDefaultCloseOperation(mesa.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalActionPerformed
        SucursalV sucursal = new SucursalV();
        sucursal.setVisible(true);
        sucursal.setDefaultCloseOperation(sucursal.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnSucursalActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        VentaV venta = new VentaV();
        venta.setVisible(true);
        venta.setDefaultCloseOperation(venta.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnUbigeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbigeoActionPerformed

        UbigeoView ubigeo = new UbigeoView();
        ubigeo.setSize(700, 600);
        ubigeo.setLocation(0, 0);
        jpPrincipal.removeAll();
        jpPrincipal.add(ubigeo, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();

    }//GEN-LAST:event_btnUbigeoActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        HorarioV horario = new HorarioV();
        horario.setVisible(true);
        horario.setDefaultCloseOperation(horario.HIDE_ON_CLOSE);


    }//GEN-LAST:event_btnHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnPersona;
    private javax.swing.JButton btnPlato;
    private javax.swing.JButton btnSucursal;
    private javax.swing.JButton btnUbigeo;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpBotones;
    public static javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    // End of variables declaration//GEN-END:variables
}
