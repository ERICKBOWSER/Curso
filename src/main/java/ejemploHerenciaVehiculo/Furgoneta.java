/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploHerenciaVehiculo;

/**
 *
 * @author ERICK
 */
public class Furgoneta extends Vehiculo {
    private int carga;
    private int volumen;

    public Furgoneta(int carga, int volumen, int bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);// Constructor padre
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() + ", Carga(kg): " + this.carga + ", Volumen(m3): " + this.volumen; 
    
    }
    
    
}
