package org.sequencial;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class ConfiguracoesRegionais {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Locale regiao = Locale.getDefault();
        Double valor = 1370.25;

        if (regiao.getCountry().equals("BR")){
            df.applyPattern("R$ #,##0.00");
        }
        JOptionPane.showMessageDialog(
                null,
                STR."\nSigla: \{regiao.getCountry()}"+
                        STR."\nPais: \{regiao.getDisplayCountry()}"+
                        STR."\nPais: \{regiao.getDisplayLanguage()}"+
                        STR."\nPais: \{regiao.getDisplayName()}"+
                        STR."\nPais: \{df.format(valor)}"
        );

    }
}
