package cadastrodeveiculos;

import java.util.Scanner;

public class Moto extends  Veiculo{

    private int cilindradas;

    public Moto(String placa, String modelo, int ano, int cilindradas) {
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void exibirDados() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindradas: " + cilindradas);
    }

    public static Moto cadastrarMoto(Scanner sc) {
        System.out.println("====Cadastro de moto====");

        System.out.print("Placa: ");
        String placa = sc.nextLine();

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Ano: ");
        int ano =  sc.nextInt();
        sc.nextLine();

        System.out.print("Cilindradas: ");
        int cilindradas = sc.nextInt();
        sc.nextLine();

        return new Moto(placa, modelo, ano, cilindradas);
    }
}
