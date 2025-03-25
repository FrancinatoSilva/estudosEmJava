package arrayUnidimensional;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int quantidadePessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] cadastros = new Pessoa[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            cadastros[i] = new Pessoa (nome, idade, altura);
        }

        double somaAlturas = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            somaAlturas += cadastros[i].getAltura();
        }
        double mediaAltura = somaAlturas / quantidadePessoas;

        int menorDe16 = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            if (cadastros[i].getIdade() < 16) {
                menorDe16++;
            }
        }

        double percentual = ((double) menorDe16 / quantidadePessoas) * 100;

        System.out.printf("Altura média: %.2f", mediaAltura);
        System.out.println();

        System.out.printf("Pessoas com menos de 16 anos: %.1f porcento", percentual);
        System.out.println();

        for (int i = 0; i < quantidadePessoas; i++) {
            if (cadastros[i].getIdade() < 16) {
                System.out.println(cadastros[i].getNome());
            }
        }




        sc.close();
    }
}