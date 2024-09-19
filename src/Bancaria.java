import java.util.Scanner;

public class Bancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cliente = "Tony Stark";
        String cuenta = "Corriente";
        double saldo = 1599.99;
        int opcionIngresada = 0;
        double montoRetiro = 0;
        double montoDeposito = 0;

        System.out.println("Bienvenido " + cliente + "esta es tu cuenta" + cuenta + "Del Banco");
        System.out.println("** Escriba el numero de la Opcion Deseada **");
        System.out.println("1 - Consultar Saldo.");
        System.out.println("2 - Retirar.");
        System.out.println("3 - Depositar");
        System.out.println("9 - Salir");

        opcionIngresada = sc.nextInt();

        switch (opcionIngresada) {
            case 1:
                System.out.println("El saldo de su cuenta corriente es: " + saldo);
                break;
            case 2:
                System.out.println("Ingrese el monto a retirar!");
                montoRetiro = sc.nextInt();

                while (montoRetiro > saldo) {
                    System.out.println("Ingrese un saldo disponible");
                    montoRetiro = sc.nextInt();
                }
                if (montoRetiro <= saldo) {
                    double result = saldo - montoRetiro;
                    System.out.println("Su nuevo saldo es: $" + result);
                }
                break;
            case 3:
                System.out.println("Ingrese el monto a Depopsitar!");
                montoDeposito = sc.nextInt();

                while (montoDeposito <= 0) {
                    System.out.println("El monto a depositar debe ser mayor a 0");
                    montoDeposito = sc.nextInt();
                    break;
                }
                if (montoDeposito <= 0) {
                    double result = montoDeposito + saldo;
                    System.out.println("Su nuevo saldo disponible es: $" + result);
                }
                break;
            default:
                System.out.println("Gracias por usar nuestro servicio!");
                break;
        }

        sc.close();
    }
}
