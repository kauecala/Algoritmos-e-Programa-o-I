//Kaue Calasans Araujo - Turma B ADS Senac
import java.util.Scanner;
public class BonusSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de trabalho (em anos): ");
        int anos = scanner.nextInt();

        double bonus;

        if (anos >= 5) {
            bonus = salario * 0.20;
            System.out.println("\nBônus de 20%: R$ " + String.format("%.2f", bonus));
        } else {
            bonus = salario * 0.10;
            System.out.println("\nBônus de 10%: R$ " + String.format("%.2f", bonus));
        }

        System.out.println("Salário com bônus: R$ " + String.format("%.2f", salario + bonus));

        scanner.close();
    }
}