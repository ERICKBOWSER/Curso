/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemHerenciaAbstractasTrabajador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guerig
 */
public class EjemploAzar {
    public static void main(String[] args) {
        
        List<Azar> objetosAzar = new ArrayList<>();
        
        objetosAzar.add(new Moneda()); // No se puede crear azar porque es abstracto || conversión implicita
        objetosAzar.add(new Dado()); // Conversión implicita
        
        for(Azar a : objetosAzar){
            System.out.println("Lanzamiento " + a.lanzar());
            
            // Variable a eres un Dado?
            if(a instanceof Dado){
                //((Dado) a).metodoDado(); // Conversión explícita -- NO ME SALE Y ES EL MISMO EJEMPLO DE CLASE
            }
            
            
        }
            
        
    }
}
