package desafios.menorDeTres;

import java.util.Scanner;

public class MenorDeTresMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int num3 = sc.nextInt();

        MenorDeTres menorDeTres = new MenorDeTres(num1, num2, num3);
        System.out.println("Menor valor: " + menorDeTres.menor());
    }
}
