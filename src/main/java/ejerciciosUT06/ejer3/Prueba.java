/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer3;

/**
 *
 * @author ERICK
 */
public class Prueba {
    public static void main(String[] args) {
        Persona p1 = new Persona("Eduardo", "89324234Y", 20);
        
        Empleado e1 = new Empleado(1500, "Josh", "78239923H", 25);
        
        Programador prog1 = new Programador(Categoria.Analista, 1800, "Fer", "88230923T", 22);
        
        
        System.out.println(p1.toString());
        
        System.out.println(e1.toString());
        System.out.println("Aumentar salario: ");
        e1.aumentarSalario(500);
        System.out.println("Nuevo salario: " + e1.getSalario());
        
        System.out.println(prog1.toString());
    }
}
