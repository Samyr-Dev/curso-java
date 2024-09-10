package org.streams.exercicios.ex02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessadorPedidos {

    public static void main(String[] args) {
        // Criação de alguns pedidos
        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Ana", Arrays.asList(new Item("Notebook", 1500.0), new Item("Mouse", 50.0)), true),
                new Pedido("Bruno", Arrays.asList(new Item("Celular", 1200.0), new Item("Carregador", 100.0)), false),
                new Pedido("Carlos", Arrays.asList(new Item("TV", 2500.0), new Item("Suporte", 200.0)), true)
        );

        // Filtrar pedidos pagos
        List<Pedido> pedidosPagos = pedidos.stream()
                .filter(Pedido::isPago)
                .toList();

        // Calcular o total de cada pedido e aplicar desconto para pedidos acima de 1000
        List<Double> totaisComDesconto = pedidosPagos.stream()
                .map(p -> p.calcularTotal() > 1000 ? p.calcularTotal() * 0.9 : p.calcularTotal())
                .collect(Collectors.toList());

        // Lista de clientes com pedidos acima de 1500 após desconto
        List<String> clientes = pedidosPagos.stream()
                .filter(p -> p.calcularTotal() > 1500)
                .map(Pedido::getCliente)
                .collect(Collectors.toList());

        System.out.println(STR."Totais com desconto: \{totaisComDesconto}");
        System.out.println(STR."Clientes com pedidos acima de 1500: \{clientes}");
    }
}
