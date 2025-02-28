package pooNelio;

import domain.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class problemaFuncionario {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("preencha os dados abaixo");

        System.out.print("Name: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        double salarioLiquido = funcionario.salarioLiquido();

        System.out.printf("%s, R$ %.2f", funcionario.nome, salarioLiquido);
        System.out.println();

        System.out.print("informe a porcentagem de aumento do salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalarial(porcentagem);


        System.out.printf("Dados atualizados: %s, R$ %.2f", funcionario.nome, funcionario.salarioLiquido());

        sc.close();
    }
}
