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
public class Jefatura extends Empleado{
    
    private String departamento;
    private int bonificacionSalario;
    
    public Jefatura(String nombre, String cargo, int salario, String departamento, int bonificacionSalario) {
        super(nombre, cargo, salario);
        this.departamento = departamento;
        this.bonificacionSalario = (bonificacionSalario+salario);
    }

    /**
     *
     * @return
     */
    @Override
    public String getCargo() {
        return departamento;
    }

    /**
     *
     * @param departamento
     */
    @Override
    public void setCargo(String departamento) {
        this.departamento = departamento;
    }

    /**
     *
     * @return
     */
    @Override
    public int getSalario() {
        return bonificacionSalario;
    }

    /**
     *
     * @param bonificacionSalario
     */
    @Override
    public void setSalario(int bonificacionSalario) {
        this.bonificacionSalario = bonificacionSalario;
    }
    
    
    
}
