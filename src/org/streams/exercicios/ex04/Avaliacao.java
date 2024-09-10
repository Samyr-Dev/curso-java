package org.streams.exercicios.ex04;

public class Avaliacao {
    private String nomeFuncionario;
    private double nota;
    private String departamento;

    public Avaliacao(String nomeFuncionario, double nota, String departamento) {
        this.nomeFuncionario = nomeFuncionario;
        this.nota = nota;
        this.departamento = departamento;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public double getNota() {
        return nota;
    }

    public String getDepartamento() {
        return departamento;
    }
}
