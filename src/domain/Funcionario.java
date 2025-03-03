package domain;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentoSalarial(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;

    }
}
