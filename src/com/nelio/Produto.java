package com.nelio;

public class Produto {

    private String nome;
    private double valorDeCompra;
    private double valorDeVenda;

    public Produto() {
    }

    public Produto(String nome, double valorDeCompra, double valorDeVenda) {
        this.nome = nome;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDeCompra() {
        return this.valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public double getValorDeVenda() {
        return this.valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }
}