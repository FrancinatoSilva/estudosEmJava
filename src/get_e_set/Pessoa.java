package get_e_set;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            System.out.println("Altura inválida!");
        } else {
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            System.out.println("Peso inválido!");
        } else {
            this.peso = peso;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.printf("Altura: %.2f", this.altura);
        System.out.println("");
        System.out.printf("Peso: %.2f", this.peso);

    }
}