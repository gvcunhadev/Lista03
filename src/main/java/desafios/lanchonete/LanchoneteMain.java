package desafios.lanchonete;

import java.util.Scanner;

public class LanchoneteMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Código do produto comprado: ");
        int codigo = scanner.nextInt();

        System.out.println("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = Produto.obterPrecoPorCodigo(codigo);
        if (preco == 0) {
            System.out.println("Código inválido!");
            scanner.close();
            return;
        }

        Produto produto = new Produto(codigo, preco);
        double total = produto.calcularValorTotal(quantidade);

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}