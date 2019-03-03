package vista.panel;

import dao.impl.PlatoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.panel.PlatosV.modeloTabla;
import static vista.panel.PlatosV.tabla_Platos;
import vista.tabla.PersonaVT;


public class ClienteV extends javax.swing.JFrame {

    static double total;
    double sub_total;
    double igv;

    DefaultTableModel m;
    public static DefaultTableModel modeloTabla2;
    
    public int tipo = 1;
    public String dato;
    PlatoImpl dao;
    private int codigoPlato;

    public ClienteV() throws Exception {
        initComponents();
        cargar_Tabla();
        grupo_Platos.add(jrbNombrePlato);
        grupo_Platos.add(jrbDescrPlato);
        grupo_Platos.add(jrbTipPlat);
        this.setLocationRelativeTo(null);        
        cargar_tabla2();
        total = 0;
        sub_total = 0.0;
        igv = 0.0;
    }

    private void cargar_tabla2() throws Exception {
        String columna[] = new String[]{"Cantidad", "Nombre", "Precio Unitario", "Importe"};
        modeloTabla2 = new DefaultTableModel(null, columna);
        tabla_venta.setModel(modeloTabla2);
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPedido = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jpLista = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Platos = new javax.swing.JTable();
        jrbNombrePlato = new javax.swing.JRadioButton();
        jrbDescrPlato = new javax.swing.JRadioButton();
        jchkTodoPlato = new javax.swing.JCheckBox();
        jrbTipPlat = new javax.swing.JRadioButton();
        txtDatosPlatos = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAgregarP = new javax.swing.JButton();
        grupo_Platos = new javax.swing.ButtonGroup();
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tabla_Platos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_PlatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_Platos);

