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
public class Venta {
    private int codVent;//codigo de la venta
    private String fechVent;//fecha de la venta
    private String totVent; //total de la venta

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
