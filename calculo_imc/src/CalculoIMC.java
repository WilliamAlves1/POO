
public class CalculoIMC {

    public void calcularExibirResultados(double[] pesos, double[] alturas) {

        System.out.println("\n==================================");
        System.out.println("     Resultados dos Cálculos");
        System.out.println("==================================");

        for (int i = 0; i < pesos.length; i++) {
            double peso = pesos[i];
            double altura = alturas[i];

            double imc = peso / (altura * altura);

            String categoria = this.getCategoria(imc);

            System.out.printf("\n--- Pessoa %d ---\n", (i + 1));
            System.out.printf("Peso:   \t%.2f kg\n", peso);
            System.out.printf("Altura: \t%.2f m\n", altura);
            System.out.printf("IMC:    \t%.2f\n", imc);
            System.out.println("Categoria:\t" + categoria);
        }
    }

    private String getCategoria(double imc) {
        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc < 24.9) {
            return "Peso adequado";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}