package com.biblioteca;

public class ItemBiblioteca {

    private int id;
    private String titulo;
    private boolean disponivel;

    public ItemBiblioteca() {};

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(boolean disponivel) {
        this.disponivel = false;
    }

    public void devolver(boolean disponivel) {
        this.disponivel = true;
    }

    @Override
    public String toString() {
        return "Id: " + getTitulo() +
                "Título: " + getTitulo() +
                "Disponivel: " + getDisponivel();

    }
}
