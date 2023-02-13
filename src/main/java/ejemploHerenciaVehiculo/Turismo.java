/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploHerenciaVehiculo;

/**
 *
 * @author ERICK
 */
public class Turismo extends Vehiculo {
    private int puertas;
    private boolean marchaAutomatica;
    
    // No implementa métodos pero hereda los de Vehiculo.

    // Si no tiene constructor da error 
    public Turismo(int puertas, boolean marchaAutomatica, int bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    
    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    // Sobreescribir para que salgan los nuevos datos
    @Override
    public String getAtributos() {
        return super.getAtributos() + ", Puertas: " + this.puertas + ", Marcha automática: " + this.marchaAutomatica; 
    }
    
    // Utilizar super para hacer referencia a la superclase
    public String getAtributosSuper(){
        return super.getAtributos() + ", Puertas: " + this.puertas + ", Marcha automática: " + this.marchaAutomatica; 
    }


    
}
