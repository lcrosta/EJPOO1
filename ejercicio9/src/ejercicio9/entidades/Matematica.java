package ejercicio9.entidades;

import static java.lang.Math.abs;
import static java.lang.Math.min;
import static java.lang.Math.pow;

public class Matematica {
    
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    public double devolverMayor(){
        double resp = Double.max(num1, num2);
        return resp;
    }
    
    public void calcularPotencia(){
        this.num1 = abs(num1);
        this.num2 = abs(num2);
        boolean band;
        int resp = 0;
        if (num1 > num2) {
            band = true;
        } else {
            band = false;
        }
        if (band == true) {
            resp = (int) pow(num1,num2);
        } else {
            resp = (int) pow(num2,num1);
        }
        System.out.println("Potencia: " + resp);
    }
    
    public void calculaRaiz(){
        int resp = (int) min(num1,num2);
        int raiz =(int) Math.sqrt(resp);
        System.out.println("La raíz del menor número " + resp + " es de " + raiz);
    }
    
}
