package desafios.planoDeTelefonia;

public class PlanoDeTelefonia {
    private int minutos;

    public PlanoDeTelefonia(int minutos) {
        this.minutos = minutos;
    }

    public double calcularValor() {
        if (minutos <= 100) {
            return 50.0;
        } else {
            return 50.0 + (minutos - 100) * 2.0;
        }
    }
}
