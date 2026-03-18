package br.com.alpha.prj1;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Endereco[] enderecos;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo, int quantidadeEnderecos) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.enderecos = new Endereco[quantidadeEnderecos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public String imprimirPessoa() {
        String dados = "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\n";
        dados += "Endereços:";
        for (int i = 0; i < enderecos.length; i++) {
            if (enderecos[i] != null) {
                dados += "\nEndereço " + (i + 1) + ": " + enderecos[i].Imprimir();
            }
        }
        return dados;
    }
}