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
public class Cajero extends  Banco implements InterfaceBancoAsociado{
    
    private String asistente;
    private short num_cajero;
    private String nom_Cliente;

    public Cajero(String asistente, short num_cajero, String nom_Cliente, String NombreBanco, int Ingresos, int retiros) {
        super(NombreBanco, Ingresos, retiros);
        this.asistente = asistente;
        this.num_cajero = num_cajero;
        this.nom_Cliente = nom_Cliente;
    }

    public String getAsistente() {
        return asistente;
    }

    public void setAsistente(String asistente) {
        this.asistente = asistente;
    }

    public short getNum_cajero() {
        return num_cajero;
    }

    public void setNum_cajero(short num_cajero) {
        this.num_cajero = num_cajero;
    }

    public String getNom_Cliente() {
        return nom_Cliente;
    }

    public void setNom_Cliente(String nom_Cliente) {
        this.nom_Cliente = nom_Cliente;
    }

    @Override
    public String insertarBancoAsociado() {
        return "Banco asociado es Colpatria.";
    }
}
