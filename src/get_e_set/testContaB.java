package get_e_set;

import java.util.Locale;
import java.util.Scanner;

public class testContaB {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        ContaBancaria conta1 = new ContaBancaria();

        System.out.println("---------Preencha os dados abaixo---------");
        System.out.print("Titular: ");
        conta1.setTitular(sc.nextLine());

        do {
            System.out.print("Saldo: ");
            conta1.setSaldo(sc.nextDouble());
        } while (conta1.getSaldo() < 0);

        System.out.print("Número da conta: ");
        conta1.setNumeroConta(sc.nextInt());

        System.out.println(conta1.getSaldo());

        sc.close();
    }
}
//Preciso descobrir uma maneira de gerar um loop que atualize o método getSaldo.