package com.desafio.ninja;

import java.util.Scanner;

public class CadastroNinja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numeroInicial = sc.nextInt();

        System.out.print("Digite o número final: ");
        int numeroFinal = sc.nextInt();

        int quantidadePares = 0;

        System.out.println("Números pares entre " + numeroInicial + " e " + numeroFinal);
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                quantidadePares += 1;
            }
        }

        System.out.println("Quantidade de pares: " + quantidadePares);

        sc.close();
    }
}