//A prefeitura do Rio de Janeiro abriu uma linha de crédito para 	os funcionários estatuários.
//o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
//Exemplo:
//Salário bruto: 1200,00
//Valor da prestação: 400,00
//Empréstimo não pode ser concedido!

import java.util.Scanner;
public class credito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: R$ ");
        double valorPrestacao = scanner.nextDouble();

        double limiteMaximo = salarioBruto * 0.30;

        System.out.println("\n--- Resultado ---");
        System.out.println("Salário bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Valor da prestação: R$ " + String.format("%.2f", valorPrestacao));
        System.out.println("Limite máximo (30%): R$ " + String.format("%.2f", limiteMaximo));

        if (valorPrestacao <= limiteMaximo) {
            System.out.println("\nEmpréstimo pode ser concedido!");
        } else {
            System.out.println("\nEmpréstimo não pode ser concedido!");
        }

        scanner.close();
    }
}