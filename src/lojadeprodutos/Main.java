package lojadeprodutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        List <Livro> listaDeLivros = new ArrayList<>();
        List <Eletronico> listaDeEletronicos = new ArrayList<>();

        System.out.print("Quantos produtos você deseja cadastrar: ");
        int quantidadeDeProdutos = sc.nextInt();
        sc.nextLine();

        System.out.print("Qual o tipo do produto que você deseja cadastrar (livro/eletronico): ");
        String tipoDeProduto = sc.nextLine();

        if (tipoDeProduto.equals("livro")) {
            for(int i = 0; i < quantidadeDeProdutos; i++) {

                System.out.println("====Dados do livro " + (i+1) + "====");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                Double preco = sc.nextDouble();
                sc.nextLine();

                System.out.print("Autor: ");
                String autor = sc.nextLine();

                System.out.print("Número de páginas: ");
                Integer numeroDePaginas = sc.nextInt();
                sc.nextLine();

                listaDeLivros.add(new Livro(nome, preco, autor, numeroDePaginas));
            }
        } else if (tipoDeProduto.equals("eletronico")) {
            for(int i = 0; i < quantidadeDeProdutos; i++) {

                System.out.println("====Dados do eletronico " + (i+1) + "====");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                Double preco = sc.nextDouble();
                sc.nextLine();

                System.out.print("Marca: ");
                String marca = sc.nextLine();

                System.out.print("Voltagem: ");
                Integer voltagem = sc.nextInt();
                sc.nextLine();

                listaDeEletronicos.add(new Eletronico(nome, preco, marca, voltagem));
            }
        }

        if (listaDeLivros.isEmpty()) {
            for (int i = 0; i < listaDeEletronicos.size(); i++) {

                System.out.println("Exibindo dados do Eletronico " + (i+1) + ": ");
                listaDeEletronicos.get(i).exibirDados();
            }
        } else {
            for (int i = 0; i < listaDeLivros.size(); i++) {

                System.out.println("Exibindo dados do Livro " + (i + 1));
                listaDeLivros.get(i).exibirDados();
            }
        }
        sc.close();
    }
}
