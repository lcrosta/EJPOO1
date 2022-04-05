package ejercicio8.entidades;

public class Cadena {
    
    private String frase;
    private int lon;

    public Cadena() {
    }

    public Cadena(String frase, int lon) {
        this.frase = frase;
        this.lon = lon;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public String getFrase() {
        return frase;
    }

    public int getLon() {
        return lon;
    }
    
    public void longitudFrase(){
        lon = frase.length();
    }
    
    public void mostrarVocales(){
        int contador = 0;
        String parte;
        for (int i = 0; i < lon; i++) {
            parte = frase.substring(i, i+1);
            switch (parte) {
                case "a":
                    contador += 1;
                    break;
                case "A":
                    contador += 1;
                    break;
                case "e":
                    contador += 1;
                    break;
                case "E":
                    contador += 1;
                    break;
                case "i":
                    contador += 1;
                    break;
                case "I":
                    contador += 1;
                    break;
                case "o":
                    contador += 1;
                    break;
                case "O":
                    contador += 1;
                    break;
                case "u":
                    contador += 1;
                    break;
                case "U":
                    contador += 1;
                    break;
            }
        }
        System.out.println("La cantidad de vocales encontradas fue de: " + contador);
    }
    
    public void vecesRepetido(String letra){
        int contador = 0;
        String parte;
        for (int i = 0; i < lon; i++) {
            parte = frase.substring(i, i+1);
            if (parte.equalsIgnoreCase(letra)) {
                contador += 1;
            }
        }
        System.out.println("La letra " + letra + " se ha encontrado " + contador + " veces.");
    }
    
    public void compararLongitud(String frase){
        int lon2 = frase.length();
        System.out.println("La longitud de la nueva cadena es de: " + lon2);
        System.out.println("La longitud de la primer cadena es de: " + lon);
    }
    
    public void unirFrases(String frase){
        System.out.println(this.frase.concat(" " + frase));
    }
    
    public void reemplazar(String letra){
        String[] vector = new String[lon];
        for (int i = 0; i < lon; i++) {
            vector[i] = frase.substring(i, i+1);
            if (vector[i].equalsIgnoreCase("a")) {
                vector[i] = letra;
            }
            System.out.print(vector[i]);
        }
        System.out.println("");
        for (int i = 0; i < lon; i++) {
            
        }
    }
    
    public boolean contiene(String letra){
        boolean band = false;
        String parte;
        for (int i = 0; i < lon; i++) {
            parte = frase.substring(i, i+1);
            if (parte.equals(letra)) {
                band = true;
            }
        }
        return band;
    }
    
    public void invertirFrase(){
        String invertida = frase.substring(lon-1, lon);
        String parte;
        for (int i = (lon - 1); i >= 1; i--) {
            parte = frase.substring(i-1, i);
            invertida = invertida.concat(parte);
        }
        System.out.println(invertida);
    }
    
}
