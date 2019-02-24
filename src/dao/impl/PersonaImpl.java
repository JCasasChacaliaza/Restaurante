package dao.impl;

import dao.Conexion;
import dao.PersonaD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;

public class PersonaImpl extends Conexion implements PersonaD {

    public static int cantidad;

    @Override
    public void registrar(Persona persona) throws Exception {
        try {
            String INSERT = "INSERT INTO persona(NOMPER, APELLPER, DOCPER, DIRPER, TIPPER, USERPER, PASSPER) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(INSERT);
            ps.setString(1, persona.getNomPer());
            ps.setString(2, persona.getApePer());
            ps.setString(3, persona.getDniPer());
            ps.setString(4, persona.getDirPer());
            ps.setString(5, persona.getTipPer());
            ps.setString(6, persona.getUserPer());
            ps.setString(7, persona.getPassPer());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(Persona persona) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE PERSONA SET NOMPER = ?, APELLPER = ?, DOCPER = ?, DIRPER = ?, TIPPER = ?, USERPER=?, PASSPER=? WHERE CODPER =?";
            PreparedStatement ps = this.conectar().prepareCall(sql);
            ps.setString(1, persona.getNomPer());
            ps.setString(2, persona.getApePer());
            ps.setString(3, persona.getDniPer());
            ps.setString(4, persona.getDirPer());
            ps.setString(5, persona.getTipPer());
            ps.setString(6, persona.getUserPer());
            ps.setString(7, persona.getPassPer());
            ps.setInt(8, persona.getCodPer());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void eliminar(Persona persona) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM PERSONA WHERE CODPER = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, persona.getCodPer());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscar(DefaultTableModel modelo, Integer tipo, String dato) throws Exception {
        String sql = "";
        switch (tipo) {
            case 1:
                sql = "select * from persona";
                break;
            case 2:
                sql = "select * from persona where nomPer like '%" + dato + "%'";
                break;
            case 3:
                sql = "select * from persona where apellPer like '%" + dato + "%'";
                break;
        }
        String datos[] = new String[8];
        Statement st = this.conectar().createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            for (int i = 0; i < 8; i++) {
                datos[i] = rs.getString(i + 1);
            }
            modelo.addRow(datos);
            cantidad++;
        }
        rs.close();
        st.close();
    }
}
