package org.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteStreamSaida {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\curso-java\\resources\\arquivo.bin";
        byte[] data = {10, 20, 30, 40, 50};

        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

