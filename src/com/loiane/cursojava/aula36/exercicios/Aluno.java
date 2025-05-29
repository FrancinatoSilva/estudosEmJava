package com.loiane.cursojava.aula36.exercicios;

public class Aluno {

    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno() {

    }

    public Aluno(String nome, int matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double calcularMedia(double nota1, double nota2,
                                double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
