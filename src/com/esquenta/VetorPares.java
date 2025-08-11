package com.esquenta;

import java.util.Scanner;

public class VetorPares {
    public static void main(String[] args ) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números voce quer inserir: ");
        int tamanhoVetor = sc.nextInt();

        int[] numerosInseridos = new int[tamanhoVetor];

        for (int i=0; i < numerosInseridos.length; i++) {

            if (i == 0) {
                System.out.print("Informe um número: ");
            } else {
                System.out.print("Informe outro número: ");
            }
            numerosInseridos[i] = sc.nextInt();
        }

        int[] numerosPares = new int[tamanhoVetor];

        for (int i=0; i < numerosInseridos.length; i++) {

            if (numerosInseridos[i] % 2 == 0) {
                numerosPares[i] = numerosInseridos[i];
            }
        }

        System.out.println("Verificando números pares...");

        for (int i=0; i < numerosInseridos.length; i++) {

            if (numerosPares[i] == 0) {
                System.out.println();
            } else {
                System.out.print(numerosPares[i] + " | ");
            }
        }

        System.out.println("Os números pares inseridos foram exibidos.");

        sc.close();
    }
}