// Kaue Calasans Araujo - Senac ADS Turma B

import java.util.Scanner;
public class Aula4Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+===========================================+");
        System.out.println("|         PERÍODO DE ESTUDOS               |");
        System.out.println("+===========================================+");
        System.out.println("|  M - Matutino                            |");
        System.out.println("|  V - Vespertino                          |");
        System.out.println("|  N - Noturno                             |");
        System.out.println("+===========================================+");
        System.out.print("Digite o período: ");
        String periodo = scanner.next().toUpperCase();

        System.out.println("\n+===========================================+");
        System.out.printf("|  Período informado: %-22s|\n", periodo);
        System.out.println("+===========================================+");

        switch (periodo) {
            case "M":
                System.out.println("|  Turno:   Matutino                    |");
                System.out.println("|  Saudação: Bom dia!                   |");
                break;
            case "V":
                System.out.println("|  Turno:   Vespertino                  |");
                System.out.println("|  Saudação: Boa tarde!                 |");
                break;
            case "N":
                System.out.println("|  Turno:   Noturno                     |");
                System.out.println("|  Saudação: Boa noite!                 |");
                break;
            default:
                System.out.println("|  Período inválido! Use M, V ou N.        |");
        }

        System.out.println("+========================================+");

        scanner.close();
    }
}