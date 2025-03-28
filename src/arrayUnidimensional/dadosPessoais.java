package arrayUnidimensional;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoais {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int quantidadePessoas = sc.nextInt();

        Pessoa[] dados = new Pessoa[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double altura = sc.nextDouble();

            System.out.print("gênero da " + (i+1) + "a pessoa: ");
            char genero = sc.next().charAt(0);

            dados[i] = new Pessoa(altura, genero);
        }

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("A " + (i+1) + "a pessoa tem " + dados[i].getAltura() +
                    "de altura e é do sexo " + dados[i].getGenero());
        }


        sc.close();
    }
}
