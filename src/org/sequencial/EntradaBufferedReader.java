package org.sequencial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaBufferedReader {
    public static void main(String[] args) {
        BufferedReader entrada;
        String str;
        float numero;

        try {
            System.out.println("Digite um número do tipo float: ");
            entrada = new BufferedReader(new InputStreamReader(System.in));
            str = entrada.readLine(); // retorna uma string
            numero = Float.parseFloat(str);
            System.out.println(STR."Numero digitado: \{numero}");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
