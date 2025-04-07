package arraybidimensional;

import java.util.Scanner;

public class PercorrerMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantas linhas a matriz vai ter: ");
        int m = sc.nextInt();

        System.out.println("Quantas colunas a matriz vai ter:");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];



        sc.close();
    }
}
