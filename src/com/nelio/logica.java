package com.nelio;

import java.util.Scanner;

public class logica {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int tamanhoVetor = sc.nextInt();

        int[] vet = new int[tamanhoVetor];

        for (int i=0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        int somaPares = 0;
        int contaPares = 0;
        for (int i=0; i < tamanhoVetor; i++) {
            if (vet[i] % 2 == 0) {
                somaPares += vet[i];
                contaPares += 1;
            }
        }

        double mediaPares = (double) somaPares / contaPares;

        if (somaPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.println("MEDIA DOS PARES = " + mediaPares);
        }

        sc.close();
    }
}