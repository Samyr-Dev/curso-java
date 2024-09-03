package org.streams.exercicios.ex01;

import org.streams.exercicios.ex01.Funcionario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioDTO {

    public static void main(String[] args) {
        // Criação da lista de funcionários
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", 28, 2500.0),
                new Funcionario("Bruno", 35, 3500.0),
                new Funcionario("Carlos", 40, 4500.0),
                new Funcionario("Diana", 22, 2000.0),
                new Funcionario("Eduardo", 31, 3200.0)
        );

        // Filtragem: Funcionários com idade superior a 30 anos
        List<Funcionario> funcionariosComMaisDe30 = funcionarios.stream()
                .filter(f -> f.getIdade() > 30)
                .toList();

        System.out.println("Funcionários com idade superior a 30 anos:");
        funcionariosComMaisDe30.forEach(System.out::println);

        // Mapeamento: Lista de nomes dos funcionários
        List<String> nomesDosFuncionarios = funcionarios.stream()
                .map(Funcionario::getNome)
                .toList();

        System.out.println("\nLista de nomes dos funcionários:");
        nomesDosFuncionarios.forEach(System.out::println);

        // Redução: Soma dos salários dos funcionários
        double somaDosSalarios = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .sum();

        System.out.println(STR."\nSoma total dos salários: \{somaDosSalarios}");
    }
}
