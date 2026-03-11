//Kaue Calasans Araujo - Turma B ADS Senac

//As categorias seguem as seguintes faixas etárias:
//Categoria   ~   Idade
// Infantil A = 5 a 7 anos
// Infantil B = 8 a 10 anos
// Juvenil A = 11 a 13 anos
// Juvenil B = 14 a 17 anos
// Sênior = 18 anos ou mais

import java.util.Scanner;
public class CategoriaNadador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        System.out.println("\n--- Resultado ---");
        System.out.println("Idade: " + idade + " anos");

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora das categorias permitidas!");
        }

        scanner.close();
    }
}