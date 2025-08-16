package com.esquenta;

import java.util.Random;
import java.util.Scanner;

public class JogueDado {
    public static void main (String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner (System.in);

        System.out.println("Você deseja lançar o dado? ");
        System.out.println("1 - sim | 2 - não");
        int resposta1 = sc.nextInt();

        if (resposta1 == 1) {
            int resultadoDado = random.nextInt(6) + 1;
            System.out.println("Parabéns! Você tirou um " + resultadoDado +".");
        } else {
            System.out.println("Depois a gente brinca então.");
        }

        sc.close();

    }
}