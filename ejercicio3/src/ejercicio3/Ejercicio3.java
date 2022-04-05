package ejercicio3;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Operacion n1 = new Operacion();
        
        System.out.println("Ingrese el primer número");
        n1.setNumero1(scan.nextInt());
        System.out.println("Ingrese el segundo número");
        n1.setNumero2(scan.nextInt());
        
        int suma = n1.sumar();
        System.out.println("Suma: " + suma);
        n1.restar();
        int res = n1.multiplicar();
        System.out.println("Multiplicación: " + res);
        n1.dividir();
    }
    
}
