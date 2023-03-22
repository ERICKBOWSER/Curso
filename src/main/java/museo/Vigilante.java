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
public final class Vigilante extends Empleado{

    public Vigilante(String NIF, String nombre, LocalTime horas) {
        super(NIF, nombre, horas);
    }

    public void modificarHoras(LocalTime horas){
        super.horas = horas;
    }
               
}
