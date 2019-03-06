package vista.panel;

import control.VentaC;
import dao.impl.PlatoImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import dao.Conexion;
import static dao.Conexion.conectar;
import dao.impl.VentaImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.ldap.HasControls;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Venta;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import static vista.panel.PlatosV.modeloTabla;
import static vista.panel.PlatosV.tabla_Platos;
import vista.tabla.PersonaVT;
import vista.tabla.PersonaVTI;

public class ClienteV extends javax.swing.JFrame {

    static double total;
    double sub_total;
    int igv;

    DefaultTableModel m;
    public static DefaultTableModel modeloTabla2;

    public int tipo = 1;
    public String dato;
    PlatoImpl dao;
    private int codigoPlato;
    

    public ClienteV() throws Exception {
        initComponents();
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy");
        txtFechCLV.setText(formato.format(sistFecha));
        
        cargar_Tabla();
        grupo_Platos.add(jrbNombrePlato);
        grupo_Platos.add(jrbDescrPlato);
        grupo_Platos.add(jrbTipPlat);
        txtCodiCliente.setVisible(false);
        txtCodMesa.setVisible(false);
        this.setLocationRelativeTo(null);
        cargar_tabla2();
        total = 0;
        sub_total = 0.0;
        igv = 0;
        

    }

