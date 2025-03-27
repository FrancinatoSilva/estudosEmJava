package arrayUnidimensional;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos elementos vai ter o vetor: ");
        int tamanhoVetor = sc.nextInt();

        double[] vetor = new double[tamanhoVetor];

        for (int i=0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double somaVetor = 0.0;
        for (int i=0; i < tamanhoVetor; i++) {
            somaVetor += vetor[i];
        }

        double mediaVetor = somaVetor / tamanhoVetor;

        System.out.printf("MÉDIA DO VETOR: %.3f", mediaVetor);
        System.out.println();

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");

        for (int i=0; i < tamanhoVetor; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.printf("%.1f", vetor[i]);
                System.out.println();
            }
        }

        sc.close();
    }
}
