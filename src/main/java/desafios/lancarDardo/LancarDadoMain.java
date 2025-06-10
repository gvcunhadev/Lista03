package desafios.lancarDardo;

import java.util.Scanner;

public class LancarDadoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite as tres distancias:");


        String entrada1 = sc.nextLine().replace(",", ".");
        String entrada2 = sc.nextLine().replace(",", ".");
        String entrada3 = sc.nextLine().replace(",", ".");

        double d1 = Double.parseDouble(entrada1);
        double d2 = Double.parseDouble(entrada2);
        double d3 = Double.parseDouble(entrada3);

        LancarDado lancamento = new LancarDado(d1, d2, d3);
        double maior = lancamento.maiorDistancia();

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maior);

        sc.close();
    }
}
