/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosMatricesCadenas;

import java.util.Scanner;

/**
 *
 * @author asantibo
 */
public class ArreglosMatrices {

    //arreglos son clases
    public static void main(String[] args) {

        //Formas de definir un arreglo
        //String arr[];
        //String []arr;
        //String[] arr;
        Scanner scanner = new Scanner(System.in);
        short numero_ingresado;
        short numero_ingresado_y;
        /*
        //Array
        //definicion de array
        String arrayString[] = {"Andres", "Daniel", "Mateo"};
        System.out.println("Ingrese un numero para saber su pareja");
        numero_ingresado = scanner.nextShort();
        if (numero_ingresado > arrayString.length) {
            System.out.println("no disponible");
        } else {
            switch (numero_ingresado) {
                case 1:
                    System.out.println("Su pareja es:" + arrayString[0]);
                    break;
                case 2:
                    System.out.println("Su pareja es:" + arrayString[1]);
                    break;
                case 3:
                    System.out.println("Su pareja es:" + arrayString[2]);
                    break;
                default:
                    System.out.println("Solo valen las opciones 1,2 y 3");
            }
        }
         */

        //Mtrices       
        System.out.println("Ingrese la dimencion de la matriz en x");
        numero_ingresado = scanner.nextShort();
        System.out.println("Ingrese la dimencion de la matriz en y");
        numero_ingresado_y = scanner.nextShort();
        Short matriz[][] = new Short[numero_ingresado][numero_ingresado_y];
        for (int i = 0; i < numero_ingresado; i++) {
            for (int j = 0; j < numero_ingresado_y; j++) {
                matriz[i][j]=(short)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < numero_ingresado; i++) {
            for (int j = 0; j < numero_ingresado_y; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }

}
