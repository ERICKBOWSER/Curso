/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer1;

/**
 *
 * @author ERICK
 */
public class Ventana extends Casa {
    private int numero;
    private boolean reja;

    public Ventana(int numero, boolean reja, int tamanio, String disenio, String garage) {
        super(tamanio, disenio, garage);
        this.numero = numero;
        this.reja = reja;
    }
    
    public void abrir(){
        System.out.println("Las ventanas estan abiertas");
    }
    
    public void cerrar(){
        System.out.println("Las ventanas estan cerradas");
    }
    
}
