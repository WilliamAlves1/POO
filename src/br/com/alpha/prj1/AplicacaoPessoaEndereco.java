package br.com.alpha.prj1;
import java.util.Scanner;

public class AplicacaoPessoaEndereco {

    public static void main(String[] args) {

        Scanner lerDados = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        char resp;

        System.out.println("Informe o nome: ");
        p1.setNome(lerDados.nextLine());

        System.out.println("Digite a idade: ");
        p1.setIdade(lerDados.nextInt());
        lerDados.nextLine();

        System.out.println("Informe o sexo (f/m): ");
        p1.setSexo(lerDados.next().charAt(0));
        lerDados.nextLine();

        System.out.print("Quantos endereços deseja cadastrar para esta pessoa? ");
        int qtdEnderecos = lerDados.nextInt();
        lerDados.nextLine();

        for (int i = 0; i < qtdEnderecos; i++) {
            System.out.println("\nCadastro do Endereço " + (i + 1) + ":");
            Endereco end = new Endereco();

            System.out.println("Informe o logradouro: ");
            end.setLogradouro(lerDados.nextLine());

            System.out.print("Digite o número: ");
            end.setNumero(lerDados.nextInt());
            lerDados.nextLine();

            System.out.print("Tem complemento? [s/n] ");
            resp = lerDados.next().charAt(0);
            lerDados.nextLine(); // Limpa o buffer

            if ((resp == 'S') || (resp == 's')) {
                System.out.print("Informe o complemento: ");
                end.setComplemento(lerDados.nextLine());
            } else {
                end.setComplemento("");
            }

            System.out.print("Digite o CEP: ");
            end.setCep(lerDados.nextLine());

            p1.addEndereco(end);
        }

        System.out.println("\n\t\t - Dados Consolidados: -\n\n" + p1.imprimirPessoa());

        lerDados.close();
    }
}