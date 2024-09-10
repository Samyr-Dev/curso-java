package org.streams.exercicios.ex02;

import java.util.List;

public class Pedido {
    private String cliente;
    private List<Item> itens;
    private boolean pago;

    public Pedido(String cliente, List<Item> itens, boolean pago) {
        this.cliente = cliente;
        this.itens = itens;
        this.pago = pago;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public boolean isPago() {
        return pago;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }
}

class Item {
    private String nomeProduto;
    private double valor;

    public Item(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
