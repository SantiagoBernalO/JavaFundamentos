/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosMatricesCadenas;

/**
 *
 * @author asantibo
 */
public class Cadenas {
    public static void main(String[] args) {
        char abecedario;
        
        
        //CHAR EN CADENA DE CARACTERES
        String saltoLinea;
        int cont=1;
        for (int i = 'A'; i <= 'Z'; i++) {
            abecedario = (char)i;
            saltoLinea = ((cont%5==0)&&(cont!=0))?"\n":" ";
            System.out.print(abecedario+saltoLinea);  
            cont++;
        }
        
        
        
    }
}
