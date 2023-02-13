/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer1;

/**
 *
 * @author ERICK
 */
public class Persiana extends Ventana{
    ColorPersiana color;

    public Persiana(ColorPersiana color, int numero, boolean reja, int tamanio, String disenio, String garage) {
        super(numero, reja, tamanio, disenio, garage);
        this.color = color;
    }
    
    public void subir(){
        System.out.println("Las persianas estan subidas");
    }
    
    public void Bajar(){
        System.out.println("Las persianas estan bajadas");
    }
}
