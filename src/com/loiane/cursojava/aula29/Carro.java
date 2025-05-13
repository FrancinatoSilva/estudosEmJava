package com.loiane.cursojava.aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros; //número de passageiros
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel; // consumo de combustível por km

    Carro() {

    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +
                capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia() {
        return capCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km) {
        return km/consumoCombustivel;
    }




}