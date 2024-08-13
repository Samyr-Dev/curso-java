/*
* NOTACAO:
*     0: Imprime o dígito normalmente, ou caso ele não exista, coloca 0 em seu lugar.
*        Exemplo: sejam as variáveis int x=4, y=32 e z=154, ao usar o pattern "000", o resultado
*        impresso na tela seria x␣004, y␣032 e z␣154
*     #: Imprime o dígito normalmente, desprezando os zeros à esquerda do número.
*        Exemplo: sejam as variáveis double x=0.4 e y=01.34, ao usar o pattern "##.##",
*        o resultado impresso na tela seria x␣.4, y␣1.34
*     .: Separador decimal ou separador decimal monetário (depende do sistema usado).
*     -: Sinal de numero negativo
 */
package org.sequencial;

import java.text.DecimalFormat;

public class FormatacaoNumero {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat();
        short x0 = 89;
        int quantidade = 9750;
        long estoque = 198564;
        float altura = 1.74f;
        double peso = 70.25;

        df.applyPattern("000");
        System.out.println(df.format(x0));
        df.applyPattern("#0.000");
        System.out.println(df.format(quantidade));
        df.applyPattern("#,##0,000");
        System.out.println(df.format(estoque));
        df.applyPattern("#0.00");
        System.out.println(df.format(altura));
        df.applyPattern("#0.00");
        System.out.println(df.format(peso));
    }
}
