package com.loiane.javabasico.poo.aula24.aula25.exercicios;

public class ContaCorrente {

    public int numero;
    public double saldo;
    public String status; //Conta especial ou não
    public double limite;

    boolean verificandoPermissaoDeSaque() {
        return saldo > 0.00;
    }

    double depositarDinheiro(double valorDeDeposito) {
        this.saldo += valorDeDeposito;
        return this.saldo;
    }

    void consultarSaldo() {
        System.out.printf("Saldo: %.2f", this.saldo);
    }

    boolean consultarChequeEspecial() {
        return status.equalsIgnoreCase("especial");
    }
}
