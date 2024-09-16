import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinado = -1;
        int numeroAleatorio = random.nextInt(101);
        int intentos = 0;
        int maxIntentos = 5;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        while (intentos < maxIntentos && numeroAdivinado != numeroAleatorio) {
            System.out.println("Introduzca un numero entre 0 y 100");
            numeroAdivinado = sc.nextInt();

            intentos++;

            if (numeroAdivinado < numeroAleatorio) {
                System.out.println("El numero a adivinar es mayor!");
            } else {
                System.out.println("El numero a adivinar es menor!");
            }

        }
        if (numeroAdivinado != numeroAleatorio) {
            System.out.println("Has superado el numero de intentos disponibles!");
        }
        sc.close();
    }
}

