package com.esquenta;

import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Escolha um número: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = 0; i<= n; i++) {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma entre os números percorridos é igual à: " + soma);
    }
}
