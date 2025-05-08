package com.loiane.javabasico.poo.aula24.aula25.exercicios;

public class ContaCorrente {

    int numero;
    double saldo;
    String status; //Conta especial ou não
    double limite;

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
