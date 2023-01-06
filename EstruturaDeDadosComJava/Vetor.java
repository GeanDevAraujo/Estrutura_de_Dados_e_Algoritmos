package EstruturaDeDadosComJava;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
     * Algoritmo Simples sem otimização
     * 
     * public void adiciona(String elemento) {
     * for (int i = 0; i < this.elementos.length; i++) {
     * if (this.elementos[i] == null) {
     * this.elementos[i] = elemento;
     * break;
     * }
     * }
     * }
     */
    public void adiciona(String elementos) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elementos;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elemtentos!");
        }

    }

    public void visuliza(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println(elementos[i]);
            System.out.println();

        }
    }
}
