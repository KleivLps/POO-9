package GestionDeCuentas;

import java.util.Scanner;

public class ProgramaCuentas {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria(500.00);

        try {
            System.out.println("Saldo actual: S/ " + cuentaBancaria.getSaldoInicial());

            System.out.println("Ingrese la cantidad que desea retirar: S/ " );
            double cantidad = scanner.nextDouble();

            cuentaBancaria.retirar(cantidad);
            System.out.println("Retiro exitoso, Saldo restante: S/" +cuentaBancaria.getSaldoInicial());
        } catch (SaldoInsuficiente e) {
            System.out.println("Error: " +e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado: " +e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Operacion finalizada.");
        }
    }
}
