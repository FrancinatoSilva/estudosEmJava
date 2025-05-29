package com.loiane.cursojava.aula36.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("=====Informações sobre o curso=====");
        System.out.print("Nome:");
        String nome = sc.nextLine();

        System.out.print("Horário: ");
        String horario = sc.nextLine();
        Curso curso = new Curso(nome, horario);

        Aluno[] a = new Aluno[5];
        System.out.println("====Dados dos alunos====");
        for (int i=0; i < 5; i++) {
            System.out.println("Informações do aluno " + (i+1));

            Aluno aluno = new Aluno();

            System.out.print("Nome: ");
            aluno.setNome(sc.nextLine());

            System.out.print("Matrícula: ");
            aluno.setMatricula(sc.nextInt());

            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();

            System.out.print("Nota 4: ");
            double nota4 = sc.nextDouble();

            double notaFinal = aluno.calcularMedia(nota1, nota2, nota3, nota4);
            aluno.setNotaFinal(notaFinal);

            a[i] = aluno;
        }
        curso.setAlunos(a);

        //O próximo passo é montar a lógica de exibir resultados.

        sc.close();
    }
}