//Kaue Calasans Araujo - Turma B ADS Senac
import java.util.Scanner;
public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }

        scanner.close();
    }
}