/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author asantibo
 */
public class Banco {
    private String NombreBanco;
    private int  Ingresos;
    private int retiros;

    public Banco(String NombreBanco, int Ingresos, int retiros) {
        this.NombreBanco = NombreBanco;
        this.Ingresos = Ingresos;
        this.retiros = retiros;
    }

    public String getNombreBanco() {
        return NombreBanco;
    }

    public void setNombreBanco(String NombreBanco) {
        this.NombreBanco = NombreBanco;
    }

    public int getIngresos() {
        return Ingresos;
    }

    public void setIngresos(int Ingresos) {
        this.Ingresos = Ingresos;
    }

    public int getRetiros() {
        return retiros;
    }

    public void setRetiros(int retiros) {
        this.retiros = retiros;
    }
    
    
    
}
