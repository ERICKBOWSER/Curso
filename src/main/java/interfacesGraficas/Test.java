/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author ERICK
 */
public class Test {
    public static void main(String[] args) {

	// Construimos la ventana
	JFrame ventanaPrincipal = new JFrame ("Aplicación");

	// Establecemos tamaño y posición
	ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

	// Añadimos un objeto MiPanel al JFrame
	ventanaPrincipal.add(new MiPanel(Color.cyan));

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);

	// Acción por defecto al pulsar el botón de cierre de la ventana
	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
               
        
        
    }

}
