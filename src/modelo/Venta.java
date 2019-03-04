package modelo;

public class Venta {
    private int codVent;//codigo de la venta
    private String fechVent;//fecha de la venta
    private String totVent; //total de la venta
    private int cantvent;//cantidad de la venta
    private int mesa_cod;//codigo de la mesa
    private int pesona_cod;//codigo de la persona

    public int getCantvent() {
        return cantvent;
    }

    public void setCantvent(int cantvent) {
        this.cantvent = cantvent;
    }

    public int getMesa_cod() {
        return mesa_cod;
    }

    public void setMesa_cod(int mesa_cod) {
        this.mesa_cod = mesa_cod;
    }

    public int getPesona_cod() {
        return pesona_cod;
    }

    public void setPesona_cod(int pesona_cod) {
        this.pesona_cod = pesona_cod;
    }

    public int getPlato_cod() {
        return plato_cod;
    }

    public void setPlato_cod(int plato_cod) {
        this.plato_cod = plato_cod;
    }
    private int plato_cod;//codigo del plato

    public int getCodVent() {
        return codVent;
    }

    public void setCodVent(int codVent) {
        this.codVent = codVent;
    }

    public String getFechVent() {
        return fechVent;
    }

    public void setFechVent(String fechVent) {
        this.fechVent = fechVent;
    }

    public String getTotVent() {
        return totVent;
    }

    public void setTotVent(String totVent) {
        this.totVent = totVent;
    }
    
}
