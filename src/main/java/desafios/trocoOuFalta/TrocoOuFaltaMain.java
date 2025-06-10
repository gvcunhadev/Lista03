package desafios.trocoOuFalta;

import java.util.Scanner;

public class TrocoOuFaltaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite o valor unitário do produto: ");
        float valorUnitario = sc.nextFloat();
        System.out.println("Digite a quantidade comprada: ");
        int quantidadeComprada = sc.nextInt();
        System.out.println("Digite o valor pago: ");
        float valorPago = sc.nextFloat();

        TrocoOuFalta trocoOuFalta = new TrocoOuFalta(valorUnitario, quantidadeComprada, valorPago);
        float totalCompra = trocoOuFalta.calcularTotalCompra();
        float troco = valorPago - totalCompra;
        if (troco < 0) {
            System.out.printf("Falta %.2f%n", Math.abs(troco));
        } else {
            System.out.printf("Troco: %.2f%n", troco);
        }
    }
}
