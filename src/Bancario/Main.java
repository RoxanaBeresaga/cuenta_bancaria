import Bancario.Cuenta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = Cuenta.crearCuentaDesdeInput();

        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double deposito = scanner.nextDouble();
                    cuenta.ingresar(deposito);
                    mostrarSaldo(cuenta);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double retiro = scanner.nextDouble();
                    cuenta.retirar(retiro);
                    mostrarSaldo(cuenta);
                    break;
                case 3:
                    cuenta.extraccionRapida();
                    mostrarSaldo(cuenta);
                    break;
                case 4:
                    double saldoActual = cuenta.consultarSaldo();
                    System.out.println("Saldo actual: " + saldoActual);
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n-- Menú --");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Extracción rápida");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Consultar datos de la cuenta");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void mostrarSaldo(Cuenta cuenta) {
        double saldoActual = cuenta.consultarSaldo();
        System.out.println("Saldo actual: " + saldoActual);
    }
}
