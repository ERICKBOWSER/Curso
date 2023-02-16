/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemHerenciaAbstractasTrabajador;

import java.util.Random;

/**
 *
 * @author guerig
 */
public class Moneda extends Azar{

    public Moneda() {
        super(2);
    }

    
    
    
    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades()+1); // +1 ya que el último esta excluido
    }
    
    
    
}
