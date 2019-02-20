package dao;

import modelo.Persona;

public interface PersonaD {
    
    void registrar (Persona persona) throws Exception;
    
    void modificar (Persona persona) throws Exception;
    
    void eliminar (Persona persona) throws Exception;
    
    
}
