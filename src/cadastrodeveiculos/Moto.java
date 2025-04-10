package cadastrodeveiculos;

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
}
