package ej1e;

import ej1e.entidades.Cancion;
import java.util.Scanner;

public class Ej1e {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el título y autor del libro");
        Cancion c1 = new Cancion(scan.next(), scan.next());
        
        System.out.println("Libro: " + c1.getTitulo());
        System.out.println("Autor: " + c1.getAutor());
         
    }
    
}
