package arrayUnidimensional;

import java.util.Locale;
import java.util.Scanner;

public class mediaPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int tamanhoVetor = sc.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i=0; i < tamanhoVetor; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            System.out.println();
        }

        int somaPares = 0;
        int quantidadePares = 0;
        for (int i=0; i < tamanhoVetor; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares++;
            }
        }

        if (quantidadePares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            double mediaPares = (double) somaPares / quantidadePares;
            System.out.printf("MÉDIA DOS PARES: %.1f", mediaPares);
        }

        sc.close();
    }
}
