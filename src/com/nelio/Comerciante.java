package com.nelio;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos produtos serão digitados: ");
        int quantidadeProdutos = sc.nextInt();
        sc.nextLine();

        Produto produtos[] = new Produto[quantidadeProdutos];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i+1) + ": ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preco de compra: ");
            double valorDeCompra = sc.nextDouble();

            System.out.print("preco de venda: ");
            double valorDeVenda = sc.nextDouble();
            sc.nextLine();

            produtos[i] = new Produto(nome, valorDeCompra, valorDeVenda);
        }

        double lucro1 = 0;
        int lucro10 = 0, meioTermo=0, lucro20=0;

        for (int i = 0; i < produtos.length; i++) {
            lucro1 = produtos[i].getValorDeVenda() - produtos[i].getValorDeCompra();
            lucro1 = (lucro1/produtos[i].getValorDeCompra()*100);
            if (lucro1 < 10) {
                lucro10++;
            } else if (lucro1 >= 10 && lucro1 <= 20) {
                meioTermo++;
            } else {
                lucro20++;
            }

        }

        double totalCompra = 0;
        double totalVenda =0;

        for (int i = 0; i < produtos.length; i++) {
            totalCompra += produtos[i].getValorDeCompra();
            totalVenda += produtos[i].getValorDeVenda();
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("RELATÓRIO:");
        System.out.println("Lucro abaixo de 10%: " + lucro10);
        System.out.println("Lucro entre 10% e 20%: " + meioTermo);
        System.out.println("Lucro acima de 20%: " + lucro20);
        System.out.println();
        System.out.println("Valor total de compra: " + totalCompra);
        System.out.println("Valor total de venda: " + totalVenda);
        System.out.println("Lucro total: " + lucroTotal);

        sc.close();
    }
}