public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Scream Match");
        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = notaDeLaPelicula / 2;
        System.out.println("Media: " + media);
        String sinopsis = """
                                     Matrix es una paradoja del cine en el milenio de neo
                fue lanzada en : """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);

        System.out.println("La clasificacion es de " + clasificacion);

        int temperaturaEnCelcius = 40;
        int temperaturaEnFahrenheit = (int) ((temperaturaEnCelcius * 1.8) + 32);

        String mensaje = String.format("La Temperatura el Celsius de " + temperaturaEnCelcius + " equivale a " + temperaturaEnFahrenheit + " Fahrenheint");
        System.out.println(mensaje);
    }

}