package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class testFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        List<Funcionario> listFuncionarios = new ArrayList<>();

        System.out.print("Quantos funcionários você deseja registrar: ");
        int quantidadeRegistros = sc.nextInt();

        for (int i=0; i < quantidadeRegistros; i++) {
            System.out.println("Funcionário #" + (i+1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario (id, nome, salario);

            listFuncionarios.add(funcionario);
        }

        System.out.print("Digite o ID do funcionário que recebera aumento:");
        int idInformado = sc.nextInt();

        //Continue o aulão do Nélio 28:35


        sc.close();
    }
}
