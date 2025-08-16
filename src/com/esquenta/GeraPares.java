package com.esquenta;

import java.util.Random;

public class GeraPares {
    public static void main (String[] args) {

        Random random = new Random();

        int[] vetorNumerico = new int[10];

        for (int i = 0; i < vetorNumerico.length; i++) {

            vetorNumerico[i] = random.nextInt(50) + 1;
        }

        System.out.println("Lista de números gerados: ");
        for (int i = 0; i < vetorNumerico.length; i++) {

            System.out.print(vetorNumerico[i] + " | ");
        }
        System.out.println("- - - - - - - - - - - -");

        int countPares = 0;
        int countImpares = 0;

        for (int i = 0; i < vetorNumerico.length; i++) {

            if (vetorNumerico[i] % 2 == 0) {
                countPares += 1;
            } else {
                countImpares += 1;
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
    }
}
