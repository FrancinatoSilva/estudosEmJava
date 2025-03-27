package arrayUnidimensional;

import java.util.Scanner;

public class somaVetores {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores você vai digitar em cada vetor: ");
        int tamanhoVetor = sc.nextInt();

        int[] vetorA = new int[tamanhoVetor];
        int[] vetorB = new int[tamanhoVetor];
        int[] somaVetores = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i < tamanhoVetor; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i=0; i < tamanhoVetor; i++) {
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i=0; i < tamanhoVetor; i++) {
            somaVetores[i] = vetorA[i] + vetorB[i];
            System.out.println(somaVetores[i]);
        }





        sc.close();
    }
}
