package org.streams.exercicios.ex03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorDeTarefas {

    public static void main(String[] args) {
        // Criação de tarefas
        List<Tarefa> tarefas = Arrays.asList(
                new Tarefa("Deconvolve site", "alta", 10),
                new Tarefa("Escrever documentação", "media", 4),
                new Tarefa("Reunião com cliente", "alta", 2),
                new Tarefa("Testes automatizados", "baixa", 6)
        );

        // Filtrar tarefas com prioridade alta
        List<Tarefa> tarefasPrioridadeAlta = tarefas.stream()
                .filter(t -> t.getPrioridade().equals("alta"))
                .toList();

        // Mapear descrições das tarefas
        List<String> descricoes = tarefas.stream()
                .map(Tarefa::getDescricao)
                .toList();

        // Calcular o tempo total de tarefas de alta prioridade
        int tempoTotal = tarefasPrioridadeAlta.stream()
                .mapToInt(Tarefa::getTempoEstimado)
                .sum();

        // Ordenar tarefas por prioridade
        List<Tarefa> tarefasOrdenadas = tarefas.stream()
                .sorted((t1, t2) -> t1.getPrioridade().compareTo(t2.getPrioridade()))
                .toList();

        System.out.println(STR."Tarefas de alta prioridade: \{tarefasPrioridadeAlta}");
        System.out.println(STR."Descrições: \{descricoes}");
        System.out.println(STR."Tempo total de alta prioridade: \{tempoTotal} horas");
        System.out.println(STR."Tarefas ordenadas por prioridade: \{tarefasOrdenadas}");
    }
}
