package cadastrodeveiculos;

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
        System.out.println("NumeroDePortas: " + numeroDePortas);
    }
}
