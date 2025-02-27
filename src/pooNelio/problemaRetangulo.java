package pooNelio;

import domain.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class problemaRetangulo {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Informe a largura e a altura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        double areaDoRetangulo = retangulo.area();
        double perimetroDoRetangulo = retangulo.perimeto();
        double diagonalDoRetangulo = retangulo.diagonal();

        System.out.printf("AREA = %.2f", areaDoRetangulo);
        System.out.println();
        System.out.printf("PERIMETER = %.2f", perimetroDoRetangulo);
        System.out.println();
        System.out.printf("DIAGONAL = %.2f", diagonalDoRetangulo);

        sc.close();
    }
}
