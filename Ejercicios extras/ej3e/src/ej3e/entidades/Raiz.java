package ej3e.entidades;

public class Raiz {

    private int a;
    private int b;
    private int c;

    public Raiz(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        double resp = 0;
        resp = ((b * b) - (4 * a * c));
        return resp;
    }

    public boolean tieneRaices(double dis) {
        boolean band;
        if (dis > 0) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }

    public boolean tieneRaiz(double dis) {
        boolean band = false;
        if (dis == 0) {
            band = true;
        } else {
            band = false;
        }
        return band;
    }

    public void obtenerRaices() {
        double raiz1, raiz2;
        raiz1 = (-(b) + (Math.sqrt((b * b) - (4 * a * c))));
        raiz2 = (-(b) - (Math.sqrt((b * b) - (4 * a * c))));
        System.out.println("La primer raíz es: " + (raiz1) / (2 * a));
        System.out.println("La segunda raíz es: " + (raiz2) / (2 * a));
    }

    public void obtenerRaiz() {
        double raiz;
        raiz = (-(b) + (Math.sqrt((b * b) - (4 * a * c))));
        System.out.println("La única raíz es: " + (raiz) / (2 * a));
    }

    public void calcular(boolean band1, boolean band2) {
        if (band1 == true) {
            obtenerRaices();
        } else if (band2 == true) {
            obtenerRaiz();
        } else {
            System.out.println("NO TIENE SOLUCIÓN");
        }

    }

}
