package ejercicio1.entidades;

import java.util.Scanner;

public class Libro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int isbn;
    private String titulo;
    private String autor;
    private int cantpaginas;
    private int horas;
    private String pruebagit;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int cantpaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.cantpaginas = cantpaginas;
    }
    
    public void datos(){
        System.out.println("Ingrese el número ISBN");
        this.isbn = leer.nextInt();
        System.out.println("Ingrese el título del libro");
        this.titulo = leer.next();
        System.out.println("Ingrese el nombre del autor");
        this.autor = leer.next();
        System.out.println("Ingrese la cantidad de páginas");
        this.cantpaginas = leer.nextInt();
    }
    
    public void leer(){
        System.out.println("ISBN " + isbn);
        System.out.println("TÍTULO " + titulo);
        System.out.println("AUTOR " + autor);
        System.out.println("PÁGINAS " + cantpaginas);
    }
            
            
    
}
