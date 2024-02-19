package Bancario;
import java.util.Scanner;
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldo;

    // Constructor por defecto
    public Cuenta() {
    }

    // Constructor con parámetros
    public Cuenta(int numeroCuenta, long dniCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldo = saldo;
    }

    // Métodos getters y setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para crear un objeto Cuenta, pidiendo datos al usuario
    public static Cuenta crearCuentaDesdeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de cuenta:");
        int numeroCuenta = scanner.nextInt();

        System.out.println("Ingrese el DNI del cliente:");
        long dniCliente = scanner.nextLong();

        System.out.println("Ingrese el saldo inicial:");
        double saldo = scanner.nextDouble();

        return new Cuenta(numeroCuenta, dniCliente, saldo);
    }

    // Método para ingresar dinero a la cuenta
    public void ingresar(double ingreso) {
        saldo += ingreso;
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double retiro) {
        if (retiro > saldo) {
            saldo = 0;
        } else {
            saldo -= retiro;
        }
    }

    // Método para realizar extracción rápida (sacar el 20% del saldo)
    public void extraccionRapida() {
        double porcentajeARetirar = 0.20;
        double retiro = saldo * porcentajeARetirar;
        retirar(retiro);
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para mostrar todos los datos de la cuenta
    public void consultarDatos() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("DNI del Cliente: " + dniCliente);
        System.out.println("Saldo Actual: " + saldo);
    }
}