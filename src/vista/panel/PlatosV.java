package vista.panel;

//import vista.control.Principal;

import dao.impl.PlatoImpl;
import javax.swing.table.DefaultTableModel;


public class PlatosV extends javax.swing.JFrame {
    
    public static DefaultTableModel modeloTabla;
    public int tipo = 1 ;
    public String dato;
    PlatoImpl dao ;
    private int codigoPlato;
    
    

    public PlatosV() {
        initComponents();
        grupo_Platos.add(jrbNombrePlato);
        grupo_Platos.add(jrbDescrPlato);
        grupo_Platos.add(jrbTipPlat);
        cargar_Tabla();
        
    }

    private void cargar_Tabla()throws Exception{
        String columna[] = new String[]{"Codigo", "Nombre", "Descripcion","Tipo de Plato", "Precios", "Estado"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PlatoImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tabla_Platos.setModel(modeloTabla);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_Platos = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboxEstadoPlato = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNomPlat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecPlat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDescPlat3 = new javax.swing.JTextField();
        jcbxTipoPlat = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnEliminarPla = new javax.swing.JButton();
        btnModificarPla = new javax.swing.JButton();
        btnGuardarPla = new javax.swing.JButton();
        btnNuevoPla = new javax.swing.JButton();
        jpLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Platos = new javax.swing.JTable();
        jrbNombrePlato = new javax.swing.JRadioButton();
        jrbDescrPlato = new javax.swing.JRadioButton();
        jchkTodoPlato = new javax.swing.JCheckBox();
        jrbTipPlat = new javax.swing.JRadioButton();
        txtDatosPlatos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("GREETHING", 0, 57)); // NOI18N
        jLabel1.setText("Platos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 160, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(255, 102, 51), null, null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setForeground(new java.awt.Color(204, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setText("Estado");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        cboxEstadoPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado del Plato", "Disponible", "No Disponible" }));
        jPanel3.add(cboxEstadoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 50));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 40));
        jPanel4.add(txtNomPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel6.setText("Tipo");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 150, 40));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setText("Precio");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 40));
        jPanel4.add(txtPrecPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 250, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel8.setText("Descripcion");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 40));
        jPanel4.add(txtDescPlat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 250, -1));

        jcbxTipoPlat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Plato", "Postres", "Entrada", "Segundo", "Fondo" }));
        jPanel4.add(jcbxTipoPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 250, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 530, 290));

        jPanel5.setBackground(new java.awt.Color(153, 153, 0));

        btnEliminarPla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restaurante.png"))); // NOI18N
        btnEliminarPla.setText("Eliminar");

        btnModificarPla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reanudar.png"))); // NOI18N
        btnModificarPla.setText("Modificar");

        btnGuardarPla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sobre.png"))); // NOI18N
        btnGuardarPla.setText("Guardar");
        btnGuardarPla.setPreferredSize(new java.awt.Dimension(64, 64));

        btnNuevoPla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnNuevoPla.setText("Nuevo");
        btnNuevoPla.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoPla, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarPla, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarPla, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarPla, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoPla, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnGuardarPla, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnModificarPla)
                .addGap(2, 2, 2)
                .addComponent(btnEliminarPla)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 140, 290));

        jpLista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 3, true));
        jpLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_Platos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_Platos);

        jpLista.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 660, 170));

        jrbNombrePlato.setText("Nombre Plato");
        jpLista.add(jrbNombrePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jrbDescrPlato.setText("Descripcion");
        jpLista.add(jrbDescrPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jchkTodoPlato.setText("Todo");
        jchkTodoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkTodoPlatoActionPerformed(evt);
            }
        });
        jpLista.add(jchkTodoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jrbTipPlat.setText("Tipo de Plato");
        jpLista.add(jrbTipPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));
        jpLista.add(txtDatosPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 200, 30));

        jPanel2.add(jpLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 680, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jchkTodoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkTodoPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchkTodoPlatoActionPerformed

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
            java.util.logging.Logger.getLogger(PlatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlatosV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlatosV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEliminarPla;
    public static javax.swing.JButton btnGuardarPla;
    public static javax.swing.JButton btnModificarPla;
    public static javax.swing.JButton btnNuevoPla;
    public static javax.swing.JComboBox<String> cboxEstadoPlato;
    private javax.swing.ButtonGroup grupo_Platos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<String> jcbxTipoPlat;
    private javax.swing.JCheckBox jchkTodoPlato;
    private javax.swing.JPanel jpLista;
    private javax.swing.JRadioButton jrbDescrPlato;
    private javax.swing.JRadioButton jrbNombrePlato;
    private javax.swing.JRadioButton jrbTipPlat;
    public static javax.swing.JTable tabla_Platos;
    private javax.swing.JTextField txtDatosPlatos;
    public static javax.swing.JTextField txtDescPlat3;
    public static javax.swing.JTextField txtNomPlat;
    public static javax.swing.JTextField txtPrecPlat;
    // End of variables declaration//GEN-END:variables
}
