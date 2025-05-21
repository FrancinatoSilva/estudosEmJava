package com.nelio;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidadeDeNumeros = sc.nextInt();

        int[] vet = new int[quantidadeDeNumeros];
        int[] vetPares = new int[quantidadeDeNumeros];

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        int contaPares = 0;
        for (int i = 0; i < quantidadeDeNumeros; i++) {
            if (vet[i] % 2 == 0) {
                vetPares[i] = vet[i];
                contaPares += 1;
            }
        }
        if (contaPares == 0) {
            System.out.println("Não há números pares!");
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vetPares.length; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println(vetPares[i] + " ");
            }
        }

        System.out.println("QUANTIDADE DE PARES = " + contaPares);

        sc.close();
    }
}