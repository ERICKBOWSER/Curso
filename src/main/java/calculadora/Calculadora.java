/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JFrame;

/**
 *
 * @author ERICK
 */
public class Calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        
        frame.setBounds(250, 250, 0, 0); // Establecemos la posición y el tamaño
        
        frame.add(new PanelPrincipal());
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        
    }
}
