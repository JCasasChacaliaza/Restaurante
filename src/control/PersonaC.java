package control;

import dao.impl.PersonaImpl;
import java.util.List;
import java.io.Serializable;
import modelo.Persona;
import vista.panel.PersonaV;

public class PersonaC implements Serializable {

    Persona persona;
    List<Persona> lsPersona;
    PersonaImpl dao;

    public PersonaC() {
        persona = new Persona();
        dao = new PersonaImpl();
    }

    public void registrarPersona(){
        try {
            dao.registrar(persona);
        } catch (Exception e) {
            System.out.println("Error en registrarPersona controlador " + e.getMessage());
        }
    }


    public void eliminarPersona()  {
        try {
            dao.eliminar(persona);
        } catch (Exception e) {
            System.out.println("Error en eliminar"+e.getMessage());
        }
    }

    public void modificarPersona(){
        try {
            dao.modificar(persona);
        } catch (Exception e) {
            System.out.println("error al modificar"+e.getMessage());
        }
    }

    public void variable() {
        try {
            persona.setNomPer(PersonaV.txtNombre.getText());
            persona.setApePer(PersonaV.txtApellido.getText());
            persona.setDniPer(PersonaV.txtDoc.getText());
            persona.setDirPer(PersonaV.txtDirecc1.getText());
            persona.setUserPer(PersonaV.txtUsuarCli.getText());
            persona.setPassPer(PersonaV.txtPassCli.getText());
            persona.setTipPer((String) PersonaV.jboxTipUsuario.getSelectedItem());
        } catch (Exception e) {
            System.out.println("Error en variables Persona" + e.getMessage());
        }
    }

    public void limpiar() {
        PersonaV.txtNombre.setText("");
        PersonaV.txtApellido.setText("");
        PersonaV.txtDoc.setText("");
        PersonaV.txtDirecc1.setText("");
        PersonaV.txtPassCli.setText("");
        PersonaV.txtUsuarCli.setText("");
        
    }

    public void limpiarModelo() {
        persona = new Persona();
    }
   

    //Codigo generado
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getLstPersona() {
        return lsPersona;
    }
   
    public void setLstPersona(List<Persona> lsPersona) {
        this.lsPersona = lsPersona;
    }
    
}
