package vista.panel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.tabla.PersonaVT;

public class ClienteV extends javax.swing.JFrame {

        DefaultTableModel m ;
        static double total;
        double sub_total;
        double igv;                
        
        
    public ClienteV() {
        initComponents();
        this.setLocationRelativeTo(null);
        total = 0;
        sub_total = 0.0;
        igv = 0.0;
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPedidoC = new javax.swing.JDialog();
        jpTablaPedido = new javax.swing.JPanel();
        jrTipPlatP = new javax.swing.JRadioButton();
        jchkTodosPedidos = new javax.swing.JCheckBox();
        txtTodosPed = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_pedido = new javax.swing.JTable();
        btnAgregarPedido = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtCantPed = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jpCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellClienV = new javax.swing.JTextField();
        btnBuscarCli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFechCLV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNDocCliV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDirCliV = new javax.swing.JTextField();
        txtNomClienV1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRucCliV1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        jbAgregarCliV = new javax.swing.JButton();
        jbCancelarCliV = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnPedidoC = new javax.swing.JButton();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jpTablaPedido.setBackground(new java.awt.Color(153, 153, 255));
        jpTablaPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrTipPlatP.setText("Tipo de Platos");
        jpTablaPedido.add(jrTipPlatP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, 30));

        jchkTodosPedidos.setText("Todos");
        jpTablaPedido.add(jchkTodosPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 30));
        jpTablaPedido.add(txtTodosPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 30));

        tabla_pedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabla_pedido);

        jpTablaPedido.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 540, 190));

        btnAgregarPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btnAgregarPedido.setText("Agregar Pedido");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });
        jpTablaPedido.add(btnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 170, 40));
        jpTablaPedido.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 540, 10));

        jLabel9.setText("Cantidad:");
        jpTablaPedido.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, 20));
        jpTablaPedido.add(txtCantPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, -1));

        javax.swing.GroupLayout jdPedidoCLayout = new javax.swing.GroupLayout(jdPedidoC.getContentPane());
        jdPedidoC.getContentPane().setLayout(jdPedidoCLayout);
        jdPedidoCLayout.setHorizontalGroup(
            jdPedidoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTablaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jdPedidoCLayout.setVerticalGroup(
            jdPedidoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdPedidoCLayout.createSequentialGroup()
                .addComponent(jpTablaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpCliente.setBackground(new java.awt.Color(204, 255, 255));
        jpCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jpCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Direccion");
        jpCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));
        jpCliente.add(txtApellClienV, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, 30));

        btnBuscarCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plato-de-servir.png"))); // NOI18N
        btnBuscarCli.setText("Buscar");
        btnBuscarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliActionPerformed(evt);
            }
        });
        jpCliente.add(btnBuscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("N° de Documento:");
        jpCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 20));
        jpCliente.add(txtFechCLV, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha:");
        jpCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 60, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comprobante", "BOLETA", "FACTURA" }));
        jpCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo de comprobante:");
        jpCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 20));
        jpCliente.add(txtNDocCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cliente:");
        jpCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 20));
        jpCliente.add(txtDirCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));
        jpCliente.add(txtNomClienV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("RUC");
        jpCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));
        jpCliente.add(txtRucCliV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 30));

        jPanel1.add(jpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 200));

        jLabel6.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 24)); // NOI18N
        jLabel6.setText("Datos de Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        jpBotones.setBackground(new java.awt.Color(204, 255, 204));
        jpBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 0), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(51, 51, 0)));
        jpBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbAgregarCliV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jbAgregarCliV.setText("Cliente");
        jbAgregarCliV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarCliVActionPerformed(evt);
            }
        });
        jpBotones.add(jbAgregarCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 50));

        jbCancelarCliV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/error.png"))); // NOI18N
        jbCancelarCliV.setText("Cancelar");
        jbCancelarCliV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCliVActionPerformed(evt);
            }
        });
        jpBotones.add(jbCancelarCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 50));

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        btnVenta.setText("Grabar Venta");
        jpBotones.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, 60));

        btnPedidoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubiertos.png"))); // NOI18N
        btnPedidoC.setText("Pedido");
        btnPedidoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoCActionPerformed(evt);
            }
        });
        jpBotones.add(btnPedidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 50));

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 140, 490));

        jpTabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jpTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_venta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_venta);

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 640, 230));

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
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpTabla.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        jPanel1.add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 650, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
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

    private void jbCancelarCliVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCliVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarCliVActionPerformed

    private void btnPedidoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoCActionPerformed
            jdPedidoC.setSize(660, 440);
            jdPedidoC.setLocationRelativeTo(null);
            jdPedidoC.setModal(true);
            jdPedidoC.setVisible(true);
            
    }//GEN-LAST:event_btnPedidoCActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        int fila = tabla_pedido.getSelectedRow();
        try {
            String codigo, descripcion, tipo, precio ,estado, cant, importe;
            double calcula = 0.0 , x= 0.0, igvs = 0.0 ;
            int cantidad = 0;
            
            if(fila==-1){
                JOptionPane.showMessageDialog(null, "Debe Seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE  );
            }else{
                m = (DefaultTableModel) tabla_pedido.getModel();
                codigo = tabla_pedido.getValueAt(fila, 0 ).toString();
                descripcion = tabla_pedido.getValueAt(fila, 1).toString();
                tipo = tabla_pedido.getValueAt(fila, 2).toString();
                precio = tabla_pedido.getValueAt(fila,3).toString();
                estado= tabla_pedido.getValueAt(fila, 4).toString();
                cant = txtCantPed.getText();
                
                x= (Double.parseDouble(precio)* Integer.parseInt(cant));
                importe = String.valueOf(x);
                
            }
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

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
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnPedidoC;
    public static javax.swing.JButton btnVenta;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JButton jbAgregarCliV;
    public static javax.swing.JButton jbCancelarCliV;
    private javax.swing.JCheckBox jchkTodosPedidos;
    private javax.swing.JDialog jdPedidoC;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JPanel jpTablaPedido;
    private javax.swing.JRadioButton jrTipPlatP;
    private javax.swing.JTable tabla_pedido;
    private javax.swing.JTable tabla_venta;
    public static javax.swing.JTextField txtApellClienV;
    private javax.swing.JTextField txtCantPed;
    public static javax.swing.JTextField txtDirCliV;
    public static javax.swing.JTextField txtFechCLV;
    public static javax.swing.JTextField txtNDocCliV;
    public static javax.swing.JTextField txtNomClienV1;
    public static javax.swing.JTextField txtRucCliV1;
    private javax.swing.JTextField txtTodosPed;
    // End of variables declaration//GEN-END:variables
}
