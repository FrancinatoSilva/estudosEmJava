package com.esquenta;

import java.util.Scanner;

public class TesteUsuario {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Como posso chama-lo? ");
        String nome = sc.nextLine();

        Usuario novoUsuario = new Usuario(nome);

        System.out.println("Seja bem vindo " + novoUsuario.getNome() + ", o seu id é: " + novoUsuario.getId());

        sc.close();
    }
}
