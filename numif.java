//Kaue Calasans Araujo - Turma B ADS Senac
import java.util.Scanner;

public class numif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("O número " + numero + " é maior que 20.");
            System.out.println("Metade de " + numero + " = " + metade);
        } else {
            System.out.println("O número " + numero + " não é maior que 20.");
        }

        scanner.close();
    }
}