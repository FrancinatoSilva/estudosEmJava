package com.loiane.javabasico.poo.aula24.aula25.exercicios;

import com.loiane.javabasico.poo.aula24.exercicios.ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteApp {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        ContaCorrente conta1 = new ContaCorrente();

        System.out.println("Preencha os dados da sua conta: ");

        System.out.print("Número: ");

        System.out.print("Saldo");

        System.out.print("Status: ");

        System.out.print("Limite: ");

        sc.close();
    }
}
