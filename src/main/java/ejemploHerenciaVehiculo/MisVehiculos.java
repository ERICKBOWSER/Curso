/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploHerenciaVehiculo;

/**
 *
 * @author ERICK
 */
public class MisVehiculos {
    public static void main(String[] args) {
        //  ------------------------ COMPOSICIÓN -------------------------
        
        //  Se crean dos instancias de la clase Vehiculo
        Vehiculo v1 = new Vehiculo(1, "4050 ABJ", "VW", "GTI", "BLANCO", 100.0);
        
        Vehiculo v2 = new Vehiculo(2, "2345 JVM", "SEAT", "León", "Negro", 80.0);
        
        //  Se crea una instancia de la clase Cliente
        Cliente c1 = new Cliente("30x", "Juan", "Pérez");
        
        // relacion entre las dos clases
        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(c1, v2, 11, 11, 2011, 2);
        
        
        //  Un objeto de la clase VehiculoAlquilado puede acceder a los métodos públicos de su propia
        //  clase y de las clases Cliente y Vehiculo.
        alquiler1.getCliente().getNif();
        
        alquiler1.getVehiculo().getMatricula();
        
        //  Los datos del cliente y del vehículo alquilado
        System.out.println("Vehículo alquilado");
        System.out.println("Cliente: " + alquiler1.getCliente().getNif() + " " + 
                alquiler1.getCliente().getNombre() + " " + 
                alquiler1.getCliente().getApellidos()
                );
        System.out.println("Vehiculo: " + alquiler1.getVehiculo().getMatricula());
        
        //  ---------------------- HERENCIA -------------------------------
        
        
        
    }
}
