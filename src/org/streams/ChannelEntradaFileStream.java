package org.streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelEntradaFileStream {
    public static void main(String[] args) {
        String filePath = "E:\\dev\\curso-java\\resources\\arquivo.txt";
        try (FileInputStream fis = new FileInputStream(filePath);
             FileChannel fileChannel = fis.getChannel()) {

            // Cria um ByteBuffer para armazenar os dados lidos
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // Lê os dados do canal para o buffer
            int bytesRead = fileChannel.read(buffer);

            while (bytesRead != -1) {
                // Muda o buffer para leitura
                buffer.flip();

                // Converte os bytes para string e imprime
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                // Limpa o buffer para a próxima leitura
                buffer.clear();
                bytesRead = fileChannel.read(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

