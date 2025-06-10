package desafios.coordenadasCartesianas;

import java.util.Scanner;

public class CoordenadasMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite a coordenada X: ");
        double x = sc.nextDouble();
        System.out.println("Digite a coordenada Y: ");
        double y = sc.nextDouble();

        Coordenadas coordenadas = new Coordenadas(x, y);
    }
}