    private void cargar_tabla2() throws Exception {
        String columna[] = new String[]{"Codigo","Cantidad", "Nombre", "Precio Unitario", "Importe"};
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
        txtCodiCliente = new javax.swing.JTextField();
        txtCodMesa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        btnAgregarCliente = new javax.swing.JButton();
        btnNuevoPedido = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnPedidoC = new javax.swing.JButton();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_venta = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtIGV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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

        txtApellClienV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellClienV.setEnabled(false);
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

        txtFechCLV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechCLV.setEnabled(false);
        txtFechCLV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechCLVActionPerformed(evt);
            }
        });
        jpCliente.add(txtFechCLV, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha:");
        jpCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 60, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Comprobante", "BOLETA", "FACTURA" }));
        jpCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tipo de comprobante:");
        jpCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 20));

        txtNDocCliV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNDocCliV.setDragEnabled(true);
        txtNDocCliV.setEnabled(false);
        txtNDocCliV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNDocCliVActionPerformed(evt);
            }
        });
        jpCliente.add(txtNDocCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 170, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Cliente:");
        jpCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 20));

        txtDirCliV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDirCliV.setEnabled(false);
        jpCliente.add(txtDirCliV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 150, 30));

        txtNomClienV1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomClienV1.setEnabled(false);
        jpCliente.add(txtNomClienV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("RUC");
        jpCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 20));

        txtRucCliV1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRucCliV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucCliV1ActionPerformed(evt);
            }
        });
        txtRucCliV1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucCliV1KeyTyped(evt);
            }
        });
        jpCliente.add(txtRucCliV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 170, 30));

        txtCodiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodiClienteActionPerformed(evt);
            }
        });
        jpCliente.add(txtCodiCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 150, 30));

        txtCodMesa.setText("3");
        txtCodMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodMesaActionPerformed(evt);
            }
        });
        jpCliente.add(txtCodMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, 30));

        jPanel1.add(jpCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 200));

        jLabel6.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 24)); // NOI18N
        jLabel6.setText("Datos de Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        jpBotones.setBackground(new java.awt.Color(204, 255, 204));
        jpBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 0), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 0), new java.awt.Color(51, 51, 0)));
        jpBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        btnAgregarCliente.setText("Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jpBotones.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 50));

        btnNuevoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevoPedido.setText("Cancelar");
        btnNuevoPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoPedido.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNuevoPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });
        jpBotones.add(btnNuevoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 80));

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jpBotones.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 50));

        btnPedidoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubiertos.png"))); // NOI18N
        btnPedidoC.setText("Pedido");
        btnPedidoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoCActionPerformed(evt);
            }
        });
        jpBotones.add(btnPedidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 50));

        jPanel1.add(jpBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 140, 530));

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

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 630, 220));

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
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpTabla.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 40));

        txtSubTotal.setBackground(new java.awt.Color(204, 255, 255));
        txtSubTotal.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubTotal.setEnabled(false);
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        jpTabla.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 80, 30));

        txtTotal.setBackground(new java.awt.Color(204, 255, 255));
        txtTotal.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jpTabla.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 80, 30));

        txtIGV.setBackground(new java.awt.Color(204, 255, 255));
        txtIGV.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtIGV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIGV.setEnabled(false);
        jpTabla.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 80, 30));

        jLabel10.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel10.setText("IGV");
        jpTabla.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel11.setText("sub Total");
        jpTabla.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel12.setText("Total");
        jpTabla.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jPanel1.add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 650, 330));

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

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        PersonaVTI personaVTI = null;
        try {
            personaVTI = new PersonaVTI();
        } catch (Exception ex) {
            Logger.getLogger(ClienteV.class.getName()).log(Level.SEVERE, null, ex);
        }
        personaVTI.setVisible(true);
        personaVTI.setDefaultCloseOperation(personaVTI.HIDE_ON_CLOSE);     

    }//GEN-LAST:event_btnAgregarClienteActionPerformed

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

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        // TODO add your handling code here:
        try {
            VentaC ventaC = new VentaC();
            ventaC.codigo();
        } catch (Exception e) {
                 System.out.println("error "+e.getMessage());
        }
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

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
            
        try {
            VentaC ventaC = new VentaC();
            ventaC.variable();
            ventaC.insertarVenta();
        } catch (Exception e) {
            System.out.println("Error en el boton de venta " + e.getMessage());
        }
        Conexion cn = new Conexion();
        if (jComboBox1.getSelectedItem().equals("FACTURA")) {
            try {
                cn.conectar();
                
                String ruta = "src\\reporte\\RPersona.jasper";
                Map parametro = new HashMap();
                parametro.put("codven", Integer.valueOf( txtNDocCliV.getText()));
                JasperPrint informe = JasperFillManager.fillReport(ruta, parametro, cn.conectar());
                JasperViewer ventana = new JasperViewer(informe, false);
                ventana.setTitle("Factura");
                ventana.setVisible(true);
            } catch (Exception e) {
                System.out.println("Error en el Reporte " + e.getMessage());
            }
        }else{
            if (jComboBox1.getSelectedItem().equals("BOLETE")) {
            try {
                cn.conectar();                
                String ruta = "src\\reporte\\RPersona.jasper";
                Map parametro = new HashMap();
                parametro.put("codven",Integer.valueOf(txtNDocCliV.getText()));
                JasperPrint informe = JasperFillManager.fillReport(ruta, parametro, cn.conectar());
                JasperViewer ventana = new JasperViewer(informe, false);
                ventana.setVisible(true);
                ventana.setTitle("BOLETA");
                
            } catch (Exception e) {
                System.out.println("Error en el Reporte " + e.getMessage());
            }
            
        }

        }
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
            System.out.println("error aqui"+e.getMessage());
        }
    }//GEN-LAST:event_txtDatosPlatosCaretUpdate

    private void txtDatosPlatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosPlatosActionPerformed

    }//GEN-LAST:event_txtDatosPlatosActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        int fila = tabla_Platos.getSelectedRow();
        try {
            String  cant, preci, nombre, importe, codigo;
            double calcula = 0.0, x = 0.0;
            int canti = 0, igvs = 0;
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione un dato", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                m = (DefaultTableModel) tabla_Platos.getModel();
                codigo = tabla_Platos.getValueAt(fila, 0).toString();
                nombre = tabla_Platos.getValueAt(fila, 1).toString();
                preci = tabla_Platos.getValueAt(fila, 4).toString();
                cant = txtCantidad.getText();

                //Calculos
                x = (Double.parseDouble(preci) * Integer.parseInt(cant));
                importe = String.valueOf(x);

                //enviar datos a la otra tabla
                m = (DefaultTableModel) tabla_venta.getModel();
                String fila2[] = {codigo ,cant, nombre, preci, importe};
                m.addRow(fila2);

                calcula = (Double.parseDouble(preci) * Integer.parseInt(txtCantidad.getText()));

                total = total + calcula;
                igvs = (int) (total * 0.19);
                igv = igvs;
                sub_total = total - igvs;

                txtTotal.setText("" + total);
                txtIGV.setText("" + igv);
                txtSubTotal.setText("" + sub_total);

            }
        } catch (Exception e) {
            System.out.println("error al pasar datos"+e.getMessage());

        }

    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtFechCLVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechCLVActionPerformed


    }//GEN-LAST:event_txtFechCLVActionPerformed

    private void txtRucCliV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucCliV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucCliV1ActionPerformed

    private void txtRucCliV1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucCliV1KeyTyped
        //validar numero


    }//GEN-LAST:event_txtRucCliV1KeyTyped

    private void txtCodiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodiClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodiClienteActionPerformed

    private void txtCodMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodMesaActionPerformed

    private void txtNDocCliVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNDocCliVActionPerformed
             
    }//GEN-LAST:event_txtNDocCliVActionPerformed

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
    public static javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnBuscarCli;
    public static javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnPedidoC;
    public static javax.swing.JButton btnVenta;
    private javax.swing.ButtonGroup grupo_Platos;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    public static javax.swing.JTextField txtCodMesa;
    public static javax.swing.JTextField txtCodiCliente;
    private javax.swing.JTextField txtDatosPlatos;
    public static javax.swing.JTextField txtDirCliV;
    public static javax.swing.JTextField txtFechCLV;
    public static javax.swing.JTextField txtIGV;
    public static javax.swing.JTextField txtNDocCliV;
    public static javax.swing.JTextField txtNomClienV1;
    public static javax.swing.JTextField txtRucCliV1;
    public static javax.swing.JTextField txtSubTotal;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Codigo", "Nombre", "Descripcion", "Tipo de Plato", "Precios", "Estado"};
        modeloTabla = new DefaultTableModel(null, columna);
        dao = new PlatoImpl();
        dao.buscar(modeloTabla, tipo, dato);
        tabla_Platos.setModel(modeloTabla);
    }

}
