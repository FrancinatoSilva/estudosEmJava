package arrayUnidimensional;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class somaVetor {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar: ");
        int quantidadeNumeros = sc.nextInt();

        double[] numeros = new double[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double somaNumeros = 0;

        for (int i = 0; i < quantidadeNumeros; i++) {
            somaNumeros += numeros[i];
        }

        double mediaNumeros = somaNumeros / quantidadeNumeros;

        System.out.print("Valores = ");
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.printf("%.1f  ", numeros[i]);
        }

        System.out.println();
        System.out.printf("SOMA = %.2f", somaNumeros);
        System.out.println();
        System.out.printf("MÉDIA = %.2f", mediaNumeros);




        sc.close();
    }
}
