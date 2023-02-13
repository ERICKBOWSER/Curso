/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploHerenciaVehiculo;

/**
 *
 * @author ERICK
 */
public class Deportivo extends Vehiculo {
    
    private int cilindrada;

    public Deportivo(int cilindrada, int bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa); // Constructor padre
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String getAtributos() {
        return super.getAtributos() + ", Cilindrada(cm3): " + this.cilindrada; 
    }
    
    
    
    
}
