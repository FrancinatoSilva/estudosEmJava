package get_e_set;


import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do aluno: ");
        String name = sc.nextLine();
        System.out.print("matricula:");
        int matricula = sc.nextInt();

        Aluno aluno = new Aluno(name, matricula);

        System.out.println(aluno.getName());



        sc.close();
    }
}
