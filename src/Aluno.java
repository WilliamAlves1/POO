public class Aluno {

    private int id;
    private String nomeAluno;
    private String numeroTelefone;

    public Aluno (int id, String nomeAluno, String numeroTelefone){

        this.id = id;
        this.nomeAluno = nomeAluno;
        this.numeroTelefone = numeroTelefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void imprimirDados(){
        System.out.println("ID do aluno: " + id +
                "Nome do aluno: " + nomeAluno +
                " Telefone: " + numeroTelefone);
    }
}
