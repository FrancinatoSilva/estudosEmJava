package com.loiane.javabasico.poo.aula24.aula25.exercicios;

import java.util.Scanner;

public class testLampada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lampada novaLampada = new Lampada();

        novaLampada.estado = "desligada";

        System.out.println("A lampada esta desligada, você deseja liga-la? ");
        String opcaoDesejada1 = sc.nextLine();

        if (opcaoDesejada1.equalsIgnoreCase("sim")) {
            novaLampada.ligarLampada();
            System.out.println("Agora a lampada está " + novaLampada.estado);
        } else {
            System.out.println("A lampada continua desligada.");
        }

        if (novaLampada.estado.equalsIgnoreCase("ligada")) {

            System.out.println("Agora que a lampada está ligada, você deseja desliga-la? ");
            String opcaoDesejada2 = sc.nextLine();

            if (opcaoDesejada2.equalsIgnoreCase("sim")) {
                novaLampada.desligarLampada();
                System.out.println("Agora a lampada está " + novaLampada.estado);
            } else {
                System.out.println("A lampada continua ligada.");
            }
        }
    }
}
