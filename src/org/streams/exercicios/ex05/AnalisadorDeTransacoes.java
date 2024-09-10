package org.streams.exercicios.ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnalisadorDeTransacoes {

    public static void main(String[] args) {
        // Criação de transações
        List<Transacao> transacoes = Arrays.asList(
                new Transacao("Ana", "credito", 1000.0),
                new Transacao("Bruno", "debito", 200.0),
                new Transacao("Carlos", "credito", 1500.0),
                new Transacao("Diana", "debito", 300.0)
        );

        // Filtrar transações de crédito
        List<Double> valoresCredito = transacoes.stream()
                .filter(t -> t.getTipoTransacao().equals("credito"))
                .map(Transacao::getValor)
                .toList();

        // Somar o total das transações de crédito
        double totalCredito = transacoes.stream()
                .filter(t -> t.getTipoTransacao().equals("credito"))
                .mapToDouble(Transacao::getValor)
                .sum();

        // Somar o total das transações de débito
        double totalDebito = transacoes.stream()
                .filter(t -> t.getTipoTransacao().equals("debito"))
                .mapToDouble(Transacao::getValor)
                .sum();

        System.out.println(STR."Valores das transações de crédito: \{valoresCredito}");
        System.out.println(STR."Total das transações de crédito: \{totalCredito}");
        System.out.println(STR."Total das transações de débito: \{totalDebito}");
    }
}
