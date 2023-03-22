/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ERICK
 */
public class Pruebas {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList();
        
        // Empleados
        Monitor monitor1 = new Monitor("09123423T", "Samantha", LocalTime.of(4, 0));
        Vigilante vigilante1 = new Vigilante("98127312H", "Carlos", LocalTime.of(6, 0));
        Conservadores conservadorPictorico = new Conservadores(TipoConservador.PICTÓRICO, "09812322K", "Eduardo", LocalTime.of(6, 0));
        Conservadores conservadorEscultorico = new Conservadores(TipoConservador.ESCULTÓRICO, "12092343", "Fernando", LocalTime.of(4, 0));

        // Polimorfismo en empleados
        empleados.add(vigilante1);
        empleados.add(conservadorPictorico);
        empleados.add(conservadorEscultorico);
        
        // Obras
        Obra obra1 = new Obra(1, "Leonardo da Vinci", TipoObras.CUADRO);
        Obra obra2 = new Obra(2, "Pablo Picasso", TipoObras.CUADRO);
        Obra obra3 = new Obra(3, "Alexander Calder", TipoObras.ESCULTURA);
        
        // Salas 
        List<Sala> salas = new ArrayList();
        
        Fijo fijo1 = new Fijo("Bien", 1, "sala1", TipoSala.CUADROS, obra1);
        Fijo fijo2 = new Fijo("Buenas condiciones", 2, "Sala2", TipoSala.ESCULTURAS, obra3);
        Temporal temp1 = new Temporal(LocalDate.of(2015, Month.FEBRUARY, 12), LocalDate.of(2024, Month.FEBRUARY, 12), 1, "salaTemporal", TipoSala.ESCULTURAS, obra3);
               
        salas.add(fijo1);
        salas.add(fijo2);
        salas.add(temp1);
        
        // Museo
        Museo museo1 = new Museo("Museo de obras de Narnia", "C/ Matías Prats, s/n, 29680, Estepona España", empleados, salas);
        
        // Contratar empleado
        museo1.contratar(monitor1);
        
        // Despedir
        museo1.despedir("98127312H");
        
        
    }
    
    
}
