package pooNelio;

import domain.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class problemaEstudante {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Estudante estudante = new Estudante();

        System.out.println("Preencha os dados do aluno");

        System.out.print("Nome: ");
        estudante.nome = sc.nextLine();

        System.out.print("Nota 1: ");
        estudante.notaPrimeiroTrimestre = sc.nextDouble();

        System.out.print("Nota 2: ");
        estudante.notaSegundoTrimestre = sc.nextDouble();

        System.out.print("Note 3: ");
        estudante.notaTerceiroTrimestre = sc.nextDouble();

        double notaFinal = estudante.media();

        System.out.printf("Nota final: %.2f", notaFinal);
        System.out.println();


        double media = 60.00;
        if (notaFinal >= media) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
            double faltouNota = media - notaFinal;
            System.out.printf("faltou %.2f pontos", faltouNota);
        }


        sc.close();
    }
}
