public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String plan = "Plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("La Pelicula es Reciente!!");
        } else {
            System.out.println("La pelicula No es reciente.");
        }

        if (incluidoEnElPlan || plan.equals("Plus")){
            System.out.println("Esta incluido en su plan");
        }else{
            System.out.println("Esta peñicula no esta disponible en su plan actual");
        }


    }
}
