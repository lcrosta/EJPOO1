package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Ingrese la base del rectángulo");
        r1.setBase(scan.nextDouble());
        System.out.println("Ingrese la altura del rectángulo");
        r1.setAltura(scan.nextDouble());
        
        System.out.println("Perimetro: " + r1.perimetro());
        System.out.println("Área: " + r1.area());
        r1.mostrar();
        
        
    }
    
}
