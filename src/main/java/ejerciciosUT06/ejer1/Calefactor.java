/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer1;

/**
 *
 * @author ERICK
 */
public class Calefactor extends Casa{
    int temperatura;

    public Calefactor(int temperatura, int tamanio, String disenio, String garage) {
        super(tamanio, disenio, garage);
        this.temperatura = temperatura;
    }
    
    public void encender(){
        System.out.println("El calefactor esta encendido");
    }
    
    public void apagar(){
        System.out.println("El calefactor esta apagado");
    }
    
    public int fijarTemperatura(int temperatura){
        return this.temperatura = temperatura;
    }
    
}
