// Kaue Calasans Araujo - Senac ADS Turma B
import java.util.Scanner;
public class Aula5Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aluno = 1;

        while (aluno <= 5) {
            System.out.println("\n--- Aluno " + aluno + " ---");

            double nota1, nota2;

            // Validação da nota 1
            do {
                System.out.print("Digite a 1ª nota: ");
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota1 < 0 || nota1 > 10);

            // Validação da nota 2
            do {
                System.out.print("Digite a 2ª nota: ");
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println("+-----------------------------------------+");
            System.out.printf( "|  1ª Nota:  %-30.1f|\n", nota1);
            System.out.printf( "|  2ª Nota:  %-30.1f|\n", nota2);
            System.out.printf( "|  Média:    %-30.1f|\n", media);

            if (media >= 6) {
                System.out.println("|  Situação: Aprovado ✔                  |");
            } else {
                System.out.println("|  Situação: Reprovado ✘                 |");
            }

            System.out.println("+-----------------------------------------+");

            aluno++;
        }
        scanner.close();
    }
}
