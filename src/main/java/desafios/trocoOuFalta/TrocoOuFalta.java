package desafios.trocoOuFalta;

public class TrocoOuFalta {
    private float valorUnitario;
    private int quantidadeComprada;
    private float valorPago;

    public TrocoOuFalta(float valorUnitario, int quantidadeComprada, float valorPago) {
        this.valorUnitario = valorUnitario;
        this.quantidadeComprada = quantidadeComprada;
        this.valorPago = valorPago;
    }

    public float calcularTotalCompra() {
        return valorUnitario * quantidadeComprada;
    }
}
