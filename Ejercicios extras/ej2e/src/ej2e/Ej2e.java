package ej2e;

import ej2e.entidades.Punto;

public class Ej2e {

    public static void main(String[] args) {
        
        Punto p1 = new Punto();
        
        p1.crearPuntos();
        
        double res = p1.distanciaPuntos();
        System.out.println("La distancia entre los puntos es de: " + res);
        
    }
    
}
