 package control;

import dao.impl.PlatoImpl;
import java.io.Serializable;
import java.util.List;
import modelo.Platos;
import vista.panel.PlatosV;

public class PlatosC implements Serializable{
    
    Platos platos ;
    List<Platos>lsPlatos;
    PlatoImpl dao;
    
    public PlatosC(){
        platos = new Platos();
        dao = new PlatoImpl();
    }
    public void registrarPlatos(){
        try {
            dao.insertar(platos);
        } catch (Exception e) {
            System.out.println("Error en registarPlatosC " + e.getMessage());
        }
    }
    public void eliminarP(){
        try {
            dao.eliminar(platos);
        } catch (Exception e) {
            System.out.println("Error en eliminar"+e.getMessage());
        }
    }
    
    public void modificarPlatos(){
        try{
            dao.actualizar(platos);
        }catch(Exception e){
            System.out.println("error al actualizar "+e.getMessage());
        }
    }
    
    public void variables(){
        try {
            platos.setNomPlat(PlatosV.txtNomPlat.getText());
            platos.setDesPlat(PlatosV.txtDescPlat3.getText());
            platos.setTipPlat((String) PlatosV.jcbxTipoPlat.getSelectedItem());
            platos.setPrePlat(PlatosV.txtPrecPlat.getText());
            platos.setEstPlat((String)PlatosV.cboxEstadoPlato.getSelectedItem());
        } catch (Exception e) {
            System.out.println("Error en las variable"+e.getMessage());
        }
    }
    public void limpiarP(){
            PlatosV.txtNomPlat.setText("");
            PlatosV.txtDescPlat3.setText("");
            PlatosV.txtPrecPlat.setText("");            
    }
    public void limpiarModelo(){
        platos = new Platos();
    }
    
    //generado
    public void setPlatos(Platos platos){
        this.platos = platos;
    }
    public Platos getPlatos(){
        return platos;
    }
    public List<Platos>getListPlatos(){
        return lsPlatos;
    }
    public void setLstPlatos (List<Platos> lsPlatos){
        this.lsPlatos = lsPlatos;
    }
}
