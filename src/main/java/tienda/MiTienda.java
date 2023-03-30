/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author guerig
 */
public class MiTienda {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList();
        
        // Conversión implicita
        Producto pant1 = new Pantalon(Talla.L, "Zara", 1, 23, "Negro con estampado");
        Producto pant2 = new Pantalon(Talla.M, "Bershka", 2, 40, "Blancho");
        
        // Conversión implicita
        Producto libPapel1 = new LibroPapel(300, 1234, 3, 10, "La caperucita roja");
        Producto libPapel2 = new LibroPapel(250, 2342,4, 50, "Sombra");
        
        // Conversión implicita
        Producto libDig1 = new LibroDigital(25, 1434, 5, 5, "Percy Jackson");
        Producto libDig2 = new LibroDigital(222, 5675, 6, 87, "X men");
        
        // Conversión implicita
        Producto musica1 = new Musica("Artic Monkeys", 7, 12, "Arctic Monkeys es una banda británica de rock, formada en Sheffield, Reino Unido.​ El grupo está compuesto por el guitarrista principal y vocalista Alex Turner, el guitarrista Jamie Cook, el baterista Matt Helders y el bajista Nick O'Malley.");
        Producto musica2 = new Musica("Gorillaz", 8, 25, "Gorillaz es una banda virtual inglesa creada en 1998 por Damon Albarn y Jamie Hewlett. La banda está compuesta por cuatro miembros ficticios: 2-D, Noodle, Murdoc Niccals y Russel Hobbs");
        
        // Añadir los productos a la lista        
        productos.add(pant1);
        productos.add(pant2);
        
        productos.add(libPapel1);
        productos.add(libPapel2);
        
        productos.add(libDig1);
        productos.add(libDig2);
        
        productos.add(musica1);
        productos.add(musica2);
        
        System.out.println("Productos");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        
        System.out.println();
        System.out.println("Lista de libros");
        List<Libro> listaLibros = new ArrayList();        
       
        for (Producto producto : productos) {
            if(producto instanceof Libro){
                listaLibros.add((Libro)producto);
            }
        }
                
        System.out.println(listaLibros);
        
        System.out.println();
        System.out.println("Iterador");
        Iterator<Libro> iterador = listaLibros.iterator();
        
        while(iterador.hasNext()){ // Mientras haya cosas que recorrer
            System.out.println(iterador.next());
        }
        
        System.out.println();
        System.out.println("Contains");
        System.out.println(listaLibros.contains(libDig1));
        
        
        System.out.println();
        System.out.println("Ejecutar método");
        for (Libro libro : listaLibros) {
            System.out.println(libro.getClass().getName());
            if(libro.equals("tienda.LibroPapel")){
                
            }
        }
        
        
        Set<Producto> librosOrdenados = new TreeSet();
        
        for (Producto libro : listaLibros) {
            librosOrdenados.add(libro);
        }
        System.out.println();
        System.out.println("Libros ordenados");
        System.out.println(librosOrdenados);
        
        
        // Mapear un Integer a un String.
        Function <Integer, String> funcion = x -> "Tú número es " + x;        
        System.out.println(funcion.apply(5));

        // Se pasa un objeto Integer y se comprueba si es mayor que 
        // la condición que tiene el predicado
        Predicate<Integer> predicado = x -> x > 5;
        System.out.println(predicado.test(6));
        
        
        Consumer<String> consumidor = nombre -> System.out.println("Tú nombre es " + nombre);
        consumidor.accept("Jake");
        
        
        Supplier<Double> proveedor = () -> Math.random();
        System.out.println(proveedor.get());
        
    }
}
