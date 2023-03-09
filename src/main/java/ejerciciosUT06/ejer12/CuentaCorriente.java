/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer12;

/**
 *
 * @author ERICK
 */
public class CuentaCorriente extends Cuenta{
    private final double INTERES = 1.5;
    private double saldoMin;

    public CuentaCorriente(double saldoMin, Cliente cliente) {
        super(cliente);
        this.saldoMin = saldoMin;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }
    
    public void retirar(double retirar){
        double saldoRetirado = getSaldo() - retirar;
               
        if(saldoRetirado <= saldoMin){
            System.out.println("Lo sentimos pero no dispone de saldo suficiente para realizar esta operación");
        }else{
            System.out.println("Se ha retirado un total de " + retirar);
            System.out.println("Su saldo actual es de " + saldoRetirado);
            
            setSaldo(saldoRetirado);
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "INTERES=" + INTERES + ", saldoMin=" + saldoMin + '}';
    }
    
    public void actualizarSaldo(){
        double nuevoSaldo = 0;
        if(getSaldo() > 1000){
            nuevoSaldo = getSaldo() + (saldoMin * INTERES);
            setSaldo(nuevoSaldo);            
        }else{
            nuevoSaldo = getSaldo() + (getSaldo() + INTERES);
        }
    }
}
