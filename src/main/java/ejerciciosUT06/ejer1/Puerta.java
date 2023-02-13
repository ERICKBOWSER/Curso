/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer1;

/**
 *
 * @author ERICK
 */
public class Puerta extends Casa{
    int numero;

    public Puerta(int numero, int tamanio, String disenio, String garage) {
        super(tamanio, disenio, garage);
        this.numero = numero;
    }
    
    public void abrir(){
        System.out.println("La puerta esta abierta");
    }
    
    public void cerrar(){
        System.out.println("La puerta esta cerrada");
    }
    
}
