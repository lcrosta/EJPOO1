package ejercicio6.entidades;

public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
    }
    
    
    public void servirTaza(double taza){
        if (taza > this.cantidadActual) {
            System.out.println("La taza no ha sido llenada, se llenó " + cantidadActual);
            this.cantidadActual = 0;
        } else if (taza <= this.cantidadActual) {
            this.cantidadActual -= taza;
            System.out.println("Se ha llenado la taza");
        }
    }
    
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    
    public void agregarCafe(double cafe){
        this.cantidadActual += cafe;
    }
    
}
