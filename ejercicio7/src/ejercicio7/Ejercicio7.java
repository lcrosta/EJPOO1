package ejercicio7;

import ejercicio7.entidades.Persona;

public class Ejercicio7 {

    public static void main(String[] args) {

        Persona[] p = new Persona[4];

        for (int i = 0; i < 4; i++) {
            p[i] = new Persona();
        }

        for (int i = 0; i < 4; i++) {
            p[i].crearPersona();
        }

        int[] peso = new int[4];
        boolean[] edad = new boolean[4];

        for (int i = 0; i < 4; i++) {
            peso[i] = p[i].calcularIMC();
            edad[i] = p[i].esMayorDeEdad();
        }

        int contador = 0;
        int bajo = 0, bien = 0, sobre = 0;

        for (int i = 0; i < 4; i++) {
            if (edad[i] == true) {
                contador += 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (peso[i] == -1) {
                bajo += 1;
            } else if (peso[i] == 0) {
                bien += 1;
            } else if (peso[i] == 1) {
                sobre += 1;
            }
        }

        System.out.println("Mayores de edad: " + ((contador * 100) / 4) + "%");
        System.out.println("Menores de edad: " + ((4 - contador) * 100) / 4 + "%");
        System.out.println("Bajo de peso: " + ((bajo * 100) / 4) + "%");
        System.out.println("Bien de peso: " + ((bien * 100) / 4) + "%");
        System.out.println("Exceso de peso: " + ((sobre * 100) / 4) + "%");

    }

}
