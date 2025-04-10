package cadastrodeveiculos;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("HRS-208", "Frontier", 2014, 4);
        Moto moto = new Moto("HRS-746", "Brós", 2023, 160);

        System.out.println("===Dados do carro===");
        carro.exibirDados();
        System.out.println();

        System.out.println("===Dados da moto===");
        moto.exibirDados();
    }
}
