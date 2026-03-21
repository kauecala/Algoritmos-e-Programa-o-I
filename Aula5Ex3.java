import java.util.Scanner;
public class Aula5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int valor = 1;

        while (valor <= numero) {
            System.out.print(valor + " ");
            valor = valor * 2;
        }
        scanner.close();
    }
}