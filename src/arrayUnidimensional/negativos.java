package arrayUnidimensional;

import java.util.Scanner;

public class negativos {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar: ");
        int quantidadeNumeros = sc.nextInt();

        int[] numeros = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            } else {
                System.out.println("Nenhum número negativo informado!");
            }
        }





        sc.close();
    }
}
