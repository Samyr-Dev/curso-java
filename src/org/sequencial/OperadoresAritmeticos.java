package org.sequencial;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int x1,x2;
        float y1;
        x1 = 10;
        x2 = 2;
        y1 = 10.0f;

        System.out.println(STR."\nx1 = \{x1}, x2 = \{x2} e y1 = \{y1}\n");
        System.out.println("Concatena: x1 + x2 = "+ x1 + x2); //Erro: concatena e não soma
        System.out.println(STR."Soma: x1 + x2 = \{x1 + x2}");
        System.out.println(STR."Soma: x1 - x2 = \{x1 - x2}");
        System.out.println(STR."Multiplicação: x1 * x2 = \{x1*x2}");
        System.out.println(STR."Divisão (int): x1 / x2 = \{x1 / x2}");
        System.out.println(STR."Divisão (int): x1 / 3 = \{x1 / 3}"); // trunca o resultado da divisão: numerador inteiro
        System.out.println(STR."Divisão (float): y1 / 3 = \{y1 / 3}"); //
        System.out.println(STR."Resto da divisão: x1 % 3 = \{x1 % 3}");
        System.out.println(STR."Incremento unário x1++ = \{x1++}");
        System.out.println(STR."Incremento unário ++x1 = \{++x1}");
        System.out.println(STR."Decremento unário: \{x2--}");
        System.out.println(STR."Decremento unário: \{ --x2}");
    }
}
