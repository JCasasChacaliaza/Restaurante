package dao.impl;

import dao.Conexion;
import dao.PlatosC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Platos;

public class PlatoImpl extends Conexion implements PlatosC {

    public static int cantidad;

    @Override
    public void insertar(Platos platos) throws Exception {
        try {
            String INSERT = "INSERT INTO PLATOS(NOMPLAT, DESPLAT, TIPPLAT, PREPLAT, ESTPLAT) VALUES (?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(INSERT);
            ps.setString(1, platos.getNomPlat());
            ps.setString(2, platos.getDesPlat());
            ps.setString(3, platos.getTipPlat());
            ps.setDouble(4, platos.getPrePlat());
            ps.setString(5, platos.getEstPlat());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public void actualizar(Platos platos) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE PLATOS SET NOMPLAT = ?, DESPLAT = ?, TIPPLAT = ?, PREPLAT = ?, ESTPLAT = ? WHERE CODPLAT =?";
            PreparedStatement ps = this.conectar().prepareCall(sql);
            ps.setString(1, platos.getNomPlat());
            ps.setString(2, platos.getDesPlat());
            ps.setString(3, platos.getTipPlat());
            ps.setDouble(4, platos.getPrePlat());
            ps.setString(5, platos.getEstPlat());
            ps.setInt(6, platos.getCodPlat());
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Platos platos) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM PLATOS WHERE CODPLAT = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, platos.getCodPlat());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void buscar(DefaultTableModel modelo, Integer tipo, String dato) throws Exception {
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from PLATOS";
                break;
            case 2:
                sql = "select * from PLATOS where nomplat like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from PLATOS where estplat like '%" + dato + "%'";
                break;
            case 4:
                sql = "select * from PLATOS where tipplat like '%"+ dato + "%'";
                break;
        }
        String datos[] = new String[6];
        Statement st = this.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            for (int i = 0; i < 6; i++) {
                datos[i] = rs.getString(i + 1);
            }
            modelo.addRow(datos);
            cantidad++;
        }
        rs.close();
        st.close();
    }
    
    
    
    

}
