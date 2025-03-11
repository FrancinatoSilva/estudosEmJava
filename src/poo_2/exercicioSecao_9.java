package poo_2;

import models.Conta;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSecao_9 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Há um depósito inicial (s/n)? ");
        char condicao = sc.next().charAt(0);

        double depositoInicial = 0.00;
        if (condicao == 's') {
            System.out.print("Insira o valor do depósito inicial: ");
            depositoInicial = sc.nextDouble();
        }

        Conta conta = new Conta(numero, titular, depositoInicial);

        //apenas teste:
        System.out.println(depositoInicial);

        sc.close();
    }
}
