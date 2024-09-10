package org.streams.exercicios.ex05;

public class Transacao {
    private String nomeCliente;
    private String tipoTransacao; // debito ou credito
    private double valor;

    public Transacao(String nomeCliente, String tipoTransacao, double valor) {
        this.nomeCliente = nomeCliente;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public double getValor() {
        return valor;
    }
}
