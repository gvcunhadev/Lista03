package desafios.lanchonete;

public class Produto {
    private int codigo;
    private double preco;

    public Produto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public double calcularValorTotal(int quantidade){
        return preco * quantidade;
    }

    public static double obterPrecoPorCodigo(int codigo) {
        double[] precos = {5.00, 3.50, 4.80, 8.90, 7.32};
        if (codigo >= 1 && codigo <= precos.length) {
            return precos[codigo - 1];
        }
        return 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco(){
        return preco;
    }
}
