package com.loiane.javabasico.poo.aula24.logica.logica.nelio.estrutura;

import java.util.Locale;
import java.util.Scanner;

//Código quebrado

public class exVetor02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantidade de pessoas à serem cadastradas: ");
        int quantidadePessoas = sc.nextInt();

        double[] alturaPessoas = new double[quantidadePessoas];
        char[] generoPessoas = new char[quantidadePessoas];

        for (int i=0; i < quantidadePessoas; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturaPessoas[i] = sc.nextDouble();
            sc.nextLine();

            System.out.print("Gênero da " + (i+1) + "a pessoa: ");
            generoPessoas[i] = sc.next().charAt(0);
        }

        //verifica menor altura
        double menorAltura = 0;
        for (int i=0; i < quantidadePessoas; i++) {
            if (alturaPessoas[i] < alturaPessoas[i-1] && alturaPessoas[i] < alturaPessoas[i+1]) {
                menorAltura = alturaPessoas[i];

            }
        }

        //verifica maior altura
        double maiorAltura = 0;
        for (int i=0; i < quantidadePessoas; i++) {
            if (alturaPessoas[i] > alturaPessoas[i-1] && alturaPessoas[i] > alturaPessoas[i+1]) {
                maiorAltura = alturaPessoas[i];
            }
        }

        //média alturas mulheres
        double somaAlturasM = 0;
        for (int i=0; i <quantidadePessoas; i++) {
            if (generoPessoas[i] == 'm' || generoPessoas[i] == 'M') {
                somaAlturasM += alturaPessoas[i];
            }
        }

        double mediaAlturasM = somaAlturasM / quantidadePessoas;

        int quantidadeDeHomens = 0;

        for(int i=0; i < quantidadePessoas; i++) {
            if (generoPessoas[i] == 'h' || generoPessoas[i] == 'H') {
                quantidadeDeHomens++;
            }
        }

        //saída de dados

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Média das alturas das mulheres: " + mediaAlturasM);
        System.out.println("número de homens: " + quantidadeDeHomens);


        sc.close();
    }
}
