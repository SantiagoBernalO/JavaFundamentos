/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo_enlazadoDinamico;

/**
 *
 * @author asantibo
 */
public class Empleado {
    private String nombre;
    private String cargo;
    private int salario;

    public Empleado(String nombre,String cargo,int salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
