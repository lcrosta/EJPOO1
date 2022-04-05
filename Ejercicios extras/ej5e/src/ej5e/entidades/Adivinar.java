package ej5e.entidades;

import java.util.Scanner;

public class Adivinar {

    private String mes[];
    private String resp;

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Adivinar() {
        this.mes = new String[12];
    }

    public Adivinar(String[] mes) {
        this.mes = mes;
    }

    public void rellenarVector() {
        mes[0] = "enero";
        mes[1] = "febrero";
        mes[2] = "marzo";
        mes[3] = "abril";
        mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
        mes[8] = "septiembre";
        mes[9] = "octubre";
        mes[10] = "noviembre";
        mes[11] = "diciembre";
        resp = mes[6];
    }

    public void descubrirMes() {
        System.out.println("Adivine el mes secreto! (introduzca el mes en minúsuculas y en caso de introducir SEPTIEMBRE)");
        String res = scan.next();
        if (res.equals(resp)) {
            System.out.println("Ha adivinado el mes secreto! Felicitaciones");
        } else {
            do {
                System.out.println("No ha adivinado :(. Siga intentando. Ingrese nuevamente");
                res = scan.next();
            } while (!res.equals(resp));
            System.out.println("Ha adivinado el mes secreto! Felicitaciones");
        }
    }

}
