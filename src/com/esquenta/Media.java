package com.esquenta;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("= = = = = CONSULTAR MÉDIA = = = = =");

        System.out.print("Nota 1: ");
        int nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        int nota2 = sc.nextInt();
        System.out.print("Nota 3: ");
        int nota3 = sc.nextInt();
        System.out.print("Nota 4: ");
        int nota4 = sc.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("A média do aluno foi " + media + " e ele foi aprovado!");
        } else {
            System.out.println("A média do aluno foi " + media + " e ele foi reprovado!");
        }

        sc.close();
    }
}
