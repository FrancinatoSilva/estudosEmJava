package arrayUnidimensional;

import java.util.Scanner;

public class testPensionato {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        Pensionato[] alugueis = new Pensionato[10];

        System.out.print("Quantos quartos serão alugados: ");
        int quantidadeHospede = sc.nextInt();

        for (int i = 0; i < quantidadeHospede; i++) {
            System.out.println("Aluguel #" + (i+1));

            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            alugueis[quarto] = new Pensionato(name, email, quarto);
        }

        System.out.println("Quartos ocupados: ");

        for (int i = 0; i < alugueis.length; i++) {
            if (alugueis[i] != null) {
                System.out.println(alugueis[i].getQuarto()+ ": " + alugueis[i].getNome()
                        + ", " + alugueis[i].getEmail());
            }
        }

        sc.close();
    }
}
