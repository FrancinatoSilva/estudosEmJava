package com.esquenta;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        System.out.println("= = = = = = TABUADA = = = = = =");
        System.out.println("1 X " + numero + " = " + (numero * 1));
        System.out.println("2 X " + numero + " = " + (numero * 2));
        System.out.println("3 X " + numero + " = " + (numero * 3));
        System.out.println("4 X " + numero + " = " + (numero * 4));
        System.out.println("5 X " + numero + " = " + (numero * 5));
        System.out.println("6 X " + numero + " = " + (numero * 6));
        System.out.println("7 X " + numero + " = " + (numero * 7));
        System.out.println("8 X " + numero + " = " + (numero * 8));
        System.out.println("9 X " + numero + " = " + (numero * 9));
        System.out.println("10 X " + numero + " = " + (numero * 10));
    }
}
