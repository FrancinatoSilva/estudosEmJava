package com.logica.estruturadedados;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int quantidadePessoas = sc.nextInt();
        sc.nextLine();

        double[] alturaPessoas = new double[quantidadePessoas];
        char[] generoPessoas  = new char[quantidadePessoas];

        for (int i=0; i < quantidadePessoas; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturaPessoas[i] = sc.nextDouble();
            sc.nextLine();

            System.out.print("Gênero da " + (i+1) + "a pessoa: ");
            generoPessoas[i] = sc.next().charAt(0);
        }

        double maiorAltura = 0;
        for (int i=0; i < quantidadePessoas; i++) {

            if (alturaPessoas[i] > maiorAltura) {
                maiorAltura = alturaPessoas[i];
            }
        }

        double menorAltura = alturaPessoas[0];
        for (int i=0; i < quantidadePessoas; i++) {

            if (alturaPessoas[i] < menorAltura) {
                menorAltura = alturaPessoas[i-1];
            }
        }

        double somaAlturasF = 0;
        int quantidadeDeMulheres = 0;

        for (int i=0; i < quantidadePessoas; i++) {
            if (Character.toLowerCase(generoPessoas[i]) == 'f') {
                somaAlturasF += alturaPessoas[i];
                quantidadeDeMulheres++;
            }
        }
        double mediaAlturasF = somaAlturasF / quantidadeDeMulheres;

        int quantidadeDeHomens = 0;
        for (int i=0; i < quantidadePessoas; i++) {

            if (Character.toLowerCase(generoPessoas[i]) == 'm') {
                quantidadeDeHomens++;
            }
        }

        System.out.println("Menor Altura = " + menorAltura);
        System.out.println("Maior Altura = " + maiorAltura);
        System.out.printf("Média das Alturas das mulheres = %.2f", mediaAlturasF);
        System.out.println();
        System.out.println("Número de homens = " + quantidadeDeHomens);


        sc.close();
    }
}