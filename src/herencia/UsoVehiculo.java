/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author asantibo
 */
public class UsoVehiculo {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.setColor("Verde");
        Furgoneta mifurgoneta = new Furgoneta(2, 20);
        
        mifurgoneta.setColor("Rojo");
        mifurgoneta.setAsientosDeCuero(true);
        mifurgoneta.setAudioEquipado(true);
        mifurgoneta.setClimatizador(false);
        
        System.out.println(mifurgoneta.mostrar_datos_generales()+mifurgoneta.mostrarDatosFurgoneta());
    }
}
