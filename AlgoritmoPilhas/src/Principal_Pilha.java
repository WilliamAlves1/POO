import java.util.Scanner;

public class Principal_Pilha {

    public static void main(String[] args) {
        boolean executa = true;
        Scanner lerpilha = new Scanner(System.in);

        System.out.println("Quantos nomes deseja colocar na pilha?");
        int tam = lerpilha.nextInt();

        Pilha pilha = new Pilha(tam);

        do {
            System.out.println("""
                               1 - Incluir item na pilha
                               2 - Excluir elemento da pilha
                               3 - Exibir elemento do topo
                               0 - Sair do programa
                               """);

            int escolha = lerpilha.nextInt();

            if (escolha > 3 || escolha < 0) {
                escolha = 0;
            }

            switch (escolha) {
                case 1:
                    System.out.println("Digite o elemento que deseja inserir");
                    String insert = lerpilha.next();
                    pilha.push(insert);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    System.out.println(pilha.peek());
                    break;
                case 0:
                    System.out.println("Esperamos poder revê-lo logo!");
                    System.exit(0);
            }

        } while (executa == true);
    }
}