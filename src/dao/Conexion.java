package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static String usuario = "usuarioSQL" ;
    private static String pass = "anthony_16";
    private static String bd = "restaurante";
    private static String url = "jdbc:sqlserver://MARPI:1433"+bd;
    private static String local = "MARPI";

    public static String getLocal() {
        return local;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getPass() {
        return pass;
    }

    public static String getBd() {
        return bd;
    }

    public static String getUrl() {
        return url;
    }
    public static Connection cnx = null;



    public static Connection conectar() throws Exception {

        if (cnx != null) {
            return cnx;
        }
        try {
            String url = "jdbc:sqlserver://MARPI:1433;databaseName=restaurante";
            String user = "usuarioSQL";
            String password = "anthony_16";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, password);
            System.out.println("si hay conexion");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el: " + ex.getMessage());
        }
        return cnx;
    }
    
    
    public static void cerrarCnx() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

    public static void main(String[] args) throws Exception {
        conectar();
        if (cnx != null) {
            System.out.println("conexion a base de datos correcta");
        } else {
            System.out.println("cerrado");
        }
    }
        public static Connection getCnx() {
        return cnx;
    }

    public static void setCnx(Connection cnx) {
        Conexion.cnx = cnx;
    }
}
