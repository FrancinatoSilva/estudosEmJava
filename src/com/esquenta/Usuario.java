package com.esquenta;

import java.util.Random;

public class Usuario {

    Random random = new Random();

    private String nome;
    private int id = random.nextInt(25);

    public Usuario() {

    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    }

