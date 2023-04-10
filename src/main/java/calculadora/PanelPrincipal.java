/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author ERICK
 */
public class PanelPrincipal extends JPanel implements ActionListener{ // ActionListener para programar los eventos de los botones
    
    // Atributos de la clase
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;
    
    private int contador = 0;
    
    //private ArrayList<String> datos = new ArrayList();
    
    public PanelPrincipal(){
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }
    
    
    private void initComponents(){
        
        // Creamos el panel de botones
        botonera = new PanelBotones();
        
        // Creamos el area de texto
        areaTexto = new JTextArea(10, 50); // area de texto con 10 filas y 50 columnas
        
        areaTexto.setEditable(true); // Establece si el area de texto se puede editar o no
        
        areaTexto.setBackground(Color.cyan); // Color de fondo
        
        // Establecemos el layout
        this.setLayout(new BorderLayout());
        
        // Colocamos la botonera y el área de texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);   
        
        // Indicamos que cada boton escucha eventos de tipo ActionListener
        for(JButton boton : this.botonera.getGrupoBotones()){
            boton.addActionListener(this);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Objeto que desencadena el evento
        Object o = ae.getSource();
        
//        double num1 = (double)ae.getSource();
//        
//        System.out.println("Num 1:" + num1);
        
        
//        datos.add((String)o);
        
//        if(o.equals("=")){
//            for (int i = 0; i < datos.size(); i++) {
//                String res = datos.get(i) + datos.get(i + 1);
//                System.out.println(res);
//                areaTexto.setText(res);
//            }
//        }
        
        
        // Si es un boton
        if(o instanceof JButton){
            System.out.println(((JButton) o).getText());
            
            areaTexto.setText(((JButton)o).getText());
        }
        
        
        
    }
    
    
    
}
