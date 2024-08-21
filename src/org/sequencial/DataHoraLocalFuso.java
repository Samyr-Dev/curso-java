package org.sequencial;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataHoraLocalFuso {
    public static void main(String[] args) {
        // Data e hora com fuso horário específico
        ZonedDateTime dataHoraComFuso = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println(STR."Data e Hora com Fuso Horário: \{dataHoraComFuso}");

        // Convertendo entre fusos horários
        ZonedDateTime dataHoraNovaYork = dataHoraComFuso.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println(STR."Data e Hora em Nova York: \{dataHoraNovaYork}");
    }
}
