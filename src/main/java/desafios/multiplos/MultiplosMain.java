package desafios.multiplos;

import java.util.Scanner;

public class MultiplosMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        Multiplos multiplos = new Multiplos(n1, n2);
        if (multiplos.saoMultiplos()) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }

        scanner.close();
    }
}
