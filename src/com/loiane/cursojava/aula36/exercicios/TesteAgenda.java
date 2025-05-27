package com.loiane.cursojava.aula36.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome da agenda: ");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        System.out.print("= = = Cadastre 3 contatos = = = ");
        System.out.println();
        for (int i=0; i < 3; i++) {
            System.out.println("Contato " + (i+1));
            Contato c = new Contato();

            System.out.print("Nome: ");
            c.setNome(sc.nextLine());

            System.out.print("Telefone: ");
            c.setTelefone(sc.nextLine());

            System.out.print("E-mail: ");
            c.setEmail(sc.nextLine());

            contatos[i] = c;
        }

        agenda.setContato(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }

        sc.close();
    }
}
