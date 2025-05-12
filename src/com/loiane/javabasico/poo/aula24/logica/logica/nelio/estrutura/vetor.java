package com.loiane.javabasico.poo.aula24.logica.logica.nelio.estrutura;

import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você deseja verificar: ");
        int quantidadeDesejada = sc.nextInt();
        sc.nextLine();

        int[] tamanhoDoVetor = new int[quantidadeDesejada];

        for (int i=0; i < quantidadeDesejada; i++) {
            System.out.print("Informe o número " + (i+1) + " do vetor: ");
            tamanhoDoVetor[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Confira os números negativos do vetor: ");
        for (int i=0; i < quantidadeDesejada; i++) {
            if (tamanhoDoVetor[i] < 0) {
                System.out.println(tamanhoDoVetor[i]);
            }
        }


        sc.close();
    }
}
