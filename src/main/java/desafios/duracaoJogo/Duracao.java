package desafios.duracaoJogo;

public class Duracao {
    private int horaInicial;
    private int horaFinal;

    public Duracao(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        if (horaFinal < horaInicial) {
            horaFinal += 24;
        }
        return horaFinal - horaInicial;
    }

}
