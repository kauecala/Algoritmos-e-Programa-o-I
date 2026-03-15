// Kaue Calasans Araujo - Senac ADS Turma B

import java.util.Scanner;
public class Aula4Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+===========================================+");
        System.out.println("|            CALCULADORA                   |");
        System.out.println("+===========================================+");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("+===========================================+");
        System.out.println("|            OPERAÇÕES                     |");
        System.out.println("+===========================================+");
        System.out.println("|  M - Média entre os números              |");
        System.out.println("|  S - Diferença do maior pelo menor       |");
        System.out.println("|  P - Produto entre os números            |");
        System.out.println("|  D - Divisão do primeiro pelo segundo    |");
        System.out.println("+===========================================+");
        System.out.print("Escolha uma opção: ");
        String opcao = scanner.next().toUpperCase();

        double resultado = 0;

        System.out.println("\n+===========================================+");
        System.out.printf( "|  Número 1: %-30s|\n", String.format("%.2f", num1));
        System.out.printf( "|  Número 2: %-30s|\n", String.format("%.2f", num2));
        System.out.println("|-------------------------------------------|");

        switch (opcao) {
            case "M":
                resultado = (num1 + num2) / 2;
                System.out.printf("|  Operação:  %-29s|\n", "Média");
                System.out.printf("|  Resultado: %-29s|\n", String.format("%.2f", resultado));
                break;
            case "S":
                resultado = (num1 > num2) ? (num1 - num2) : (num2 - num1);
                System.out.printf("|  Operação:  %-29s|\n", "Diferença");
                System.out.printf("|  Resultado: %-29s|\n", String.format("%.2f", resultado));
                break;
            case "P":
                resultado = num1 * num2;
                System.out.printf("|  Operação:  %-29s|\n", "Produto");
                System.out.printf("|  Resultado: %-29s|\n", String.format("%.2f", resultado));
                break;
            case "D":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("|  Operação:  %-29s|\n", "Divisão");
                    System.out.printf("|  Resultado: %-29s|\n", String.format("%.2f", resultado));
                } else {
                    System.out.println("|  Erro: Divisão por zero não permitida!  |");
                }
                break;
            default:
                System.out.println("|  Opção inválida! Use M, S, P ou D.      |");
        }

        System.out.println("+===========================================+");

        scanner.close();
    }
}