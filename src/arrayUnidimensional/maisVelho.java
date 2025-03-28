package arrayUnidimensional;

import java.util.Scanner;

public class maisVelho {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);


        System.out.print("Quantas pessoas você vai digitar: ");
        int quantidadePessoas = sc.nextInt();

        Pessoa[] levantamento = new Pessoa[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa: ");

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            levantamento[i] = new Pessoa(nome, idade);
        }

        int posicaoDoMaisVelho = 0;
        int maiorIdade = levantamento[0].getIdade();

        for (int i = 0; i < quantidadePessoas; i++) {

            if (levantamento[i].getIdade() > maiorIdade) {
                maiorIdade = levantamento[i].getIdade();
                posicaoDoMaisVelho++;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + levantamento[posicaoDoMaisVelho].getNome());




        sc.close();
    }
}
