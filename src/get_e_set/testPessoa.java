package get_e_set;

import java.util.Locale;
import java.util.Scanner;

public class testPessoa {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        pessoa.setNome(sc.nextLine());

        System.out.print("Digite a idade da pessoa: ");
        pessoa.setIdade(sc.nextInt());

        System.out.print("Digite a altura da pessoa: ");
        pessoa.setAltura(sc.nextDouble());

        System.out.print("Digite o peso da pessoa: ");
        pessoa.setPeso(sc.nextDouble());

        pessoa.exibirDetalhes();

        sc.close();
    }
}
