package org.sequencial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraLocal {
    public static void main(String[] args) {
        // Criação de uma data
        LocalDate dataAtual = LocalDate.now(); // Data atual
        LocalDate dataEspecifica = LocalDate.of(2024, 8, 16); // Data específica

        // Manipulação de datas
        LocalDate dataMaisUmaSemana = dataAtual.plusWeeks(1); // Adiciona uma semana
        LocalDate dataMenosUmAno = dataAtual.minusYears(1); // Subtrai um ano

        // Criação de data e hora
        LocalDateTime dataHoraAtual = LocalDateTime.now(); // Data e hora atuais
        LocalDateTime dataHoraEspecifica = LocalDateTime.of(2024, 8, 16, 14, 30); // Data e hora específicas

        // Formatação de datas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);

        System.out.println(STR."Data Atual: \{dataAtual}");
        System.out.println(STR."Data Específica: \{dataEspecifica}");
        System.out.println(STR."Data Mais Uma Semana: \{dataMaisUmaSemana}");
        System.out.println(STR."Data Menos Um Ano: \{dataMenosUmAno}");
        System.out.println(STR."Data e Hora Atual: \{dataHoraAtual}");
        System.out.println(STR."Data Formatada: \{dataFormatada}");
    }
}
