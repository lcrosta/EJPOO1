package ejercicio12.entidades;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaDeNacimiento;
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private Date fechaActual;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        this.nombre = scan.next();
        System.out.println("Ingrese la fecha de nacimiento");
        int dia = scan.nextInt();
        int mes = scan.nextInt();
        int anio = scan.nextInt();
        p1.fechaDeNacimiento.setDate(dia);
        this.fechaDeNacimiento.setMonth(mes);
        this.fechaDeNacimiento.setYear(anio-1900);
    }

    public void calcularEdad() {
        int edad = (fechaDeNacimiento.getYear() - fechaActual.getYear());
        if (fechaDeNacimiento.getMonth() < fechaActual.getMonth()) {
            edad = edad - 1;
        }
    }

}
