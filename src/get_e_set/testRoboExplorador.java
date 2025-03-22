package get_e_set;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class testRoboExplorador {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        RoboExplorador robo = new RoboExplorador();

        System.out.println("Bem vindo ao sistema de monitoramentos MrRobots!");

        System.out.print("Informe o nome do seu robô: ");
        robo.setNomeRobo(sc.nextLine());

        System.out.println(robo.getNomeRobo() + " neste momento está com " + robo.getQuantidadeEnergia() +
                "% de energia!");

        System.out.print("Tipo de terreno atual: ");
        robo.setTerrenoAtual(sc.nextLine());




        sc.close();
    }
}
