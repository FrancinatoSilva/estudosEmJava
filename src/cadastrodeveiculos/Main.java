package cadastrodeveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        List <Carro> carros = new ArrayList<>();
        List <Moto> motos = new ArrayList<>();

        System.out.print("Qual tipo de veículo você deseja cadastrar (carro/moto): ");
        String tipoDeVeiculo = sc.nextLine();

        int quantidadeDeVeiculos;
        if (tipoDeVeiculo.equalsIgnoreCase("carro")) {
            System.out.print("Quantos Carros você deseja cadastrar: ");
            quantidadeDeVeiculos = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < quantidadeDeVeiculos; i++) {
                carros.add(Carro.cadastrarCarro(sc));
            }

        } else if (tipoDeVeiculo.equalsIgnoreCase("Moto")){
            System.out.print("Quantas motos você deseja cadastrar: ");
            quantidadeDeVeiculos = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < quantidadeDeVeiculos; i++) {
                motos.add(Moto.cadastrarMoto(sc));
            }

        } else {
            System.out.println("Tipo de veículo inválido!");
        }

        //Este programa pode vir a se tornar um projeto interessante, trabalhe nele no fim de semana.
        sc.close();
    }
}