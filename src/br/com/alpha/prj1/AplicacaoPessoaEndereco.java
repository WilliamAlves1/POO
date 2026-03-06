package br.com.alpha.prj1;
import java.util.Scanner;

public class AplicacaoPessoaEndereco {

    public static void main(String[] args) {


        Scanner lerDados = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Endereco end = new Endereco();
        char resp;

        System.out.println("Informe o nome: ");
        p1.setNome(lerDados.nextLine());

        System.out.println("Digite a idade: ");
        p1.setIdade(lerDados.nextInt());
        lerDados.nextLine();

        System.out.println("Informe o sexo (f/m): ");
        p1.setSexo(lerDados.next().charAt(0));
        lerDados.nextLine();

        System.out.println("Informe o logradouro: ");
        end.setLogradouro(lerDados.nextLine());

        System.out.print("Digite o número: ");
        end.setNumero(lerDados.nextInt());
        lerDados.nextLine();

        System.out.print("Tem complemento? [s/n] ");
        resp = lerDados.next().charAt(0);

        if ((resp == 'S') || (resp == 's')) {
            lerDados.nextLine();
            System.out.print("Informe o complemento: ");
            end.setComplemento(lerDados.nextLine());
        } else {
            end.setComplemento("");
        }

        System.out.print("Digite o CEP: ");
        end.setCep(lerDados.nextLine());

        p1.setEnd(end);

        System.out.println("\n\t\t - Dados da pessoa: -\n\n" + p1.imprimirPessoa());

        lerDados.close();
    }
}
