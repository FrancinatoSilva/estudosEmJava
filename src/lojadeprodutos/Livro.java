package lojadeprodutos;

public class Livro extends Produto{

    private String autor;
    private Integer numeroDePaginas;

    public Livro(String nome, Double preco, String autor, Integer numeroDePaginas) {
        super(nome, preco);
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroDePaginas);
    }
}
