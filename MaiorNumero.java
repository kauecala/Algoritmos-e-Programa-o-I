//Kaue Calasans Araujo - Turma B ADS Senac

import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("\nOs números são iguais!");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("\nO maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\nO maior número é: " + num2);
        } else {
            System.out.println("\nO maior número é: " + num3);
        }

        scanner.close();
    }
}