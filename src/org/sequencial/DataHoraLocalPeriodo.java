package org.sequencial;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DataHoraLocalPeriodo {
    public static void main(String[] args) {
        // Período (em anos, meses e dias)
        LocalDate dataInicio = LocalDate.of(2023, 1, 1);
        LocalDate dataFim = LocalDate.of(2024, 1, 1);
        Period periodo = Period.between(dataInicio, dataFim);

        System.out.println(STR."Período: \{periodo.getYears()} anos, \{periodo.getMonths()} meses, \{periodo.getDays()} dias");

        // Duração (em horas, minutos, segundos)
        LocalDateTime inicio = LocalDateTime.of(2024, 8, 16, 14, 30);
        LocalDateTime fim = LocalDateTime.of(2024, 8, 16, 18, 30);
        Duration duracao = Duration.between(inicio, fim);

        System.out.println(STR."Duração: \{duracao.toHours()} horas");
    }
}
