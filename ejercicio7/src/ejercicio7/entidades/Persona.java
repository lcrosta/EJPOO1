package ejercicio7.entidades;

import java.util.Scanner;

public class Persona {

    private Scanner scan = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void crearPersona() {

        System.out.println("Ingrese el nombre de la persona");
        this.nombre = scan.next();
        System.out.println("Ingrese la edad");
        this.edad = scan.nextInt();
        System.out.println("Ingrese el peso en kg");
        this.peso = scan.nextDouble();
        System.out.println("Ingrese la altura en metros");
        this.altura = scan.nextDouble();
        System.out.println("Ingrese el sexo: (H) Hombre (M) Mujer (O) Otro");
        String gen = scan.next();

        if ("O".equalsIgnoreCase(gen) || "H".equalsIgnoreCase(gen) || "M".equalsIgnoreCase(gen)) {
            this.sexo = gen;
        } else {
            System.out.println("Ingreso incorrecto");
            boolean band;
            do {
                System.out.println("Ingrese el sexo válido");
                gen = scan.next();
                if ("O".equalsIgnoreCase(gen) || "H".equalsIgnoreCase(gen) || "M".equalsIgnoreCase(gen)) {
                    this.sexo = gen;
                    band = true;
                } else {
                    band = false;
                }
            } while (band == false);

        }
    }

    public int calcularIMC() {
        int rdo1 = 0;
        double rdo2 = (peso / (altura * altura));
        if (rdo2 < 20) {
            rdo1 = -1;
        } else if (rdo2 >= 20 && rdo2 <= 25) {
            rdo1 = 0;
        } else if (rdo2 > 25) {
            rdo1 = 1;
        }
        return rdo1;
    }

    public boolean esMayorDeEdad() {
        boolean band = false;
        if (edad >= 18) {
            band = true;
        } else if (edad < 18) {
            band = false;
        }
        return band;
    }

}
