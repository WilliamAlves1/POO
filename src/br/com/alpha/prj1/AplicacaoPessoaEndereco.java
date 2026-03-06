package br.com.alpha.prj1;

import java.util.Scanner;

public class AplicacaoPessoaEndereco {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = lerDados.nextLine();

        System.out.println("Digite a idade: ");
        int idade = lerDados.nextInt();
        lerDados.nextLine();

        System.out.println("Informe o sexo (f/m): ");
        char sexo = lerDados.next().charAt(0);
        lerDados.nextLine();

        System.out.println("Quantos endereços deseja cadastrar? ");
        int qtd = lerDados.nextInt();
        lerDados.nextLine();

        Pessoa p1 = new Pessoa(nome, idade, sexo, qtd);
        Endereco[] listaEnderecos = new Endereco[qtd];

        for (int i = 0; i < qtd; i++) {
            Endereco end = new Endereco();
            System.out.println("\nEndereço " + (i + 1));

            System.out.println("Informe o logradouro: ");
            end.setLogradouro(lerDados.nextLine());

            System.out.print("Digite o número: ");
            end.setNumero(lerDados.nextInt());
            lerDados.nextLine();

            System.out.print("Tem complemento? [s/n] ");
            char resp = lerDados.next().charAt(0);
            lerDados.nextLine();

            if ((resp == 'S') || (resp == 's')) {
                System.out.print("Informe o complemento: ");
                end.setComplemento(lerDados.nextLine());
            } else {
                end.setComplemento("");
            }

            System.out.print("Digite o CEP: ");
            end.setCep(lerDados.nextLine());

            listaEnderecos[i] = end;
        }

        p1.setEnderecos(listaEnderecos);

        System.out.println("\n\t\t - Dados da pessoa: -\n\n" + p1.imprimirPessoa());

        lerDados.close();
    }
}