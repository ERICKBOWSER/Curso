/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesGraficas;

/**
 *
 * @author ERICK
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Saludo extends JPanel{
    
	// Componentes gráficos: un botón y un área de texto
	private JButton boton;
	private JTextArea texto;
    
	public Saludo(){
    		initComponents();
	}
       
	private void initComponents(){
		// Tamaño del panel
		this.setPreferredSize(new Dimension(600,200));

		// Borde del panel
        	this.setBorder(new TitledBorder("Borde del panel"));

   	 	// Creamos el botón, con un texto a mostrar
    	boton = new JButton("Saludar");

	// Creamos el textArea de una fila por 25 columnas
    	texto = new JTextArea(1,25);

	// Establecemos el color de fondo del textArea
    	texto.setBackground(Color.gray);
   	
	// Posicionamiento de componentes con FlowLayout
    	this.setLayout(new FlowLayout());
   	
	// Añadimos los componentes al panel
    	this.add(boton);
    	this.add(texto);
	}	 
}
