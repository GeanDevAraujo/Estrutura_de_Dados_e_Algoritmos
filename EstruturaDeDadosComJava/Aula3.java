package EstruturaDeDadosComJava;

public class Aula3 {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(4);

        vetor.adiciona("elemento 1");
        vetor.visuliza(null);

        // try {
        vetor.adiciona("elemtento 4");
        vetor.adiciona("elemtento 2");
        /*
         * vetor.adiciona("elemtento 3");
         * vetor.adiciona("elemtento 3");
         * vetor.adiciona("elemtento 3");
         * vetor.adiciona("elemtento 3");
         * 
         * } catch (Exception e) {
         * e.printStackTrace();
         * }
         * 
         */
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.toString2());

    }

}
