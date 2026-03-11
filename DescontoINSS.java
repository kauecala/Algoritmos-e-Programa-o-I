//Kaue Calasans Araujo - Turma B ADS Senac

import java.util.Scanner;
public class DescontoINSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: R$ ");
        double salario = scanner.nextDouble();

        double desconto;
        String aliquota;

        if (salario <= 600.00) {
            desconto = 0;
            aliquota = "Isento";
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
            aliquota = "20%";
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
            aliquota = "25%";
        } else {
            desconto = salario * 0.30;
            aliquota = "30%";
        }

        System.out.println("\n--- Desconto INSS ---");
        System.out.println("Salário bruto:  R$ " + String.format("%.2f", salario));
        System.out.println("Alíquota:       " + aliquota);
        System.out.println("Desconto INSS:  R$ " + String.format("%.2f", desconto));
        System.out.println("Salário líquido: R$ " + String.format("%.2f", salario - desconto));

        scanner.close();
    }
}