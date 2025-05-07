package com.loiane.javabasico.poo.aula24.aula25;

public class Carro {

    //Atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //Método simples sem retorno
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel + consumoCombustivel + "km");
    }

    //Método com retorno
    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    //Método com retorno e parâmetro
    double calcularCombustivel(double km) {

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
