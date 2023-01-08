package EstruturaDeDadosComJava;

public class Aula06 {
    public static void main(String[] args) throws Exception {
        Vetor vetor1 = new Vetor(10);

        vetor1.adiciona("elemento 1");
        vetor1.adiciona("elemento 2");
        vetor1.adiciona("elemento 3");

        System.out.println(vetor1.busca1("elemento 1"));
        System.out.println(vetor1.busca1("elemento 5"));

    }

}
