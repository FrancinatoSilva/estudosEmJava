package com.loiane.cursojava.exercicios28a33;

public class Conta {

    private int numero;
    private double saldo;
    private String status; //Informa se é uma conta especial ou não
    private double limite;

    public Conta() {
    }
    public Conta(int numero, double saldo, String status, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.status = status;
        this.limite = limite;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double sacarDinheiro(double valorDeSaque) {
        if (valorDeSaque > getSaldo()) {
            System.out.println("Você não tem saldo o suficiente");

        } else {
            this.saldo -= valorDeSaque;
        }
        System.out.printf("Seu saldo atual é de R$%.2f", getSaldo());
        return getSaldo();
    }
}