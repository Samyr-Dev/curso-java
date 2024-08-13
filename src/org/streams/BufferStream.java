package org.streams;

import java.nio.FloatBuffer;

public class BufferStream {
    public static void main(String[] args) {
        // Cria um FloatBuffer com capacidade para 5 floats
        FloatBuffer buffer = FloatBuffer.allocate(5);

        // Grava valores no buffer
        buffer.put(1.1f);
        buffer.put(2.2f);
        buffer.put(3.3f);
        buffer.put(4.4f);
        buffer.put(5.5f);

        // Muda o buffer para leitura (flip)
        buffer.flip();

        // Lê valores do buffer
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}
