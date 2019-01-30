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
public class Platos {
    private int codPlat;//codigo de platos
    private String desPlat;//descripcion de platos
    private String tipPlat;//tipo de plato
    private String prePlat;//precio de plato
    private String estPlat;// estado del plato si esta disponible o no

    public int getCodPlat() {
        return codPlat;
    }

    public void setCodPlat(int codPlat) {
        this.codPlat = codPlat;
    }

    public String getDesPlat() {
        return desPlat;
    }

    public void setDesPlat(String desPlat) {
        this.desPlat = desPlat;
    }

    public String getTipPlat() {
        return tipPlat;
    }

    public void setTipPlat(String tipPlat) {
        this.tipPlat = tipPlat;
    }

    public String getPrePlat() {
        return prePlat;
    }

    public void setPrePlat(String prePlat) {
        this.prePlat = prePlat;
    }

    public String getEstPlat() {
        return estPlat;
    }

    public void setEstPlat(String estPlat) {
        this.estPlat = estPlat;
    }
    
}
