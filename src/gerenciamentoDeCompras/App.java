package gerenciamentoDeCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int opcao;
        List <String> listaDeCompras = new ArrayList<>();

        do {
            System.out.println("=== Lista de Compras ===");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar itens");
            System.out.println("4. Verificar item");
            System.out.println("5. Limpar lista");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do item:");
                    listaDeCompras.add(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Informe o nome do item: ");
                    String item = sc.nextLine();

                    if (listaDeCompras.contains(item)) {
                        listaDeCompras.remove(item);
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("O item informado não está na lista");
                    } break;
                case 3:
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                    } break;
                case 4:
                    System.out.print("Informe o nome do item: ");
                    item = sc.nextLine();

                    if (listaDeCompras.contains(item)) {
                        System.out.println("Item encontrado!");
                    } break;
                case 5:
                    listaDeCompras.clear();
                break;
            }

        } while (opcao != 6);





        sc.close();
    }
}