        jpLista.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 660, 160));

        jrbNombrePlato.setText("Nombre Plato");
        jrbNombrePlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNombrePlatoActionPerformed(evt);
            }
        });
        jpLista.add(jrbNombrePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jrbDescrPlato.setText("Estado");
        jrbDescrPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDescrPlatoActionPerformed(evt);
            }
        });
        jpLista.add(jrbDescrPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jchkTodoPlato.setText("Todo");
        jchkTodoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkTodoPlatoActionPerformed(evt);
            }
        });
        jpLista.add(jchkTodoPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jrbTipPlat.setText("Tipo de Plato");
        jrbTipPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTipPlatActionPerformed(evt);
            }
        });
        jpLista.add(jrbTipPlat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        txtDatosPlatos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDatosPlatosCaretUpdate(evt);
            }
        });
        txtDatosPlatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosPlatosActionPerformed(evt);
            }
        });
        jpLista.add(txtDatosPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 200, 30));

        txtCantidad.setText("1");
        jpLista.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 30));

        jLabel9.setText("Cantidad");
        jpLista.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 60, 30));

        btnAgregarP.setText("Agregar Pedido");
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });
        jpLista.add(btnAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 170, 30));

        jPanel3.add(jpLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 290));

        javax.swing.GroupLayout jdPedidoLayout = new javax.swing.GroupLayout(jdPedido.getContentPane());
        jdPedido.getContentPane().setLayout(jdPedidoLayout);
        jdPedidoLayout.setHorizontalGroup(
            jdPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jdPedidoLayout.setVerticalGroup(
            jdPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jpBotones.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 140, 60));

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

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 630, 230));

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
        try {           
            cargar_Tabla();
        } catch (Exception ex) {
            Logger.getLogger(ClienteV.class.getName()).log(Level.SEVERE, null, ex);
        }
        jdPedido.setSize(700, 400);
        jdPedido.setVisible(true);
        jdPedido.setModal(true);
        jdPedido.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnPedidoCActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentaActionPerformed

    private void tabla_PlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_PlatosMouseClicked
        // try {
        //   int fila = tabla_Platos.getSelectedRow();
        // if(fila >=0){
        //   codigoPlato =  Integer.parseInt(tabla_Platos.getValueAt(fila,0).toString());
        // txtNomPlat.setText(tabla_Platos.getValueAt(fila, 1).toString());
        // txtDescPlat3.setText(tabla_Platos.getValueAt(fila,2).toString());
        //jcbxTipoPlat.setSelectedItem(tabla_Platos.getValueAt(fila, 3).toString());
        //txtPrecPlat.setText(tabla_Platos.getValueAt(fila,4).toString());
        //cboxEstadoPlato.setSelectedItem(tabla_Platos.getValueAt(fila,5).toString());
        //btnEliminarPla.setEnabled(true);
        //btnGuardarPla.setEnabled(false);
        // }
        //} catch (Exception e) {
        //  System.out.println(e.getMessage());
        //}
    }//GEN-LAST:event_tabla_PlatosMouseClicked

    private void jrbNombrePlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNombrePlatoActionPerformed
        tipo = 2;
        jchkTodoPlato.setSelected(false);
    }//GEN-LAST:event_jrbNombrePlatoActionPerformed

    private void jrbDescrPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDescrPlatoActionPerformed
        tipo = 3;
        jchkTodoPlato.setSelected(false);
    }//GEN-LAST:event_jrbDescrPlatoActionPerformed

    private void jchkTodoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkTodoPlatoActionPerformed
        try {
            if (jchkTodoPlato.isSelected() == true) {
                grupo_Platos.clearSelection();
                tipo = 1;
                cargar_Tabla();
                txtDatosPlatos.setText("");
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_jchkTodoPlatoActionPerformed

    private void jrbTipPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTipPlatActionPerformed
        tipo = 4;
        jchkTodoPlato.setSelected(false);
    }//GEN-LAST:event_jrbTipPlatActionPerformed

    private void txtDatosPlatosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDatosPlatosCaretUpdate
        try {
            dato = txtDatosPlatos.getText();
            cargar_Tabla();
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_txtDatosPlatosCaretUpdate

    private void txtDatosPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosPlatosActionPerformed

    }//GEN-LAST:event_txtDatosPlatosActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        
        
        
        int fila = tabla_Platos.getSelectedRow();
        try {
            String codigo, cant, preci, nombre, importe;            
            double calcula = 0.0, x = 0.0, igvs = 0.0;
            int canti = 0;
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un dato", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                m = (DefaultTableModel) tabla_Platos.getModel();
                codigo = tabla_Platos.getValueAt(fila, 0).toString();
                nombre = tabla_Platos.getValueAt(fila, 1).toString();
                preci = tabla_Platos.getValueAt(fila, 4).toString();
                cant = txtCantidad.getText();

                //Calculos
//                x = (Double.parseDouble(preci) * Integer.parseInt(cant));
  //              importe = String.valueOf(x);

                //enviar datos a la otra tabla
                
                m = (DefaultTableModel) tabla_venta.getModel();
                String fila2[] = {cant, nombre, preci};
                m.addRow(fila2);
            }
        } catch (Exception e) {
            throw e;

        }

    }//GEN-LAST:event_btnAgregarPActionPerformed

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
                try {
                    new ClienteV().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ClienteV.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnBuscarCli;
    private javax.swing.JButton btnPedidoC;
    public static javax.swing.JButton btnVenta;
    private javax.swing.ButtonGroup grupo_Platos;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JButton jbAgregarCliV;
    public static javax.swing.JButton jbCancelarCliV;
    private javax.swing.JCheckBox jchkTodoPlato;
    private javax.swing.JDialog jdPedido;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpLista;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JRadioButton jrbDescrPlato;
    private javax.swing.JRadioButton jrbNombrePlato;
    private javax.swing.JRadioButton jrbTipPlat;
    public static javax.swing.JTable tabla_Platos;
    public static javax.swing.JTable tabla_venta;
    public static javax.swing.JTextField txtApellClienV;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDatosPlatos;
    public static javax.swing.JTextField txtDirCliV;
    public static javax.swing.JTextField txtFechCLV;
    public static javax.swing.JTextField txtNDocCliV;
    public static javax.swing.JTextField txtNomClienV1;
    public static javax.swing.JTextField txtRucCliV1;
    // End of variables declaration//GEN-END:variables

    private void cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Codigo", "Nombre", "Descripcion","Tipo de Plato", "Precios", "Estado"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PlatoImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tabla_Platos.setModel(modeloTabla);
    }

    
   }
