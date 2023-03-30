/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ERICK
 */
public class TestLayout {
    public static void main(String[] args) {
        
        // Construimos la ventana
	JFrame ventanaPrincipal = new JFrame ("Guerig Eri Cuchallo Jaldin");

	// Establecemos tamaño y posición
	ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);
       

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);

	// Acción por defecto al pulsar el botón de cierre de la ventana
	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
               // LAYOUTS
               
        
        
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        
        
        // Cambiar el color de los paneles        
        MiPanel panel1 = new MiPanel(Color.LIGHT_GRAY);        
        ventanaPrincipal.add(panel1, BorderLayout.NORTH);
        panel1.setEtiqueta(new JLabel("Panel 1"));
        
        MiPanel panel2 = new MiPanel(Color.MAGENTA);
        panel2.setEtiqueta(new JLabel("Panel 2"));
        ventanaPrincipal.add(panel2, BorderLayout.SOUTH);
        
        MiPanel panel3 = new MiPanel(Color.CYAN);
        panel3.setEtiqueta(new JLabel("Panel 3"));
        ventanaPrincipal.add(panel3, BorderLayout.CENTER);
        
        MiPanel panel4 = new MiPanel(Color.BLUE);
        panel4.setEtiqueta(new JLabel("Panel 4"));
        ventanaPrincipal.add(panel4, BorderLayout.WEST);
        
        MiPanel panel5 = new MiPanel(Color.ORANGE);
        panel5.setEtiqueta(new JLabel("Panel 5"));
        ventanaPrincipal.add(panel5, BorderLayout.EAST);
 
        
        // Establecer que la ventana no sea redimensionable        
        ventanaPrincipal.setResizable(false);
        
        // pack() hace que se coja el tamaño necesario para que se vea todo lo que hay dentro
        ventanaPrincipal.pack();
        
    }
    
}
