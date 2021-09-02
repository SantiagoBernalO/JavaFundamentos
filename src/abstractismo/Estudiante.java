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
public class Estudiante extends Persona{

    private short grado;
    private String colegio;

    public Estudiante(String nombre, short edad,short grado, String colegio) {
        super(nombre, edad);
        this.grado = grado;
        this.colegio = colegio;
    }    

    public short getGrado() {
        return grado;
    }

    public void setGrado(short grado) {
        this.grado = grado;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    @Override
    public String getDescripcion() {
        return "Es un estudiante que esta haciendo sus pasantias";
    }

}
