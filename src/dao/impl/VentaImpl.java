package dao.impl;

import dao.Conexion;
import dao.VentaD;
import java.sql.PreparedStatement;
import modelo.Venta;

public class VentaImpl extends Conexion implements VentaD {

    @Override
    public void insert(Venta venta) throws Exception {
        try {
            String INSERT = "INSERT INTO VENTA(codven, FECVEN , TOTVEN ,CANTVEN, MESA_CODMES, PERSONA_CODPER) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(INSERT);
            ps.setInt(1, venta.getCodVent());
            ps.setString(2, venta.getFechVent());
            ps.setString(3, venta.getTotVent());
            ps.setInt(4, venta.getCantvent());
            ps.setInt(5, venta.getMesa_cod());
            ps.setInt(6, venta.getPesona_cod());
            // ps.setInt(6,venta.getPlato_cod());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            throw e;
        }
    }

  

}
