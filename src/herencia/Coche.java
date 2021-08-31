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
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private int puestos;
    
    private String color;
    private int peso_total;
    private boolean asientosDeCuero, climatizador, audioEquipado;

    public Coche() {
    
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 800;
        peso_plataforma = 200; 
        puestos = 2;
    }
    
    public String mostrar_datos_generales(){
        return "Datos: "+" ruedas("+ruedas+") "+"largo("+largo+") ancho("+ancho+
                ") motor("+motor+") peso plataforma("+peso_plataforma+") puestos("+puestos+")"
                ;
    }

    public int getPuestos() {
        return puestos;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color_coche) {
        this.color = color_coche;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(int peso_total_coche) {
        this.peso_total = peso_total;
    }

    public boolean isAsientosDeCuero() {
        return asientosDeCuero;
    }

    public void setAsientosDeCuero(boolean asientosDeCuero_coche) {
        this.asientosDeCuero = asientosDeCuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador_coche) {
        this.climatizador = climatizador;
    }

    public boolean isAudioEquipado() {
        return audioEquipado;
    }

    public void setAudioEquipado(boolean audioEquipado_coche) {
        this.audioEquipado = audioEquipado;
    }
    
    
    
    
}
