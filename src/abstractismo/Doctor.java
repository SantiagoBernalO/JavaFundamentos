/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractismo;

/**
 *
 * @author asantibo
 */
public class Doctor extends Persona{

    private String hospital;
    private int telefono;

    public Doctor(String nombre, short edad,String hospital, int telefono) {
        super(nombre, edad);
        this.hospital = hospital;
        this.telefono = telefono;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getDescripcion() {
        return "Es un doctor que ya termino sus pasantias";
    }

}
