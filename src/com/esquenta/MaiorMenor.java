package com.esquenta;

import java.util.Scanner;

public class MaiorMenor {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        int numerosInseridos[] = new int[5];


        for (int i = 0; i < 5; i++) {

            if (i == 0) {
                System.out.print("Insira um número: ");
                numerosInseridos[i] = sc.nextInt();

            } else {
                System.out.print("Insira outro número: ");
                numerosInseridos[i] = sc.nextInt();
            }
        }
        //maior número
        int maiorNumero = numerosInseridos[0];
        for (int i = 0; i < 5; i++) {
            if (numerosInseridos[i] > maiorNumero) {
                maiorNumero = numerosInseridos[i];

            }
        }

        //menor número
        int menorNumero = numerosInseridos[0];
        for (int i = 0; i < 5; i++) {
            if (numerosInseridos[i] < menorNumero) {
                menorNumero = numerosInseridos[i];
            }
        }

        System.out.println("Menor número: " + menorNumero);
        System.out.println("Maior número: " + maiorNumero);




        sc.close();
    }
}