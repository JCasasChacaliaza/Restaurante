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
public class Cliente {
    private int codCli;
    private String nomCli;
    private String apeCli;
    private String docCli;
    private String tipCli;

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getApeCli() {
        return apeCli;
    }

    public void setApeCli(String apeCli) {
        this.apeCli = apeCli;
    }

    public String getDocCli() {
        return docCli;
    }

    public void setDocCli(String docCli) {
        this.docCli = docCli;
    }

    public String getTipCli() {
        return tipCli;
    }

    public void setTipCli(String tipCli) {
        this.tipCli = tipCli;
    }
            
}
