package ejercicio10;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        double[] a = new double[50];
        double[] b = new double[20];
        
        for (int i = 0; i < 50; i++) {
            a[i] = Math.random();
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " / ");
        }
        System.out.println("");
        
        Arrays.sort(a);
        
        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " / ");
        }
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        for (int i = 10; i < 20; i++) {
            b[i] = 0.5;
        }
        System.out.println("");
        System.out.println("Vectores terminados");
        
        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " / ");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(b[i] + " / ");
        }
    }
    
}
