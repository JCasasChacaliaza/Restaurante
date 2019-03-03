package vista.panel;

import control.PersonaC;
import dao.impl.PersonaImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import vista.control.Principal;

public class PersonaV extends javax.swing.JFrame {

    public static DefaultTableModel modeloTabla;
    public int tipo = 1;
    public String dato;
    PersonaImpl dao;
    //PersonaC personaC;
    private int codigoPersona;

    public PersonaV() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGroupPersona.add(jrNombreP);
        btnGroupPersona.add(jrApellP);
        cargar_Tabla();

    }

    

    private void cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Codigo", "Nombre", "Apellido", "Documento", "Direccion", "Tipo de Persona", "Usuario", "Contraseña"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PersonaImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tblPersona.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPersona = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpCRUD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        boxDoc = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtPassCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jboxTipUsuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDirecc1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUsuarCli = new javax.swing.JTextField();
        jpLista = new javax.swing.JPanel();
        jrNombreP = new javax.swing.JRadioButton();
        jrApellP = new javax.swing.JRadioButton();
        chkTodosP = new javax.swing.JCheckBox();
        txtDatosP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        jpBonones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnModificarRegis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("GREETHING", 0, 57)); // NOI18N
        jLabel5.setText("Formulario Persona");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 340, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        jpCRUD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 19)); // NOI18N
        jLabel1.setText("Nombre");
        jpCRUD.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 36));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 19)); // NOI18N
        jLabel2.setText("Password");
        jpCRUD.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 20));

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });
        jpCRUD.add(txtDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 160, 30));

        boxDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        boxDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxDocActionPerformed(evt);
            }
        });
        jpCRUD.add(boxDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 90, 30));
        jpCRUD.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, 30));

        txtPassCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassCliActionPerformed(evt);
            }
        });
        jpCRUD.add(txtPassCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 19)); // NOI18N
        jLabel6.setText("Apellido");
        jpCRUD.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 102, 20));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jpCRUD.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 180, 30));

        jboxTipUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipos de Usuarios", "Cliente", "Administrador", "Mozo", "Cajero" }));
        jboxTipUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxTipUsuarioActionPerformed(evt);
            }
        });
        jpCRUD.add(jboxTipUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 19)); // NOI18N
        jLabel7.setText("Direccion");
        jpCRUD.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 102, 20));
        jpCRUD.add(txtDirecc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 19)); // NOI18N
        jLabel8.setText("Usuario");
        jpCRUD.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));
        jpCRUD.add(txtUsuarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 180, 30));

        jPanel1.add(jpCRUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 650, 230));

        jpLista.setBackground(new java.awt.Color(153, 153, 153));
        jpLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrNombreP.setText("Nombre");
        jrNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNombrePActionPerformed(evt);
            }
        });
        jpLista.add(jrNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        jrApellP.setText("Apellido");
        jrApellP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrApellPActionPerformed(evt);
            }
        });
        jpLista.add(jrApellP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, 30));

        chkTodosP.setText("Todos");
        chkTodosP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosPActionPerformed(evt);
            }
        });
        jpLista.add(chkTodosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, 30));

        txtDatosP.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDatosPCaretUpdate(evt);
            }
        });
        txtDatosP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosPActionPerformed(evt);
            }
        });
        jpLista.add(txtDatosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, 30));

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersona);

        jpLista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 640, 150));

        jPanel1.add(jpLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 660, 260));

        jpBonones.setBackground(new java.awt.Color(153, 102, 0));
        jpBonones.setForeground(new java.awt.Color(204, 102, 0));
        jpBonones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setPreferredSize(new java.awt.Dimension(64, 64));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jpBonones.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 48));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sobre.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(64, 64));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jpBonones.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 48));
        btnGuardar.getAccessibleContext().setAccessibleDescription("");

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restaurante.png"))); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        jpBonones.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 120, -1));

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubiertos.png"))); // NOI18N
        btnPedido.setText("Pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        jpBonones.add(btnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 120, 48));

        btnModificarRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reanudar.png"))); // NOI18N
        btnModificarRegis.setText("Modificar");
        btnModificarRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegisActionPerformed(evt);
            }
        });
        jpBonones.add(btnModificarRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, -1));

        jPanel1.add(jpBonones, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxDocActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        VentaV venta = new VentaV();
        venta.setVisible(true);
        venta.setDefaultCloseOperation(venta.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            PersonaC personaC = new PersonaC();
            personaC.variable();
            personaC.registrarPersona();
            cargar_Tabla();
        } catch (Exception e) {
            System.out.println("Error en el btnGuardar" + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        PersonaC personaC = new PersonaC();
        btnGuardar.setEnabled(true);
        btnModificarRegis.setEnabled(false);
        btnEliminar1.setEnabled(false);
        personaC.limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jrNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNombrePActionPerformed
        tipo = 2 ;
        chkTodosP.setSelected(false);
    }//GEN-LAST:event_jrNombrePActionPerformed

    private void jrApellPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrApellPActionPerformed
        tipo = 3 ;
        chkTodosP.setSelected(false);
    }//GEN-LAST:event_jrApellPActionPerformed

    private void chkTodosPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTodosPActionPerformed
        try {
            if (chkTodosP.isSelected() == true) {
                btnGroupPersona.clearSelection();
                tipo = 1;
                cargar_Tabla();
                txtDatosP.setText("");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_chkTodosPActionPerformed

    private void tblPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonaMouseClicked
        try {
            int fila = tblPersona.getSelectedRow();
            if (fila >= 0) {
                codigoPersona = Integer.parseInt(tblPersona.getValueAt(fila, 0).toString());
                txtNombre.setText(tblPersona.getValueAt(fila, 1).toString());
                txtApellido.setText(tblPersona.getValueAt(fila, 2).toString());
                txtDoc.setText(tblPersona.getValueAt(fila, 3).toString());
                txtDirecc1.setText(tblPersona.getValueAt(fila, 4).toString());
                jboxTipUsuario.setSelectedItem(tblPersona.getValueAt(fila, 5).toString());
                txtUsuarCli.setText(tblPersona.getValueAt(fila, 6).toString());
                txtPassCli.setText(tblPersona.getValueAt(fila, 7).toString());
                btnEliminar1.setEnabled(true);
                btnGuardar.setEnabled(false);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tblPersonaMouseClicked

    private void btnModificarRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegisActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(null, "Desea Modificar", "Modificación del Registro", JOptionPane.OK_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                PersonaC personaC = new PersonaC();
                personaC.getPersona().setCodPer(codigoPersona);
                personaC.variable();
                personaC.modificarPersona();
                cargar_Tabla();
                JOptionPane.showMessageDialog(null, "Registro modificado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarRegisActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        try {
            int fila = tblPersona.getSelectedRow();
            if (fila >= 0) {
                int option = JOptionPane.showConfirmDialog(null, "Deseas eliminar?", "Eliminacion de registro", JOptionPane.OK_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    codigoPersona = Integer.parseInt(tblPersona.getValueAt(fila, 0).toString());
                    PersonaC personaC = new PersonaC();
                    personaC.variable();
                    personaC.getPersona().setCodPer(codigoPersona);
                    personaC.eliminarPersona();
                    cargar_Tabla();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void txtDatosPCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDatosPCaretUpdate
        try {
            dato = txtDatosP.getText();
            cargar_Tabla();
        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_txtDatosPCaretUpdate

    private void txtDatosPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatosPActionPerformed

    private void jboxTipUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxTipUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxTipUsuarioActionPerformed

    private void txtPassCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassCliActionPerformed

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
            java.util.logging.Logger.getLogger(PersonaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PersonaV().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(PersonaV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> boxDoc;
    public static javax.swing.JButton btnEliminar1;
    private javax.swing.ButtonGroup btnGroupPersona;
    public static javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnModificarRegis;
    public static javax.swing.JButton btnNuevo;
    public static javax.swing.JButton btnPedido;
    private javax.swing.JCheckBox chkTodosP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<String> jboxTipUsuario;
    private javax.swing.JPanel jpBonones;
    private javax.swing.JPanel jpCRUD;
    public static javax.swing.JPanel jpLista;
    private javax.swing.JRadioButton jrApellP;
    private javax.swing.JRadioButton jrNombreP;
    private javax.swing.JTable tblPersona;
    public static javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDatosP;
    public static javax.swing.JTextField txtDirecc1;
    public static javax.swing.JTextField txtDoc;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtPassCli;
    public static javax.swing.JTextField txtUsuarCli;
    // End of variables declaration//GEN-END:variables
}
