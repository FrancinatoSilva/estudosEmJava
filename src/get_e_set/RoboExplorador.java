package get_e_set;

public class RoboExplorador {

    private String nomeRobo;
    private int quantidadeEnergia;
    private double distanciaPercorrida;
    private String terrenoAtual;

    public RoboExplorador() {

    }

    public String getNomeRobo() {
        return nomeRobo;
    }

    public void setNomeRobo(String nomeRobo) {
        this.nomeRobo = nomeRobo;
    }

    public int getQuantidadeEnergia() {
        return 100;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public String getTerrenoAtual() {
        return terrenoAtual;
    }

    public void setTerrenoAtual(String terrenoAtual) {
        this.terrenoAtual = terrenoAtual;
    }

    public void mover(double distanciaPercorrida) {

    }

    public void recarregar(int unidades) {

    }
}
