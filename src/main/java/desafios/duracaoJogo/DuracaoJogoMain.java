package desafios.duracaoJogo;

import java.util.Scanner;

public class DuracaoJogoMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        int horaFinal = sc.nextInt();

        Duracao duracao = new Duracao(horaInicial, horaFinal);
        int duracaoJogo = duracao.calcularDuracao();

        System.out.println("O jogo durou: " + duracaoJogo + " horas");

        sc.close();
    }
}
