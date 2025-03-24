package arrayUnidimensional;

import java.util.Locale;
import java.util.Scanner;

public class ex001 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("informe a quantidade de pessoas: ");
        int quantidadePessoas = sc.nextInt();

        double[] tamanhoVetor = new double[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Altura da " + (i+1) + "a Pessoa: ");
            tamanhoVetor[i] = sc.nextDouble();
        }

        double somaAltura = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            somaAltura = somaAltura + tamanhoVetor[i];
        }
        double mediaAltura = somaAltura / quantidadePessoas;

        System.out.printf("A média das alturas informadas é %.2f.", mediaAltura);




        sc.close();
    }
}
