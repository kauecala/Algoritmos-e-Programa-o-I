import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o sinal da operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        System.out.println("\n--- Resultado ---");

        if (operacao == '+') {
            System.out.println(num1 + " + " + num2 + " = " + String.format("%.2f", num1 + num2));
        } else if (operacao == '-') {
            System.out.println(num1 + " - " + num2 + " = " + String.format("%.2f", num1 - num2));
        } else if (operacao == '*') {
            System.out.println(num1 + " * " + num2 + " = " + String.format("%.2f", num1 * num2));
        } else if (operacao == '/') {
            if (num2 <= 0) {
                System.out.println("Impossível dividir!");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", num1 / num2));
            }
        } else {
            System.out.println("Sinal inválido!");
        }

        scanner.close();
    }
}