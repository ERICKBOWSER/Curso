/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guerig
 */
public class MiTienda {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList();
        
        Producto pant1 = new Pantalon(Talla.L, "Zara", 1, 23, "Negro con estampado");
        Producto pant2 = new Pantalon(Talla.M, "Bershka", 2, 40, "Blancho");
        
        Producto libPapel1 = new LibroPapel(300, 1234, 3, 10, "La caperucita roja");
        Producto libPapel2 = new LibroPapel(250, 2342,4, 50, "Sombra");
        
        Producto libDig1 = new LibroDigital(25, 1434, 5, 5, "Percy Jackson");
        Producto libDig2 = new LibroDigital(222, 5675, 6, 87, "X men");
        
        Producto musica1 = new Musica("Rock", 7, 12, "Lanzado el 2012");
        
    }
}
