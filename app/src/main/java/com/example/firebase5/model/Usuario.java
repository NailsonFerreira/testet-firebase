package com.example.firebase5.model;

public class Usuario {

    private String nome;
    private int id;
    private String nascimento;

    public Usuario() {
    }

    public Usuario(String nome, int id, String nascimento) {
        this.nome = nome;
        this.id = id;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
