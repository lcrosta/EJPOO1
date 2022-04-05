package ej4e;

import ej4e.entidades.NIF;

public class Ej4e {

    public static void main(String[] args) {
        
        String[] vector = new String[23];
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";
        
        NIF n1 = new NIF();
        
        int num = n1.crearNif();
        n1.mostar(vector, num);
        
        
    }
    
}
