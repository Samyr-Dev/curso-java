package org.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelSaidaFileStream {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\curso-java\\resources\\arquivo.txt";
        String text = "Este é um exemplo de escrita usando FileChannel.";

        try (FileOutputStream fos = new FileOutputStream(filePath);
             FileChannel fileChannel = fos.getChannel()) {

            // Converte a string para bytes e grava no ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(text.getBytes());

            // Muda o buffer para leitura
            buffer.flip();

            // Escreve os dados do buffer no canal
            fileChannel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
