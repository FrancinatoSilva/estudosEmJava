package models;

public class Conta {
    private int numero;
    private String titular;
    private double depositoInicial;

    public Conta() {
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.depositoInicial = depositoInicial;

    }
}
