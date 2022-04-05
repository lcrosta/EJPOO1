package ejercicio5;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        Cuenta c1 = new Cuenta();

        System.out.println("Ingrese DNI, número de cuenta y su saldo actual");
        c1.datos(scan.nextInt(), scan.nextInt(), scan.nextDouble());

        int resp;

        do {
            System.out.println("Ingrese la opción deseada"
                    + "1. INGRESO "
                    + "2. RETIRO "
                    + "3. EXTRACCIÓN RÁPIDA "
                    + "4. CONSULTA DE SALDO "
                    + "5. CONSULTA DE DATOS "
                    + "6. SALIR DEL SISTEMA ");
            resp = scan.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Ingrese cantidad a ingresar");
                    c1.ingresar(scan.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar");
                    c1.retirar(scan.nextDouble());
                    break;
                case 3:
                    c1.extraccionRapida();
                    break;
                case 4:
                    c1.consultarSaldo();
                    break;
                case 5:
                    c1.consultarDatos();
                    break;
                case 6:
                    break;
            }
        } while (resp != 6);

    }

}
