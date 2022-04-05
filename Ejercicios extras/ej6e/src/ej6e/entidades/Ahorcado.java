package ej6e.entidades;

import java.util.Scanner;

public class Ahorcado {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    private String[] palabra;
    private int cantletras;
    private int max;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantletras, int jumax) {
        this.palabra = palabra;
        this.cantletras = cantletras;
        this.max = max;
    }

    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        String adiv = scan.next();
        System.out.println("Ingrese la cantidad de intentos");
        this.max = scan.nextInt();
        palabra = new String[adiv.length()];
        for (int i = 0; i < adiv.length(); i++) {
            palabra[i] = adiv.substring(i, i + 1);
        }
        this.cantletras = 0;
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public void buscarYencontrar(String le) {
        boolean band = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(le)) {
                band = true;
            }
        }
        if (band == true) {
            System.out.println("La letra pertenece a la palabra");
            cantletras += 1;
            System.out.println("Número de letras (encontradas/faltantes): " + cantletras + "/" + (palabra.length - cantletras));
            System.out.println("Número de oportunidades restantes: " + max);
        } else {
            System.out.println("La letra no pertenece a la palabra");
            System.out.println("Número de letras (encontradas/faltantes): " + cantletras + "/" + (palabra.length - cantletras));
            max -= 1;
            System.out.println("Número de oportunidades restantes: " + max);
        }
    }
    
    public void juego(){
        crearJuego();
        longitud();
        int can;
        boolean band;
        do {
            
            System.out.println("Ingrese una letra");
            String letra = scan.next();
            buscarYencontrar(letra);
            
        } while ( palabra.length != cantletras && max>0 );
        
        if (max == 0) {
            System.out.println("Lo sentimos, no quedan más intentos :(");  
        } else {
            System.out.println("Felicitaciones, ha ganado! :)");
        }
    }

}
