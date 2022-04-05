package ejercicio5.entidades;

import java.util.Scanner;

public class Cuenta {
    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void datos(int dniCliente, int numeroCuenta, double saldoActual ){
        this.dniCliente = dniCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
    }
    
    public void ingresar(double ingreso){
        this.saldoActual += ingreso;
    }
    
    public void retirar(double retiro){
        if (retiro > this.saldoActual) {
            this.saldoActual = 0;
        } else if (retiro <= this.saldoActual) {
            this.saldoActual = this.saldoActual - retiro;
        }
    }
    
    public void extraccionRapida(){
        double cant = this.saldoActual * 0.20;
        System.out.println("Solo podra extraer " + cant);
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: " + this.saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("DNI " + this.dniCliente
                + "Número de cuenta " + this.numeroCuenta
                        + "Saldo actual " + this.saldoActual);
    }
    
}