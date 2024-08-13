package org.sequencial;

public class ConversaoTipo {
    public static void main(String[] args) {

        int numeroI = 10;
        float numeroF = 3.14f;
        double numeroD = 3.14e+5;
        byte numeroB = 127;
        String str = "Daniel C. Silva";

        // Converter int -> float
        float x0 = (float) numeroI;
        // Converter int -> double
        double x1 = (double) numeroI;
        // Converter float -> int
         numeroI = (int) numeroF;
        // Converter string -> int
        numeroI = Integer.parseInt("10");
        // Converter string -> float
        numeroF = Float.parseFloat("3.14");
        // Converter string -> double
        numeroD = Double.parseDouble("3.14e+5");
        // Converter string -> vetor de bytes
        byte b[] = str.getBytes();
        // Converter int -> string
        str = String.valueOf(numeroI);
        // Converter float -> string
        str = String.valueOf(numeroF);
        // Converter double -> string
        str = String.valueOf(numeroD);
        // Converter byte -> string
        str = String.valueOf(numeroB);
    }
}
