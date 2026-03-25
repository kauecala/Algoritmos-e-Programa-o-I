// Kaue Calasans Araujo - Senac ADS Turma B
import java.util.Scanner;
public class Aula5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contPares   = 0;
        int contImpares = 0;
        int contador    = 1;

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }

            contador++;
        }
        System.out.printf( "|  Números pares:   %-23d|\n", contPares);
        System.out.printf( "|  Números ímpares: %-23d|\n", contImpares);
        scanner.close();
    }
}
