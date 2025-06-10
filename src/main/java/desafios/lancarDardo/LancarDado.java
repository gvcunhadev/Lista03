package desafios.lancarDardo;

public class LancarDado {
    private double dardo1;
    private double dardo2;
    private double dardo3;

    public LancarDado(double dardo1, double dardo2, double dardo3) {
        this.dardo1 = dardo1;
        this.dardo2 = dardo2;
        this.dardo3 = dardo3;
    }

    public double maiorDistancia() {
        double maior = dardo1;
        if (dardo2 > maior) {
            maior = dardo2;
        }
        if (dardo3 > maior) {
            maior = dardo3;
        }
        return maior;
    }
}
