package arrayUnidimensional;

import java.util.Locale;
import java.util.Scanner;

//Utilizando Vetor de tipo referência
public class testProduto {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantidade de produtos: ");
        int quantidadeProdutos = sc.nextInt();

        Produto[] produtos = new Produto[quantidadeProdutos];

        for (int i = 0; i < quantidadeProdutos; i++) {
            sc.nextLine();
            System.out.print("Nome do produto " + (i+1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Preço do produto " + (i+1) + ": ");
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        double somaProdutos = 0.00;
        for (int i = 0; i < quantidadeProdutos; i++) {
            somaProdutos += produtos[i].getPreco();
        }

        double mediaPrecos = somaProdutos / quantidadeProdutos;

        System.out.printf("Média de preço: R$%.2f", mediaPrecos);

        sc.close();

    }
}
