import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el name de tu pelicula. ");
        String pelicula = teclado.nextLine();
        System.out.println("Escriba la fecha de lanzamiento de la pelicula.");
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Dinos que nota le das a esta pelicula?");

        double nota = teclado.nextDouble();

        System.out.println(pelicula + fechaDeLanzamiento + nota);
        teclado.close();
    }
}
