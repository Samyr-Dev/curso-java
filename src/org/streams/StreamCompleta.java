package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCompleta {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João", "Carlos");

        List<String> resultado = nomes.stream()    // Operação inicial
                .filter(nome -> nome.length() > 3) // Operação intermediária
                .map(String::toUpperCase)          // Operação intermediária
                .sorted()                          // Operação intermediária
                .collect(Collectors.toList());     // Operação terminal

        System.out.println(resultado); // Saída: [CARLOS, JOÃO, MARIA, PEDRO]
    }
}

