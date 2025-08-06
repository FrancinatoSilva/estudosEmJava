package com.esquenta;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Até quanto você quer contar: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }



        sc.close();
    }
}