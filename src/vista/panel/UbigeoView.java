package vista.panel;

import java.awt.BorderLayout;
import vista.control.Bienvenida;
import vista.control.Principal;
import static vista.control.Principal.jpPrincipal;

public class UbigeoView extends javax.swing.JPanel {

    public UbigeoView() {
        initComponents();
    }

    public UbigeoView(Principal aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodUbigeoV = new javax.swing.JTextField();
        txtProvUbigeoV = new javax.swing.JTextField();
        txtDeparUbigeoV = new javax.swing.JTextField();
        txtDistUbigeoV1 = new javax.swing.JTextField();
        btnNuevoHor = new javax.swing.JButton();
        btnPrincipalUbi = new javax.swing.JButton();
        btnModificarHor = new javax.swing.JButton();
        btnGuardarHor = new javax.swing.JButton();
        btnEliminarHor1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(60, 87, 193));

        jLabel1.setFont(new java.awt.Font("GREETHING", 1, 57)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ubigeo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 831, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 84, 107, 41));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Provincia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 135, 127, 41));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Departameto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 189, 155, 41));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Distrito");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 243, 99, 41));
        jPanel1.add(txtCodUbigeoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 88, 250, 41));
        jPanel1.add(txtProvUbigeoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 139, 250, 41));
        jPanel1.add(txtDeparUbigeoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 193, 250, 41));
        jPanel1.add(txtDistUbigeoV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 247, 250, 41));

        btnNuevoHor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnNuevoHor.setText("Nuevo");
        btnNuevoHor.setPreferredSize(new java.awt.Dimension(64, 64));
        jPanel1.add(btnNuevoHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 120, 48));

        btnPrincipalUbi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        btnPrincipalUbi.setText("Principal");
        btnPrincipalUbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalUbiActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrincipalUbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 120, 48));

        btnModificarHor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reanudar.png"))); // NOI18N
        btnModificarHor.setText("Modificar");
        jPanel1.add(btnModificarHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 120, 48));

        btnGuardarHor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sobre.png"))); // NOI18N
        btnGuardarHor.setText("Guardar");
        btnGuardarHor.setPreferredSize(new java.awt.Dimension(64, 64));
        jPanel1.add(btnGuardarHor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 120, 48));

        btnEliminarHor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restaurante.png"))); // NOI18N
        btnEliminarHor1.setText("Eliminar");
        btnEliminarHor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHor1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarHor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 120, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalUbiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalUbiActionPerformed

        Bienvenida bienvenida = new Bienvenida();
        bienvenida.setSize(700, 600);
        bienvenida.setLocation(0, 0);

        jpPrincipal.removeAll();
        jpPrincipal.add(bienvenida, BorderLayout.CENTER);
        jpPrincipal.revalidate();
        jpPrincipal.repaint();
    }//GEN-LAST:event_btnPrincipalUbiActionPerformed

    private void btnEliminarHor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarHor1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarHor1;
    private javax.swing.JButton btnGuardarHor;
    private javax.swing.JButton btnModificarHor;
    private javax.swing.JButton btnNuevoHor;
    private javax.swing.JButton btnPrincipalUbi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCodUbigeoV;
    private javax.swing.JTextField txtDeparUbigeoV;
    private javax.swing.JTextField txtDistUbigeoV1;
    private javax.swing.JTextField txtProvUbigeoV;
    // End of variables declaration//GEN-END:variables
}
