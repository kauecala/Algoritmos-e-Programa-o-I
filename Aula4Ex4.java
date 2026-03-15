// Kaue Calasans Araujo - Senac ADS Turma B

import java.util.Scanner;
public class Aula4Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+===========================================+");
        System.out.println("|           PLANOS DE AUMENTO              |");
        System.out.println("+===========================================+");
        System.out.println("|  A - Aumento de 10%                      |");
        System.out.println("|  B - Aumento de 15%                      |");
        System.out.println("|  C - Aumento de 20%                      |");
        System.out.println("+===========================================+");

        System.out.print("Digite o plano de trabalho (A, B ou C): ");
        String plano = scanner.next().toUpperCase();

        System.out.print("Digite o salário atual: R$ ");
        double salario = scanner.nextDouble();

        double percentual = 0;
        double aumento = 0;
        double novoSalario = 0;

        switch (plano) {
            case "A":
                percentual = 10;
                break;
            case "B":
                percentual = 15;
                break;
            case "C":
                percentual = 20;
                break;
            default:
                System.out.println("\nPlano inválido! Use A, B ou C.");
                scanner.close();
                return;
        }

        aumento     = salario * (percentual / 100);
        novoSalario = salario + aumento;

        System.out.println("\n+===========================================+");
        System.out.printf( "|  Plano:          %-24s|\n", "Plano " + plano);
        System.out.printf( "|  Percentual:     %-24s|\n", percentual + "%");
        System.out.println("|-------------------------------------------|");
        System.out.printf( "|  Salário atual:  R$ %-21s|\n", String.format("%.2f", salario));
        System.out.printf( "|  Aumento:        R$ %-21s|\n", String.format("%.2f", aumento));
        System.out.println("|-------------------------------------------|");
        System.out.printf( "|  Novo salário:   R$ %-21s|\n", String.format("%.2f", novoSalario));
        System.out.println("+===========================================+");

        scanner.close();
    }
}