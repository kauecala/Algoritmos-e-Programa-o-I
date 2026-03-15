// Kaue Calasans Araujo - Senac ADS Turma B

import java.util.Scanner;
public class Aula4Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+================================================+");
        System.out.println("|               CARDÁPIO                         |");
        System.out.println("+================================================+");
        System.out.println("|  Código  Produto                  Preço        |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|  100     Cachorro Quente          R$ 1,20      |");
        System.out.println("|  101     Bauru Simples            R$ 1,30      |");
        System.out.println("|  102     Bauru com Ovo            R$ 1,50      |");
        System.out.println("|  103     Hambúrguer               R$ 1,20      |");
        System.out.println("|  104     Cheeseburger             R$ 1,30      |");
        System.out.println("|  105     Refrigerante             R$ 1,00      |");
        System.out.println("+================================================+");

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        String nomeProduto = "";
        double precoProduto = 0;

        switch (codigo) {
            case 100:
                nomeProduto  = "Cachorro Quente";
                precoProduto = 1.20;
                break;
            case 101:
                nomeProduto  = "Bauru Simples";
                precoProduto = 1.30;
                break;
            case 102:
                nomeProduto  = "Bauru com Ovo";
                precoProduto = 1.50;
                break;
            case 103:
                nomeProduto  = "Hambúrguer";
                precoProduto = 1.20;
                break;
            case 104:
                nomeProduto  = "Cheeseburger";
                precoProduto = 1.30;
                break;
            case 105:
                nomeProduto  = "Refrigerante";
                precoProduto = 1.00;
                break;
            default:
                System.out.println("\nCódigo inválido! Escolha um código entre 100 e 105.");
                scanner.close();
                return;
        }

        double totalPagar = precoProduto * quantidade;

        System.out.println("\n+================================================+");
        System.out.println("|               PEDIDO                           |");
        System.out.println("+================================================+");
        System.out.printf( "|  Produto:      %-32s|\n", nomeProduto);
        System.out.printf( "|  Preço unit.:  %-32s|\n", "R$ " + String.format("%.2f", precoProduto));
        System.out.printf( "|  Quantidade:   %-32s|\n", quantidade);
        System.out.println("|------------------------------------------------|");
        System.out.printf( "|  Total a pagar: %-31s|\n", "R$ " + String.format("%.2f", totalPagar));
        System.out.println("+================================================+");

        scanner.close();
    }
}