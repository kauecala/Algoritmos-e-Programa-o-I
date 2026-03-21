import java.util.Scanner;
public class Aula5Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidade;
        double totalGeral = 0;

        System.out.println("+===========================================+");
        System.out.println("|               CARDÁPIO                   |");
        System.out.println("+===========================================+");
        System.out.println("|  1 - Cachorro Quente          R$ 1,20   |");
        System.out.println("|  2 - Bauru Simples            R$ 1,30   |");
        System.out.println("|  3 - Bauru com Ovo            R$ 1,50   |");
        System.out.println("|  4 - Hambúrguer               R$ 1,20   |");
        System.out.println("|  5 - Cheeseburger             R$ 1,30   |");
        System.out.println("|  6 - Refrigerante             R$ 1,00   |");
        System.out.println("|  0 - Encerrar pedido                    |");
        System.out.println("+===========================================+");

        do {
            System.out.print("\nDigite o código do produto (0 para sair): ");
            codigo = scanner.nextInt();

            if (codigo == 0) break;

            String nomeProduto = "";
            double precoProduto = 0;

            switch (codigo) {
                case 1:
                    nomeProduto  = "Cachorro Quente";
                    precoProduto = 1.20;
                    break;
                case 2:
                    nomeProduto  = "Bauru Simples";
                    precoProduto = 1.30;
                    break;
                case 3:
                    nomeProduto  = "Bauru com Ovo";
                    precoProduto = 1.50;
                    break;
                case 4:
                    nomeProduto  = "Hambúrguer";
                    precoProduto = 1.20;
                    break;
                case 5:
                    nomeProduto  = "Cheeseburger";
                    precoProduto = 1.30;
                    break;
                case 6:
                    nomeProduto  = "Refrigerante";
                    precoProduto = 1.00;
                    break;
                default:
                    System.out.println("Código inválido! Escolha entre 1 e 6.");
                    continue;
            }

            System.out.print("Digite a quantidade: ");
            quantidade = scanner.nextInt();

            double totalItem = precoProduto * quantidade;
            totalGeral += totalItem;

            System.out.println("+-----------------------------------------+");
            System.out.printf( "|  Produto:    %-27s|\n", nomeProduto);
            System.out.printf( "|  Quantidade: %-27d|\n", quantidade);
            System.out.printf( "|  Total item: R$ %-24s|\n", String.format("%.2f", totalItem));
            System.out.println("+-----------------------------------------+");

        } while (codigo != 0);

        System.out.println("\n+===========================================+");
        System.out.println("|               TOTAL DO PEDIDO            |");
        System.out.println("+===========================================+");
        System.out.printf( "|  Total a pagar: R$ %-22s|\n", String.format("%.2f", totalGeral));
        System.out.println("+===========================================+");

        scanner.close();
    }
}