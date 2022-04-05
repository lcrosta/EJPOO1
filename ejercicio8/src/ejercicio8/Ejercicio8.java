package ejercicio8;

import ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una frase");
        c1.setFrase(scan.next());
        
        c1.longitudFrase();
        
        c1.invertirFrase();
        
        c1.mostrarVocales();
        
        System.out.println("Ingrese una letra para buscarla en la frase");
        c1.vecesRepetido(scan.next());
        
        System.out.println("Ingrese otra frase para comparar la longitud");
        c1.compararLongitud(scan.next());
        
        System.out.println("Ingrese otra frase para unirlas");
        c1.unirFrases(scan.next());
        
        System.out.println("Ingrese un carácter para reemplazar las (A)");
        c1.reemplazar(scan.next());
        
        System.out.println("Ingrese una letra para ver si es encontrada o no");
        boolean band = c1.contiene(scan.next());
        
        if (band == true) {
            System.out.println("Esa letra fue encontrada");
        } else {
            System.out.println("Esa letra no fue encontrada");
        }
        
        
        
        
    }
    
}
