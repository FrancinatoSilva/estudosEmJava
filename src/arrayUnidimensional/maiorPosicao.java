package arrayUnidimensional;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar: ");
        int quantidadeNumerica = sc.nextInt();

        double[] vetorNumerico = new double[quantidadeNumerica];

        for (int i = 0; i < quantidadeNumerica; i++) {
            System.out.print("Digite um número: ");
            vetorNumerico[i] = sc.nextDouble();
        }

        double maiorValor = 0.0;
        int posicaoDoMaior = 0;
        for (int i = 0; i < quantidadeNumerica; i++) {
            if (vetorNumerico[i] > maiorValor) {
                posicaoDoMaior++;
                maiorValor = vetorNumerico[i];

            }
        }

        System.out.printf("MAIOR VALOR = %.1f", maiorValor);
        System.out.println();
        System.out.printf("POSICAO DO MAIOR VALOR = %d", posicaoDoMaior);

        sc.close();
    }
}
