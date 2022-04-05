package ejercicio6;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Cafetera c1 = new Cafetera();
        
        System.out.println("Ingrese capacidad máxima");
        c1.setCapacidadMaxima(scan.nextDouble());
        c1.llenarCafetera();
        System.out.println("Ingrese tamaño de taza");
        c1.servirTaza(scan.nextDouble());
        c1.vaciarCafetera();
        System.out.println("Ingrese cantidad de café para agregar");
        c1.agregarCafe(scan.nextDouble());
        
        
        
        
    }
    
}
