import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        Aluno[] listaAlunos = new Aluno[qtd];
        int opcao = 0;
        int cadastrados = 0;

        while (opcao != 3) {
            System.out.println("\nOpções:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Sair");
                System.out.print("\nEscolha uma opção (Digite o número): ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (cadastrados < qtd) {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nome do Aluno: ");
                        String nome = sc.nextLine();

                        System.out.print("Telefone: ");
                        String tel = sc.nextLine();

                        listaAlunos[cadastrados] = new Aluno(id, nome, tel);
                        cadastrados++;
                        System.out.println("Aluno cadastrado!");
                    } else {
                        System.out.println("Limite de cadastros atingido!");
                    }
                    break;

                case 2:
                    System.out.println("\nLista de Alunos: ");
                    if (cadastrados == 0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < cadastrados; i++) {
                            listaAlunos[i].imprimirDados();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}