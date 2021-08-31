/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author asantibo
 */
public class Dia {
    public int hora;
    private int minuto;
    private int segundo;

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) { 
        this.minuto = (minuto>0)?minuto:0;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    
    
    
    
}
