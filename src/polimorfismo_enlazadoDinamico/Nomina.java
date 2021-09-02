/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_enlazadoDinamico;

import java.util.Scanner;

/**
 *
 * @author asantibo
 */
public class Nomina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado[] empleado = new Empleado[6];
        empleado[0] = new Empleado("daniel", "diseñadorUX", 1200000);
        empleado[1] = new Empleado("ivonne", "diseñador", 1250000);
        empleado[2] = new Empleado("daniel", "contador", 1500000);
        empleado[3] = new Jefatura("Santiago", "jefeProduccion", empleado[0].getSalario(), "Produccion", 1800000);//polimorfismo (principio de sustitucion)
        empleado[4] = new Jefatura("Daniel", "jefeContabilidad", empleado[1].getSalario(), "Contabilidad", 1900000);
        empleado[5] = new Jefatura("carlos", "jefeDisenio", empleado[2].getSalario(), "Disenio", 1800000);
        
        System.out.println("--Informe--");
        
        for (Empleado e: empleado) {

            System.out.println(
                    "Empleado: " + e.getNombre() + "\n"
                    + "Cargo: " + e.getCargo() + "\n"
                    + "Salario: " + e.getSalario()+ "\n"//mismos metodos set y get para Empleado y Jefatura para (enlazado dinamico)
            );

        }
        
        /*
        for (int i = 0; i < 3; i++) {

            System.out.println(
                    "Empleado " + i + ": " + empleado[i].getNombre() + "\n"
                    + "Cargo: " + empleado[i].getCargo() + "\n"
                    + "Salario: " + empleado[i].getSalario()
            );

        }
         */
    }
}
