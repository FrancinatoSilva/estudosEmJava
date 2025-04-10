package cadastrodefuncionarios;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Gerente gerente = new Gerente("Cláudio", "574.043.403-63", 10000.00);
        Desenvolvedor dev = new Desenvolvedor("Francis", "631.179.783-64", 22000.00);

        System.out.println("===Dados do gerente===");
        gerente.exibirDados();
        System.out.println();

        System.out.println("===Dados do desenvolvedor===");
        dev.exibirDados();
    }
}
