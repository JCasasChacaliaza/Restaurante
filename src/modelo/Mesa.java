/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Mesa {
    private int codMesa;
    private String numMesa;
    private String capMesa;
    private String estMesa; //estado de la mesa (disponible o no)

    public String getEstMesa() {
        return estMesa;
    }

    public void setEstMesa(String estMesa) {
        this.estMesa = estMesa;
    }
    

    public int getCodMesa() {
        return codMesa;
    }

    
    public void setCodMesa(int codMesa) {
        this.codMesa = codMesa;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public String getCapMesa() {
        return capMesa;
    }

    public void setCapMesa(String capMesa) {
        this.capMesa = capMesa;
    }
    
}
