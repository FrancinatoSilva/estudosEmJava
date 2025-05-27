package com.loiane.cursojava.aula36.exercicios;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contato;

    public Agenda() {

    }

    public Agenda (String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public String getNomeAgenda() {
        return this.nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContato() {
        return this.contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;

    }

    public String obterInfo() {
        String info = "Nome = " + nomeAgenda + "\n";

        if (contato != null) {
            for (Contato c : contato) {
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }

}