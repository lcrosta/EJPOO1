package ejercicio4.entidades;


public class Rectangulo {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double perimetro(){
        return (base + altura)*2;
    }
    
    public double area(){
        return (base * altura);
    }
    
    public void mostrar(){
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
            for (int j = 0; j < base - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
