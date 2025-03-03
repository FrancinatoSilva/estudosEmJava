package pooNelio;

import domain.ConversorMoeda;

import java.util.Locale;
import java.util.Scanner;

public class problemaMoeda {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Qual é o preço do dolar? ");
        double precoDolar = sc.nextDouble();

        System.out.print("Quantos dólares você quer comprar? ");
        double compraDolar = sc.nextDouble();

        double valorEmReais = ConversorMoeda.valorEmReal(precoDolar, compraDolar);

        System.out.printf("Valor à ser pago em reais: R$ %.2f", valorEmReais);

        sc.close();
    }
}
