package get_e_set;

import java.util.Locale;
import java.util.Scanner;

public class testLivro {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Livro livroA = new Livro();

        System.out.print("Digite o titulo do livro: ");
        livroA.setTitulo(sc.nextLine());

        System.out.print("Digite o autor do livro: ");
        livroA.setAutor(sc.nextLine());

        System.out.print("Digite o ano de publicação do livro: ");
        livroA.setAnoDePublicacao(sc.nextInt());

        System.out.print("Digite o preço do livro: ");
        livroA.setPreco(sc.nextDouble());
        sc.nextLine();

        Livro livroB = new Livro("Poliana", "Renata Corna", 1985, 55.00);

        livroA.exibirDetalhes();
        System.out.println( );
        livroB.exibirDetalhes();

        sc.close();
    }
}
