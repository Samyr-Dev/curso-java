package org.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextoStreamSaida {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\curso-java\\resources\\arquivo.txt";
        String text = "Este é um exemplo de escrita em arquivo de texto.";

        try (Writer writer = new FileWriter(filePath)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

