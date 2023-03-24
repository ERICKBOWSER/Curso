/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author guerig
 */
public class Cumplir {
    /*Cumplir ini 2 números fin*/
    public static void main(String[] args) {
        String regex = "^ini[0-9]{2}fin";
        
        String cumplir = "fjalsdfñl";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cumplir);
        
        System.out.println(matcher.group());
        
    }
}
