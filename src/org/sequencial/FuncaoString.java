package org.sequencial;

import javax.swing.*;

public class FuncaoString {
    public static void main(String[] args) {

        String str;

        str = JOptionPane.showInputDialog("Digite uma frase: ");
        // Tamanho da string
        JOptionPane.showMessageDialog(null,STR."Quantidade de caracteres: \{str.length()}");
        // Caracter do posição do indice
        JOptionPane.showMessageDialog(null,STR."Caracter posição 7: \{str.charAt(7)}");
        // Todos caracteres maiúsculos
        JOptionPane.showMessageDialog(null,STR."Maiúsculo: \{str.toUpperCase()}");
        // Metodo toLowerCase é utilizado para transformar caracteres em minúsculos
        JOptionPane.showMessageDialog(null,STR."Minúsculo: \{str.toLowerCase()}");
        // Metodo substring é utilizado para buscar subcadeias dentro de uma strigns
        JOptionPane.showMessageDialog(null,STR."Substring: \{str.substring(10)}");
        JOptionPane.showMessageDialog(null,STR."Substring: \{str.substring(3,10)}");
        // Metodo trin é utilizado remover todos os espaços em branco
        JOptionPane.showMessageDialog(null,STR."Espaço em branco removido: \{str.trim()}");
        // Metodo replace é utilizado para substituição de caracteres ou grupo de caracteres
        JOptionPane.showMessageDialog(null,STR."Substituindo C. por Corrêa: \{str.replace("C.","Corrêa")}");
        JOptionPane.showMessageDialog(null,STR."Retirando os espaços em branco: \{str.replace(" ","")}");

    }
}
