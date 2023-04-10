/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author guerig
 */
public class Test {
    public static void main(String[] args) {

	// Construimos la ventana
	JFrame ventanaPrincipal = new JFrame ("Guerig Eri Cuchallo Jaldin");

	// Establecemos tamaño y posición
	ventanaPrincipal.setSize(800, 600);
        
        //ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);

	// Añadimos un objeto MiPanel al JFrame
	//ventanaPrincipal.add(new MiPanel(Color.cyan));
        ventanaPrincipal.add(new MiPanel(Color.BLUE));

	// Hacemos visible la ventana
	ventanaPrincipal.setVisible(true);

	// Acción por defecto al pulsar el botón de cierre de la ventana
	ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // ------------- LAYOUTS -------------------
        
        ventanaPrincipal.pack();
        
        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout

        // Añadir panel amarillo en la posición superior (NORTH)
        MiPanel panelNorte = new MiPanel(Color.BLUE);
        //panelNorte;
        
        ventanaPrincipal.add(new MiPanel(Color.BLUE), BorderLayout.NORTH);

	// Añadir panel rojo en la posición inferior (SOUTH)
    	ventanaPrincipal.add(new MiPanel(Color.DARK_GRAY), BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
    	ventanaPrincipal.add(new MiPanel(Color.MAGENTA), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
    	ventanaPrincipal.add(new MiPanel(Color.pink), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
    	ventanaPrincipal.add(new MiPanel(Color.YELLOW), BorderLayout.EAST);

        
        
        
}

}
