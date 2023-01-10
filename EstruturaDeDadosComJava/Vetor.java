package EstruturaDeDadosComJava;

import java.util.Arrays;

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
    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elemtentos!");
        }
        this.aumentaCapacidade();

    }

    public void adiciona(int posicao, String elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String toString() {
        return Arrays.toString(elementos);
    }

    public String toString2() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");
        return s.toString();
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.elementos[posicao];
    }

    public boolean busca1(String elemento) {

        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return (true);
            }
        }
        return false;
    }

    private void aumentaCapacidade() {

        if (this.tamanho == this.elementos.length) {
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int busca2(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void visuliza(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println(elementos[i]);
            System.out.println();

        }
    }
}
