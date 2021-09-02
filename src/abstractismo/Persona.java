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
public abstract class Persona {

    private String nombre;
    private short edad;

    public Persona(String nombre, short edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract String getDescripcion();//metodo abstracto (se requiere por que doctor y estudiente tienen distinta descripcion)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
    

}
