package org.sequencial;

import javax.swing.*;

public class EntradaJOptionPanel {

    public static void main(String[] args) {
        String str;
        float numero;

        try {
            str = JOptionPane.showInputDialog("Entre com um número float: ");
            System.out.println(Float.parseFloat(str));
        }
        catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null,"Erro de conversão ..." );
        }
    }
}
