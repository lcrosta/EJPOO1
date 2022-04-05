package ejercicio9;

import ejercicio9.entidades.Matematica;

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Matematica m1 = new Matematica();
        
        m1.setNum1(Math.random());
        m1.setNum2(Math.random());
        
        double resp = m1.devolverMayor();
        System.out.println("El valor mayor es de: " + resp);
        
        m1.calcularPotencia();
        
        m1.calculaRaiz();
        
        
        
    }
    
}
