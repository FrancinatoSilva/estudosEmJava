package com.loiane.javabasico.poo.aula24.logica;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int numeroDeTentativas = 0;

        while (numeroDeTentativas < 5) {
            System.out.print("Advinhe o número em que estou pensando: ");
            int numeroSuposto = sc.nextInt();
            sc.nextLine();

            if (numeroSuposto == numeroSecreto) {
                System.out.println("Parabéns, você acertou!");
                break;

            } else if (numeroSuposto > numeroSecreto) {
                System.out.println("O número digitado é maior do que o número que estou pensando...");

            } else {
                System.out.println("O número digitado é menor do que o número que estou pensando...");
            }

            numeroDeTentativas += 1;
        }

        System.out.println("Você excedeu o limite de tentativas, o número em que eu estava" +
                "penando era " + numeroSecreto);

        sc.close();
    }
}
