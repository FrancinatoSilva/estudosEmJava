package com.esquenta;

import java.util.Scanner;

public class ValidarSenha {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        String senhaConstante = "1234";

        System.out.print("Insira a senha correta: ");
        String senhaVariavel = sc.nextLine();

        if (senhaVariavel.equalsIgnoreCase(senhaConstante)) {
            System.out.println("= = = SENHA VÁLIDA = = =");
        } else {
            System.out.println("= = = SENHA INVÁLIDA = = =");
        }

        sc.close();

    }
}
