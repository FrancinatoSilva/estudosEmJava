package com.loiane.cursojava.exercicios28a33;

import java.util.Locale;
import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("===Preencha os dados da conta===");

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("Limite: ");
        double limite = sc.nextDouble();

        Conta contaTeste = new Conta(numero, saldo, status, limite);

        System.out.print("Quanto de dinheiro você deseja sacar: ");
        double valorDeSaque = sc.nextDouble();

        System.out.println("Quanto de dinheiro você deseja depositar: ");
        double valorDeDeposito = sc.nextDouble();
        contaTeste.sacarDinheiro(valorDeSaque);

        System.out.println();
        contaTeste.depositarDinheiro(valorDeDeposito);



        sc.close();
    }
}