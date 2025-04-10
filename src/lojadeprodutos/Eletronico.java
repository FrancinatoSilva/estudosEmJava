package lojadeprodutos;

public class Eletronico extends Produto{

    private String marca;
    private Integer voltagem;

    public Eletronico(String nome, Double preco, String marca, Integer voltagem) {
        super(nome, preco);
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Marca: " + marca);
        System.out.println("Voltagem: " + voltagem);
    }
}
