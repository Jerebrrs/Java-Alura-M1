import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvalucion = 0;
        double totalEvaluacion = 0;

        while (nota != -1) {
            System.out.println("Reescribe la nota que le darias a la pelicula Matrix.");
            nota = teclado.nextDouble();


            if (nota != -1) {
                mediaEvalucion += nota;
                totalEvaluacion++;
            }
        }
        System.out.println("Media evaluaciones para Matrix es : " + mediaEvalucion / totalEvaluacion);

    }
}
