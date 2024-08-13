package org.streams;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextoStreamEntrada {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\curso-java\\resources\\arquivo.txt";
        try (Reader reader = new FileReader(filePath)) {
            int charData;
            while ((charData = reader.read()) != -1) {
                // Faz algo com o caractere lido
                System.out.print((char) charData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

