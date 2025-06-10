package desafios.medidorGlicose;

import java.util.Scanner;

public class MedidorGlicoseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da glicose: ");
        String entrada = sc.nextLine().replace(",", ".");
        float medida = Float.parseFloat(entrada);

        MedidorGlicose medidor = new MedidorGlicose(medida);
        String classificacao = medidor.classificar();

        System.out.println("Classificacao: " + classificacao);

        sc.close();
    }
}
