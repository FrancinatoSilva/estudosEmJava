package com.esquenta;

import java.util.Scanner;

public class TestPessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Preencha os dados a seguir");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Profissão: ");
        String profissao = sc.nextLine();

        Pessoa pessoa1 = new Pessoa(nome, idade, profissao);

        System.out.println("Você se chama " + pessoa1.getNome() + ", tem " + pessoa1.getIdade() +
                " anos e trabalha como " + pessoa1.getProfissao() + ".");




        sc.close();
    }
}
