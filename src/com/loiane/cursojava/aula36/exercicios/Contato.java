package com.loiane.cursojava.aula36.exercicios;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    public Contato() {

    }

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo() {
        return "Nome = " + nome + ";" +
                "telefone = " + telefone + ";" +
                "Email = " + email + ";";
    }
}
