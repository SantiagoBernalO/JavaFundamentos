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
public class EstructurasIterativas {

    public static void main(String[] args) {
        int numero = 0;
        int i = 1;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero tope para mostrar los numeros pares antes de este");
        numero = scanner.nextInt();
        /* 
        //WHILE
        while (i <= numero) {
            if ((i % 2) == 0) {
                result = i;
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
         */
        
        /*
        //DO WHILE
        do{
            System.out.println(i);
            i++;
        }while (i <= numero);
         */
        
        //FOR
        for (i = 0; i < numero; i++) {
            System.out.println(i);
        }
        
        
    }
}
