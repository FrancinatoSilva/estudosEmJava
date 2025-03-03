package domain;

public class Paciente {

    public String nome;
    public int idade;
    public double peso;
    public double altura;


    public double calculoImc() {
        return peso / (altura * altura);
    }
}
