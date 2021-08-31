/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasDeControl;

import java.util.Scanner;

/**
 *
 * @author asantibo
 */
public class EstructurasDeDesicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short edad = 0;
        String respuesta = null;
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextShort();
        /*
        //Decision Simple
        try {

            if (edad < 0) {
                respuesta = "Edad no disponible";
            } else if (edad >= 18) {
                respuesta = "Es mayor de edad";
            } else {
                respuesta = "Es menor de edad";
            }
            System.out.println(respuesta);
        } catch (Exception ex) {
            System.out.println("Edad no disponible, excepcion " + ex);
        }
         */
        //in line
        /*
        try {    
            respuesta = (edad>=18)? "Es mayor de edad" : "Es menor de edad";                   
            System.out.println(respuesta);
        } catch (Exception ex) {
            System.out.println("Edad no disponible, excepcion " + ex);
        }
         */
        //switch Desicion multiple
        switch(edad){
            case 18:
                respuesta = "Despues de 18 es mayor de edad";
                break;
            case 21:
                respuesta = "Despues de 21 es mayor de edad en US";
                break;
            case 80:
                respuesta = "Despues de 80 es adulto mayor";
                break;
            default:
                respuesta = "Solo puede ingrsar estos valores: 21,18 y 80";
        }
        System.out.println(respuesta);
            

    }
}
