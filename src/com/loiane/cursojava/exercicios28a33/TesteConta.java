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
        sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.print("Limite: ");
        double limite = sc.nextDouble();
        sc.nextLine();

        Conta contaTeste = new Conta(numero, saldo, status, limite);

        System.out.print("Quanto de dinheiro você deseja sacar: ");
        double valorDeSaque = sc.nextDouble();
        sc.nextLine();

        contaTeste.sacarDinheiro(valorDeSaque);



        sc.close();
    }
}