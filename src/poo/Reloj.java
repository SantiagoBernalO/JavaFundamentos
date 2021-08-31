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
public class Reloj {
    public static void main(String[] args) {
        Dia info = new Dia();
        info.hora = 10;
        //set envia info a clase Dia
        info.setMinuto(-7);
        info.setSegundo(30);
        //get obtiene la info enviada
        System.out.println("Hora: "+info.hora);
        System.out.println("Minuto: "+info.getMinuto());
        System.out.println("Minuto: "+info.getSegundo());
    }
}
