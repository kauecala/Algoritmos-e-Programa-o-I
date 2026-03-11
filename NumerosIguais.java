//Kaue Calasans Araujo - Turma B ADS Senac
import java.util.Scanner;
public class NumerosIguais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Números iguais");
        } else if (num1 > num2) {
            System.out.println("Diferença: " + (num1 - num2));
        } else {
            System.out.println("Diferença: " + (num2 - num1));
        }

        scanner.close();
    }
}