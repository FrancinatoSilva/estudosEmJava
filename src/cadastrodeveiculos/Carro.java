package cadastrodeveiculos;

import java.util.Scanner;

public class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String placa, String modelo, int ano, int numeroDePortas) {
        super(placa, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public void exibirDados() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Numero de portas: " + numeroDePortas);
    }

    public static Carro cadastrarCarro(Scanner sc) {
        System.out.println("====Cadastro de carro====");

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        int ano =  sc.nextInt();
        sc.nextLine();

        System.out.print("Numero de portas: ");
        int numeroDePortas = sc.nextInt();
        sc.nextLine();

        return new Carro(placa, modelo, ano, numeroDePortas);
    }
}
