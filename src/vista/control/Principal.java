package vista.control;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.backup.Visual;
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
        
        jpPrincipal.setVisible(true);
        jpOpciones.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpOpciones = new javax.swing.JPanel();
        btnPersona = new javax.swing.JButton();
        btnPlato = new javax.swing.JButton();
        btnMesa = new javax.swing.JButton();
        btnSucursal = new javax.swing.JButton();
        btnUbigeo = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jpTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setBackground(new java.awt.Color(102, 255, 102));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(700, 600));
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/senal-de-trafico.png"))); // NOI18N
        jpPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 50, -1, 449));

        jPanel1.add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 700, 600));

        jpBotones.setBackground(new java.awt.Color(0, 204, 255));
        jpBotones.setForeground(new java.awt.Color(102, 255, 102));
        jpBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jpBotones.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 81, 70));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Users_32x32.png"))); // NOI18N
        jButton1.setText("Registros");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpBotones.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 81, 70));

        jButton2.setText("Backup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpBotones.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 70));

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 600));

        jpOpciones.setBackground(new java.awt.Color(153, 153, 255));
        jpOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cliente_32x32.png"))); // NOI18N
        btnPersona.setText("Persona");
        btnPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonaActionPerformed(evt);
            }
        });
        jpOpciones.add(btnPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, 100));

        btnPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plato-de-servir.png"))); // NOI18N
        btnPlato.setText("Platos");
        btnPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatoActionPerformed(evt);
            }
        });
        jpOpciones.add(btnPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 110, 100));

        btnMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubiertos.png"))); // NOI18N
        btnMesa.setText("Mesa");
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });
        jpOpciones.add(btnMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 110, 100));

        btnSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial-medico.png"))); // NOI18N
        btnSucursal.setText("Sucursal");
        btnSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalActionPerformed(evt);
            }
        });
        jpOpciones.add(btnSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 110, 100));

        btnUbigeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportar(2).png"))); // NOI18N
        btnUbigeo.setText("Ubigeo");
        btnUbigeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbigeoActionPerformed(evt);
            }
        });
        jpOpciones.add(btnUbigeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 100));

        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sala_32x32.png"))); // NOI18N
        btnHorario.setText("Horario");
        btnHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioActionPerformed(evt);
            }
        });
        jpOpciones.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 110, 100));

        jLabel3.setFont(new java.awt.Font("GREETHING BLOCK SHADOW LINE", 0, 60)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar ");
        jpOpciones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 450, 60));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jpOpciones.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 650, 70));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jpOpciones.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 140, 50));

        jPanel1.add(jpOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 700, 600));

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
        PlatosV platos = null;
        try {
            platos = new PlatosV();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        platos.setVisible(true);
        platos.setLocationRelativeTo(null);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jpOpciones.setVisible(true);
        jpPrincipal.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
       jpPrincipal.setVisible(true);
       jpOpciones.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Visual().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnPersona;
    private javax.swing.JButton btnPlato;
    private javax.swing.JButton btnSucursal;
    private javax.swing.JButton btnUbigeo;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpOpciones;
    public static javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpTitulo;
    // End of variables declaration//GEN-END:variables
}
