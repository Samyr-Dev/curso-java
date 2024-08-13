package org.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreamEntrada {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\curso-java\\resources\\arquivo.bin";
        try (InputStream inputStream = new FileInputStream(filePath)) {
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                // Faz algo com o byte lido
                System.out.print(byteData + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


