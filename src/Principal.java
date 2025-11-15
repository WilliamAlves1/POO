import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Quantas pessoas você deseja calcular o IMC? ");
        int numeroDePessoas = scanner.nextInt();

        double[] pesos = new double[numeroDePessoas];
        double[] alturas = new double[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.printf("\n--- Dados da Pessoa %d ---\n", (i + 1));

            System.out.print("Digite o peso (em kg, ex: 70.5): ");
            pesos[i] = scanner.nextDouble();

            System.out.print("Digite a altura (em metros, ex: 1.75): ");
            alturas[i] = scanner.nextDouble();
        }

        CalculoIMC calculadora = new CalculoIMC();

        calculadora.calcularExibirResultados(pesos, alturas);

        scanner.close();
    }
}