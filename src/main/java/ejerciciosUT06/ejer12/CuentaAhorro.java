/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUT06.ejer12;

/**
 *
 * @author ERICK
 */
public class CuentaAhorro extends Cuenta{
    private int interes;
    private double comisionAnual;

    public CuentaAhorro(int interes, double comisionAnual, Cliente cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }
    
    public void retirar(double retirar){
        
        double saldoRetirado = getSaldo() - retirar;
        
        if(getSaldo() > retirar){
            System.out.println("El saldo ha sido retirado.");
        }else{
            System.out.println("Lo sentimos pero no dispone de fondos suficientes.");
        }
    }
    
    public void actualizarSaldo(){
        double actualizarSaldo = (getSaldo() + (getSaldo() * interes)) - comisionAnual;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }
    
}
