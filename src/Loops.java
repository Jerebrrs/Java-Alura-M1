import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Reescribe la nota que le darias a la pelicula Matrix.");
            nota = teclado.nextDouble();

            mediaEvaluaciones += nota;

            System.out.println("Media evaluaciones para Matrix es : " + mediaEvaluaciones / 3);
        }
        teclado.close();
    }
}
