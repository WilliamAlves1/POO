package br.com.alpha.prj1;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private char sexo;
    private List<Endereco> enderecos; // Alterado para suportar múltiplos endereços

    public Pessoa() {
        this.enderecos = new ArrayList<>();
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.enderecos = new ArrayList<>();
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    // Método para adicionar um novo endereço à lista
    public void addEndereco(Endereco end) {
        this.enderecos.add(end);
    }

    public String imprimirPessoa() {
        String dados = "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo + "\n";
        dados += "--- Endereços Cadastrados ---";
        for (Endereco e : enderecos) {
            dados += e.Imprimir();
        }
        return dados;
    }
}