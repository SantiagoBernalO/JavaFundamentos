/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author asantibo
 */
public class GeneradorRecibo {
    
    public static void main(String[] args) {
        
        Cajero cajero = new Cajero("Daniel", (short)1, "Ivan", "Bancolombia", 10000, 0);
        Banco banco = new Banco("Bancolombia", 50000, 0);
        
        int ingresosTotales = (cajero.getIngresos()+banco.getIngresos());
        
        System.out.println("Datos: "+cajero.getAsistente()+", cajero "+cajero.getNum_cajero()
                +", cliente "+cajero.getNom_Cliente()+", Banco "+cajero.getNombreBanco()
                +"Ingresos Totales (nuevo+banco) "+ingresosTotales+"\n"+
                cajero.insertarBancoAsociado());
        
        
        
    }
   
}
