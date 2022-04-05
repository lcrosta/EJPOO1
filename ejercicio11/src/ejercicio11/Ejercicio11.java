package ejercicio11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese año, mes y día EN ESE RESPECTIVO ORDEN");
        
        Date fechaPedida = new Date(scan.nextInt()-1900, scan.nextInt()-1, scan.nextInt());
        
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("La fecha ingresada es: " + fecha.format(fechaPedida));
        
        Date fechaActual = new Date();
        
        System.out.println("La fecha actual es: " + fecha.format(fechaActual));
        
        System.out.println("La cantidad de años que han pasado es de: " + (fechaActual.getYear() - fechaPedida.getYear()));
        
    }

}
