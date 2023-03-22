/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalTime;

/**
 *
 * @author ERICK
 */
public class Conservadores extends Empleado implements Restauradores {
    
    private TipoConservador conservador;

    public Conservadores(TipoConservador conservador, String NIF, String nombre, LocalTime horas) {
        super(NIF, nombre, horas);
        this.conservador = conservador;
    }

    @Override
    public void modificarHoras(LocalTime horas) {
        super.horas = horas;
    }
    
    public void restaurar(TipoConservador tipo){
        if(tipo.equals(conservador.ESCULTÓRICO)){
            System.out.println("La restauración de la " + Restauradores.TipoObra.CUADRO + " se ha realizado");
        }else{
            System.out.println("La restauración de la " + Restauradores.TipoObra.PINTURA + " se ha realizado");

        }
    }



    
}
