package exerciciosDeLogica;

import domain.Paciente;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.DoubleFunction;

/*
9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição

de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²

Tabela Condições IMC



 Abaixo de 18,5   | Abaixo do peso

 Entre 18,6 e 24,9 | Peso ideal (parabéns)

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)


 */
public class calculandoImc {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Paciente paciente = new Paciente();

        System.out.println("PREENCHA OS DADOS DO PACIENTE");

        System.out.print("Nome: ");
        paciente.nome = sc.nextLine();

        System.out.print("Idade: ");
        paciente.idade = sc.nextInt();

        System.out.print("Peso: ");
        paciente.peso = sc.nextDouble();

        System.out.print("Altura: ");
        paciente.altura = sc.nextDouble();

        System.out.printf("O paciente %s de %d anos tem KG %.2f e %.2f de altura",
                paciente.nome, paciente.idade, paciente.peso, paciente.altura);
        System.out.println();

        System.out.print("O seu estado é: ");

        if (paciente.calculoImc() < 18.5) {
            System.out.println("ABAIXO DO PESO");
        } else if (paciente.calculoImc() >= 18.6 && paciente.calculoImc() <= 24.9) {
            System.out.println("PESO IDEAL (PARABÉNS!!!)");
        } else if (paciente.calculoImc() >= 25.0 && paciente.calculoImc() <= 29.9) {
            System.out.println("LEVEMENTE ACIMA DO PESO");
        } else if (paciente.calculoImc() >= 30.0 && paciente.calculoImc() <= 34.9) {
            System.out.println("OBESIDADE GRAU 1");
        } else if (paciente.calculoImc() >= 35.0 && paciente.calculoImc() <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }



        sc.close();
    }
}