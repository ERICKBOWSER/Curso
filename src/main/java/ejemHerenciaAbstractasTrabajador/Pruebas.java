/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemHerenciaAbstractasTrabajador;

/**
 *
 * @author guerig
 */
public class Pruebas {
    public static void main(String[] args) {
     
        // Objeto de la superclase
        Trabajador pepe = new Trabajador ("Pepe", "Lopez", "22323d");
        
        // Objeto de la subclase
        Camarero juan = new Camarero ("Jefe Sala", "juan", "gil", "111hfk" );
        
        // Objeto superclase accediendo a sus métodos
        // Puede acceder a getters, setters, constructores y cotizar
        // No puede ver métodos del objeto subclase
        
        pepe.cotizar();
        
        // Objeto subclase accediendo a métodos de su clase
        // Puede ver getters, setters y contructores propios
        
       // System.out.println(juan.getRango());  
        juan.servirMesa();
        
        // Objeto subclase accediendo a métodos de superclase
        System.out.println("El camarero se llama:" + juan.getNombre());

		// Objeto subclase usando el método sobrescrito
		juan.cotizar();
     }

}
