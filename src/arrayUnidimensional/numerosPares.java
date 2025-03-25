package arrayUnidimensional;

import java.util.Scanner;

public class numerosPares {
    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar: ");
        int quantidadeNumeros = sc.nextInt();

        int[] vetorNumerico = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite um número: ");
            vetorNumerico[i] = sc.nextInt();
        }
        System.out.println();

        int somaPares = 0;

        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (vetorNumerico[i] % 2 == 0) {
                somaPares++;
                System.out.print(vetorNumerico[i] + "  ");
            }
        }
        System.out.println();
        System.out.printf("QUANTIADE DE PARES = %d", somaPares);

        sc.close();
    }

}
