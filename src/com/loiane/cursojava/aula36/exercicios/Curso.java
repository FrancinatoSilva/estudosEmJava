package com.loiane.cursojava.aula36.exercicios;

public class Curso {

    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public Curso() {

    }

    public Curso(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String horario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor() {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos (Aluno[] alunos) {
        this.alunos = alunos;
    }

}
