package com.loiane.javabasico.poo.aula24.aula25;

import com.loiane.javabasico.poo.aula24.aula25.Carro;

public class testCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

    van.exibirAutonomia();

    double autonomia = van.obterAutonomia();
    System.out.println("A autonomia do carro é: " + autonomia);

    }
}
