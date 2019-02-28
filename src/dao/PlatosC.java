package dao;

import modelo.Platos;

public interface PlatosC {
    
    void insertar(Platos platos)throws Exception;
    
    void actualizar (Platos platos) throws Exception;
    
    void eliminar (Platos platos) throws Exception;
}
