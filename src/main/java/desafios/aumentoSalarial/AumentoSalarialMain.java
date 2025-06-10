package desafios.aumentoSalarial;

import java.util.Scanner;

public class AumentoSalarialMain {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            sc.useLocale(java.util.Locale.US);

            System.out.println("Digite o salário do funcionário: ");
            float salario = sc.nextFloat();

            Funcionario funcionario = new Funcionario(salario);
            float aumento = funcionario.aumentoSalarial();
            System.out.printf("Salário atual: %.2f%n", salario);
            System.out.println("Aumento salarial: " + aumento);
            System.out.println("Porcentagem de aumento: " + (aumento / salario) * 100 + "%");
            System.out.printf("Salário após aumento: %.2f%n", salario + aumento);
            sc.close();
        }
    }
