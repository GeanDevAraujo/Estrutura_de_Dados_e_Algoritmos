package EstruturaDeDadosComJava;

public class Aula3 {

    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.visuliza(null);

        try {
            vetor.adiciona("elemtento 4");
            vetor.adiciona("elemtento 2");
            vetor.adiciona("elemtento 3");
            vetor.adiciona("elemtento 3");
            vetor.adiciona("elemtento 3");
            vetor.adiciona("elemtento 3");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
