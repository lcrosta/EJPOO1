package ejercicio3.entidades;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar() {
        int suma = (numero1 + numero2);
        return suma;
    }

    public void restar() {
        System.out.println("Resta: " + (numero1 - numero2));
    }

    public int multiplicar() {
        int res;
        if (numero1 == 0 || numero2 == 0) {
            res = 0;
            System.out.println("Un número es 0, error");
        } else {
            res = (numero1 * numero2);
            
        }
        return res;
    }
    
    public void dividir(){
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Un número es 0, error");
            System.out.println(0);
        } else {
            System.out.println("División: " + (numero1 / numero2));
        }
    }

}
