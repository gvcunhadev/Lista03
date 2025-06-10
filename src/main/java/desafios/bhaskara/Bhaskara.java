package desafios.bhaskara;

import java.util.Scanner;

public class Bhaskara {
    public int a;
    public int b;
    public int c;
    public double delta;
    public double x1;
    public double x2;

    public Bhaskara() {
        deltaCalculo();
    }

    public void deltaCalculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A, B e C:");
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());

        delta = (b * b) - (4 * a * c);  // Correção aqui: era +(-4 * a * c), agora está direto

        System.out.println("Delta: " + delta);

        if (delta >= 0) {
            calculaX();
        } else {
            System.out.println("Delta não possui raiz real!");
        }
    }

    public void calculaX() {
        x1 = (-(double)b + Math.sqrt(delta)) / (2 * a);
        x2 = (-(double)b - Math.sqrt(delta)) / (2 * a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }

    public static void main(String[] args) {
        new Bhaskara();
    }
}
