/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author ERICK
 */
public class PanelBotones extends JPanel{
    
    JButton [] grupoBotones = new JButton[16]; // Array de botones
    
    public PanelBotones(){
        initComponents();
    }
    
    private void initComponents(){
        
        // bucle para crear botones del 0 al 9
        for(int i = 0; i < 10; i++){
            grupoBotones[i] = new JButton(Integer.toString(i)); // Creación de números pasandolos a String ya que JButton solo admite números
        }
        
        // Botones de operaciones
        grupoBotones[10] = new JButton("+");
        grupoBotones[11] = new JButton("-");
        grupoBotones[12] = new JButton("*");
        grupoBotones[13] = new JButton("/");
        grupoBotones[14] = new JButton("=");
        grupoBotones[15] = new JButton("C");
        
        // Layout que va a tener
        this.setLayout(new GridLayout(4, 4)); // layout de 4 filas y columnas
        
        // Bucle para añadir los botones en el layout
        for(JButton boton : grupoBotones){
            this.add(boton);
        }
        
    }
    
    // método para devolver los botones
    public JButton[] getGrupoBotones(){
        return grupoBotones;
    }
    
    
}
