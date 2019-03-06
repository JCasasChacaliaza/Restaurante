package dao.impl;

import dao.Conexion;
import dao.VentaD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Venta;
import vista.panel.ClienteV;

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

    public void obtener(Venta venta) throws Exception{
        try {
            String res = "Esta";
            String sql = "Select max (codven)from venta ";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            res = rs.getString(1);
            if(res == null){
                res = "00001";
            }else{
                System.out.println(Integer.parseInt(res.substring(3, 4)));
                for (int i = 3; i > 1; i--) {
                    if (Integer.parseInt(res.substring(i, i + 1)) <= 4) {
                        res = res.substring(0, i) + String.valueOf(Integer.valueOf(res.substring(i, 4)) + 1);
                        System.out.println(res);
                        break;
                    }
                }
            }
            ClienteV.txtNDocCliV.setText(res);
            rs.close();
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
            
        }
        
    }

    private static class GenerarNumero {

        public GenerarNumero() {
        }

        private void generar(int j) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
