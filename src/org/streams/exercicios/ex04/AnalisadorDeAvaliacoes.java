package org.streams.exercicios.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnalisadorDeAvaliacoes {

    public static void main(String[] args) {
        // Criação de avaliações
        List<Avaliacao> avaliacoes = Arrays.asList(
                new Avaliacao("Ana", 8.5, "TI"),
                new Avaliacao("Bruno", 7.0, "TI"),
                new Avaliacao("Carlos", 9.0, "RH"),
                new Avaliacao("Diana", 8.0, "TI")
        );

        // Filtrar avaliações do departamento de TI
        List<Avaliacao> avaliacoesTI = avaliacoes.stream()
                .filter(a -> a.getDepartamento().equals("TI"))
                .toList();

        // Mapear nomes dos funcionários do departamento de TI
        List<String> nomesTI = avaliacoesTI.stream()
                .map(Avaliacao::getNomeFuncionario)
                .toList();

        // Calcular a média das notas do departamento de TI
        double mediaNotasTI = avaliacoesTI.stream()
                .mapToDouble(Avaliacao::getNota)
                .average()
                .orElse(0);

        // Imprimir funcionários com nota superior à média
        List<String> funcionariosAcimaDaMedia = avaliacoesTI.stream()
                .filter(a -> a.getNota() > mediaNotasTI)
                .map(Avaliacao::getNomeFuncionario)
                .toList();

        System.out.println(STR."Funcionários do departamento de TI: \{nomesTI}");
        System.out.println(STR."Média das notas de TI: \{mediaNotasTI}");
        System.out.println(STR."Funcionários com nota acima da média: \{funcionariosAcimaDaMedia}");
    }
}
