package org.streams;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SocketChannelServer {
    public static void main(String[] args) {
        try {
            // Abre o ServerSocketChannel
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.socket().bind(new InetSocketAddress(5000));
            System.out.println("Servidor ouvindo na porta 5000...");

            while (true) {
                // Espera por uma conexão
                SocketChannel socketChannel = serverChannel.accept();
                System.out.println(STR."Conexão aceita: \{socketChannel.getRemoteAddress()}");

                // Cria um buffer para ler os dados do cliente
                ByteBuffer buffer = ByteBuffer.allocate(1024);

                // Lê os dados do canal
                int bytesRead = socketChannel.read(buffer);
                while (bytesRead != -1) {
                    // Muda o buffer para modo leitura
                    buffer.flip();

                    // Imprime os dados recebidos
                    while (buffer.hasRemaining()) {
                        System.out.print((char) buffer.get());
                    }

                    // Limpa o buffer para a próxima leitura
                    buffer.clear();
                    bytesRead = socketChannel.read(buffer);
                }

                // Fecha a conexão com o cliente
                socketChannel.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
