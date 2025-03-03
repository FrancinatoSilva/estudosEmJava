package domain;

public class ConversorMoeda {

    public static final double IOF = 0.06;

    public static double valorEmReal (double precoDolar, double compraDolar) {
        double valorSemIOF = precoDolar * compraDolar;
        double valorComIOF = valorSemIOF * (1.0 + IOF);
        return valorComIOF;
    }
}

