package ej4e.entidades;

import static java.lang.Math.round;
import java.util.Scanner;

public class NIF {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
                
    private long dni;
    private char let;

    public NIF() {
    }

    public NIF(long dni, char let) {
        this.dni = dni;
        this.let = let;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLet(char let) {
        this.let = let;
    }

    public long getDni() {
        return dni;
    }

    public char getLet() {
        return let;
    }
    
    public int crearNif(){
        System.out.println("Ingrese su DNI, sin puntos");
        this.dni = scan.nextLong();
        double rdo = (dni % 23);
        int num = (int) round(rdo);
        return num;
    }
    
    public void mostar(String[] vec, int num){
        System.out.println(dni + "-" + vec[num]);
    }
    
}
