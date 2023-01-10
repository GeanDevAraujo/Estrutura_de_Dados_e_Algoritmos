package EstruturaDeDadosComJava;

public class Aula08 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(3);
        System.out.println(vetor.tamanho());
        vetor.adiciona(" B ");
        vetor.adiciona(" C ");
        vetor.adiciona(" E ");
        vetor.adiciona(" F ");
        vetor.adiciona(" G ");
        System.out.println(vetor.tamanho());
    }
}