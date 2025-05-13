package com.loiane.cursojava.aula32;

public class Carro {

    private String marca;
    private String modelo;
    private int numPassageiros; //número de passageiros
    private double capCombustivel; //capacidade do tanque de combustível
    private double consumoCombustivel; // consumo de combustível por km

    public Carro(String marca, String modelo, int numPassageiros,
                 double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;

    }

    public double getCapCombustivel() {
        return this.capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
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