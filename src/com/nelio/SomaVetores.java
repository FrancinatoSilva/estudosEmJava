package com.nelio;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int tamanhoArray = sc.nextInt();

        double arrayNumerica [] = new double [tamanhoArray];

        for (int i = 0; i < arrayNumerica.length; i++) {
            System.out.print("Digite um número: ");
            arrayNumerica[i] = sc.nextDouble();
        }

        double maiorValor = 0;
        int posicaoDoMaior = 0;
        for (int i = 0; i < arrayNumerica.length; i++) {
            if (arrayNumerica[i] > maiorValor) {
                maiorValor = arrayNumerica[i];
                posicaoDoMaior++;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor );
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoDoMaior);






        sc.close();
    }
}