import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}