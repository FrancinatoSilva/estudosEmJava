package get_e_set;

public class Livro {

    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private double preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoDePublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        if (anoDePublicacao < 0) {
            System.out.println("Data inválida!");
        } else {
            this.anoDePublicacao = anoDePublicacao;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0.00) {
            System.out.println("Valor inválido!");
        } else {
            this.preco = preco;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoDePublicacao);
        System.out.printf("Preço: R$%.2f ",this.preco);
    }
}
