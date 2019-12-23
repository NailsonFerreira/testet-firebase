package com.example.firebase5.model;

public class Usuario {

    private String nome;
    private int idade;
    private String nascimento;

    public Usuario() {
    }

    public Usuario(String nome, int idade, String nascimento) {
        this.nome = nome;
        this.idade = idade;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return String.format("{\"nome\":\"%s\"," +
                "\"idade\":\"%s\"," +
                "\"nascimento\":\"%s\"" +
                "}",
                nome,idade,nascimento);
    }
}
