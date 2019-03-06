package control;

import dao.impl.VentaImpl;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Venta;
import vista.panel.ClienteV;

public class VentaC implements Serializable {

    Venta venta;
    List<Venta> lsVenta;
    VentaImpl dao;

    public VentaC() {
        venta = new Venta();
        dao = new VentaImpl();
    }

    public void insertarVenta() {
        try {
            dao.insert(venta);
        } catch (Exception ex) {
            System.out.println("Error en registar Venta " + ex.getMessage());
        }
    }

    public void codigo() {
        try {
            dao.obtener(venta);
        } catch (Exception e) {
        System.out.println("Error al obenete "+ e.getMessage());
        
        }    
    }

    public void variable() {
        try {
            venta.setCodVent(Integer.valueOf(ClienteV.txtNDocCliV.getText()));
            venta.setFechVent(ClienteV.txtFechCLV.getText());
            venta.setTotVent(ClienteV.txtTotal.getText());
            venta.setCantvent(Integer.valueOf(ClienteV.txtIGV.getText()));
            venta.setPesona_cod(Integer.valueOf(ClienteV.txtCodiCliente.getText()));
            venta.setMesa_cod(Integer.valueOf(ClienteV.txtCodMesa.getText()));
            //venta.setPlato_cod(Integer.valueOf(ClienteV.idProduc.getText()));
        } catch (Exception e) {
            throw e;
        }
    }

}
