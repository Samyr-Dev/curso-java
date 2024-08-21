package org.streams;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelClient {
    public static void main(String[] args) {
        try {
            // Abre o SocketChannel e se conecta ao servidor
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("localhost", 5000));

            String message = "Hello, Server! This is a message from the client.";

            // Cria um buffer e escreve a mensagem nele
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(message.getBytes());

            // Muda o buffer para modo leitura
            buffer.flip();

            // Envia a mensagem ao servidor
            socketChannel.write(buffer);

            // Fecha o canal
            socketChannel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
