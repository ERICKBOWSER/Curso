/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer12;

/**
 *
 * @author guerig
 */
public class Pruebas {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("David", "Perez", "90234311Y");
        Cliente c2 = new Cliente("Josh", "Dawson", "12332482H");
        
        Cuenta cAhorro = new CuentaAhorro(12, 50, c1);
        Cuenta cCorriente = new CuentaCorriente(800, c2);
        
        System.out.println("Cuenta ahorro:");
        System.out.println(cAhorro.toString());
        
        System.out.println("----------------");
        
        System.out.println("Cuenta corriente:");
        System.out.println(cCorriente.toString());
        
        cAhorro.actualizarSaldo();
        
    }
}
