package EstruturaDeDadosComJava;

public class Aula07 {
    public static void main(String[] args) throws Exception {
        Vetor vetor1 = new Vetor(10);

        vetor1.adiciona(" B ");
        vetor1.adiciona(" C ");
        vetor1.adiciona(" E ");
        vetor1.adiciona(" F ");
        vetor1.adiciona(" G ");

        System.out.println(vetor1);

        vetor1.adiciona(0, " A ");

        System.out.println(vetor1);

        vetor1.adiciona(3, " D ");

        System.out.println(vetor1);

    }
}