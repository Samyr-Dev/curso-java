package org.streams.exercicios.ex01;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return STR."Funcionario{nome='\{nome}\{'\''}, idade=\{idade}, salario=\{salario}\{'}'}";
    }
}
