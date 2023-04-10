/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresionesRegulares;

import java.util.regex.Pattern;

/**
 *
 * @author guerig
 */
public class Localizacion {
    public static void main(String[] args) {
        /* Detectar N,S,E,O*/
    
        String regex = "Localización: [NSEO]"; // $ hace que solo tenga que aparecer 1
                    // si se coloca ^ al principio no permite que haya texto antes de la expresion
        String string = "Aquí tengo la Localización: N y otro texto";
        
        System.out.println(string.matches(regex)); // Busca exactamento lo que se haya puesto en el patrón regular.
                    
        //final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
                    
    }
    
    
}
