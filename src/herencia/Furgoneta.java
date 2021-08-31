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
public class Furgoneta extends Coche {

    private int capacidad_carga;

    private int puestos_extra;
    
    private int puestos_totales;

    public Furgoneta(int puestos_extra,int capacidad_carga) {
        super(); //llamar al contructor de clase padre (trae estado inicial)
        
        this.capacidad_carga = capacidad_carga;
        this.puestos_extra = puestos_extra;
    }
    
    public String mostrarDatosFurgoneta(){
        puestos_totales = puestos_extra+getPuestos();
        return "\nLa capacidad de carga es: "+capacidad_carga+"\n"+
                "la cantidad de puestos es de: "+puestos_extra+"\n"+
                "puestos totales: "+puestos_totales;
    }

}
