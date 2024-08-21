package org.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirListaObjetos {

    public static void main(String[] args) {
        List<String> listaPessoas = Arrays.asList("Daniel","Miguel","Monica","Jordana");

        // Estrutura  for
        System.out.println("\nUtilizando estrutura For");
        for(String nome:listaPessoas){
            System.out.println(nome);
        }

        // Estrutura foreach
        System.out.println("\nUtilizando Iterator");
        Iterator<String> iterator = listaPessoas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Estrutura utilizando stream
        System.out.println("\nUtilizando Stream");
        Stream<String> stream = listaPessoas.stream();
        stream.forEach(System.out::println); //laço interno

    }
}
