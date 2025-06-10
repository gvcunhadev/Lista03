package desafios.planoDeTelefonia;

import java.util.Scanner;

public class PlanoDeTelefoniaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        PlanoDeTelefonia plano = new PlanoDeTelefonia(minutos);
        double valor = plano.calcularValor();

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);
    }
}
