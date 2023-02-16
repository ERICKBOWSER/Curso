/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer3_1;

import java.util.ArrayList;

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
        
        System.out.println("----------- Map -----------------");
        
        Persona personaMap = new Persona();
        
        // Crear personas
        Persona per1 = new Persona("Ale", "12345678Y", 44);
        Persona per2 = new Persona("Sebas", "82342322H", 32);
        Persona per3 = new Persona("Godrick", "12348932K", 22);
        
        // Añadir personas al map
        personaMap.newPersona(per1);
        personaMap.newPersona(per2);
        personaMap.newPersona(per3);
        
        //Eliminar persona
        personaMap.deletePersona("12345678Y");
        
        // Mostrar personas
        System.out.println(personaMap.getPersona("12345678Y"));
        System.out.println(personaMap.getPersona("82342322H"));
        System.out.println(personaMap.getPersona("12348932K"));
        
        
        
    }
}
