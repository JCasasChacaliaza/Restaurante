package modelo;

public class Platos {

    private int codPlat;//codigo de platos
    private String nomPlat;//nombre del plato 
    private String desPlat;//descripcion de platos
    private String tipPlat;//tipo de plato
    private String prePlat;//precio de plato
    private String estPlat;// estado del plato si esta disponible o no

    public String getNomPlat() {
        return nomPlat;
    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

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

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
