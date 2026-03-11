import java.util.Scanner;
public class AptidaoVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você é brasileiro(a)? (sim/nao): ");
        String brasileiro = scanner.next();

        System.out.print("Você é alfabetizado(a)? (sim/nao): ");
        String alfabetizado = scanner.next();

        System.out.println("\n--- Resultado ---");

        if (!brasileiro.equals("sim")) {
            System.out.println("Não apto(a) para votar. Apenas brasileiros podem votar.");
        } else if (idade < 16) {
            System.out.println("Não apto(a) para votar. Idade mínima é 16 anos.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Apto(a) para votar! Voto FACULTATIVO (16 a 17 anos).");
        } else if (idade >= 18 && idade < 70 && alfabetizado.equals("sim")) {
            System.out.println("Apto(a) para votar! Voto OBRIGATÓRIO (18 a 69 anos).");
        } else if (idade >= 18 && idade < 70 && alfabetizado.equals("nao")) {
            System.out.println("Apto(a) para votar! Voto FACULTATIVO (analfabeto).");
        } else if (idade >= 70) {
            System.out.println("Apto(a) para votar! Voto FACULTATIVO (70 anos ou mais).");
        }

        scanner.close();
    }
}