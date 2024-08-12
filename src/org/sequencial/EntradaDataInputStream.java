package org.sequencial;

import java.io.DataInputStream;
import java.io.IOException;

public class EntradaDataInputStream {
    public static void main(String[] args) {
        DataInputStream entrada;
        String str;
        float numero;

        try {
            entrada = new DataInputStream(System.in);
            System.out.println("Entre com um valor float: ");
            str = entrada.readLine();
            numero = Float.parseFloat(str);
            System.out.println(STR."Parse Float: \{numero}");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
