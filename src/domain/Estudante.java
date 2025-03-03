package domain;

public class Estudante {

    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double media() {
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }
}
