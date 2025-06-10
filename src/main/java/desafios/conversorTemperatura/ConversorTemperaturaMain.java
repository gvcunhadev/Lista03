package desafios.conversorTemperatura;

import java.util.Scanner;

public class ConversorTemperaturaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        String escala = sc.nextLine().trim().toUpperCase();

        if (!escala.equals("C") && !escala.equals("F")) {
            System.out.println("Escala inválida! Use C ou F.");
            sc.close();
            return;
        }

        System.out.print("Digite a temperatura em " + (escala.equals("C") ? "Celsius" : "Fahrenheit") + ": ");
        String entrada = sc.nextLine().replace(",", ".");
        double temp = Double.parseDouble(entrada);

        if (escala.equals("C")) {
            double f = ConversorTemperatura.celsiusParaFahrenheit(temp);
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", f);
        } else {
            double c = ConversorTemperatura.fahrenheitParaCelsius(temp);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", c);
        }

        sc.close();
    }
}
