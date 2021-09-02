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
public class Pasante {
    
            
    public static void main(String[] args) {
        
        Persona[] personas = new Persona[4];
        
        personas[0] = new Estudiante("Andres", (short)25, (short)8, "Ucundi");//no hay necesidad de poner descripcion a cada objeto por que ya viene definida por el abstractismo, eso ahorra codigo!
        personas[1] = new Estudiante("Andres", (short)25, (short)8, "UDistri");
        personas[2] = new Doctor("Daniel", (short)50, "Santa Maria", 123554);
        personas[3] = new Doctor("Daniela", (short)31, "Santa Gogina", 778954);
        
        for (Persona p : personas) {
            System.out.println(p.getNombre()+", "+p.getDescripcion()+".\nTiene "+p.getEdad()+" anios.");
        }
        
        
    }
    
    
    
}
