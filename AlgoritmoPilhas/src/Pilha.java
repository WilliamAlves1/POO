public class Pilha {

    private String[] pilha;
    private final int inicio;
    private int fim;

    public Pilha(int tamanho) {
        pilha = new String[tamanho];
        inicio = 0;
        fim = 0;
    }

    public void push(String nome) {
        if (!isFull()) {
            pilha[fim++] = nome;
        } else {
            System.out.println("Pilha cheia!\n");
        }
    }

    public String pop() {
        String aux;

        if(!isEmpty()) {
            aux = pilha[fim - 1];
            fim--;

            System.out.printf("%S foi deletado\n", aux);
            return aux;
        } else {

            System.out.println("Pilha está vazia!");
            return null;
        }
    }

    public String peek() {
        if(!isEmpty()) {
            return pilha[fim - 1];
        } else {
            String estado = "Pilha está vazia!";
            return estado;
        }
    }

    public boolean isEmpty() {
        return (inicio == fim);
    }

    public boolean isFull() {
        return (fim == pilha.length);
    }
}