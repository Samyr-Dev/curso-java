package org.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaScanner {

    public static void main(String[] args) {
        Scanner entrada1;
        Scanner entrada2;
        entrada1 = new Scanner(System.in).useLocale(Locale.US);  // ATENÇÃO PARA NUMEROS FLOAT
        entrada2 = new Scanner(System.in);
        float numero1;
        int numero2;


        System.out.println("Entre com um valor float: ");
        numero1 = entrada1.nextFloat();
        System.out.println(STR."Valor digitado é: \{numero1}");

        System.out.println("Entre com um valor int: ");
        numero2 = entrada2.nextInt();
        System.out.println(STR."Valor digitado é: \{numero2}");

    }
}
