/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploHerenciaVehiculo;

/**
 *
 * @author ERICK
 */
public class PruebaHerencia {
    public static void main(String[] args) {
        String atributos, atributosSuper;
        
        Turismo t1 = new Turismo(4, true, 1, "234fgd", "Nissan", "asdf", "Negro", 300);
        atributos = t1.getAtributos();
        System.out.println(atributos);
        
        System.out.println("Con super:");
        atributosSuper = t1.getAtributosSuper();
        System.out.println(atributosSuper);
        
        Vehiculo miVehiculo = new Vehiculo(1, "4050 ABJ", "VW", "GTI", "Blanco", 100);
        
        Turismo miTurismo = new Turismo(4, true, 2, "234dfg", "Ford", "ERT", "Rojo", 300);
        
        Deportivo miDeportivo = new Deportivo(2000, 3, "4070 DEP", "Ford", "Mustang", "Rojo", 80);
        
        Furgoneta miFurgoneta = new Furgoneta(1200, 8 , 4, "4080 FUR", "Fiat", "Ducato", "Azul", 80);
        
        
        //  Invocación del método getAtributos() de cada objeto
        System.out.println("---------------------------");
        
        System.out.println("Vehiculo: " + miVehiculo.getAtributos());
        System.out.println("---------------------------");
        
        System.out.println("Turismo: " + miTurismo.getAtributos());
        System.out.println("---------------------------");
        
        System.out.println("miDeportivo: "+ miDeportivo.getAtributos());
        System.out.println("---------------------------");
        
        System.out.println("Turismo: " + miTurismo.getMatricula() + " " + 
                miTurismo.getMarca() + " " +
                miTurismo.getModelo()
                );
        System.out.println("---------------------------");
    }
}
