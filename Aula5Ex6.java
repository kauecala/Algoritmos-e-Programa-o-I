import java.util.Scanner;
public class Aula5Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador        = 1;
        int semObesidade    = 0;
        int comObesidade    = 0;
        System.out.println("          CÁLCULO DE IMC             ");

        do {
            System.out.println("\n Pessoa " + contador + "  ");

            System.out.print("Digite a altura (ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("IMC calculado: %.2f\n", imc);

            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Classificação: Peso normal (sem obesidade) ✔");
                semObesidade++;
            } else if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso ⚠");
                comObesidade++;
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Classificação: Sobrepeso ⚠");
                comObesidade++;
            } else {
                System.out.println("Classificação: Obesidade ⚠");
                comObesidade++;
            }

            contador++;

        } while (contador <= 10);
        System.out.printf( "|  Pessoas sem obesidade (18,5 - 24,9): %-4d|\n", semObesidade);
        System.out.printf( "|  Pessoas com obesidade/fora do ideal: %-4d|\n", comObesidade);

        scanner.close();
    }
}