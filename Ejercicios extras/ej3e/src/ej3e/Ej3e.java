package ej3e;

import ej3e.entidades.Raiz;
import java.util.Scanner;

public class Ej3e {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese los 3 coeficientes: a, b, c respectivamente");
        
        Raiz r1 = new Raiz(scan.nextInt(),scan.nextInt(),scan.nextInt());
        
        double resp = r1.getDiscriminante();
        System.out.println("El discriminante es: " + resp);
        boolean band = r1.tieneRaices(resp);
        if (band == true) {
            System.out.println("La ecuación tiene 2 raíces");
        }
        boolean band2 = r1.tieneRaiz(resp);
        if (band2 == true) {
            System.out.println("La ecuación tiene una única raíz");
        }
        r1.calcular(band, band2);
        
        
    }
    
}
