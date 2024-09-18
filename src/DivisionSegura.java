import java.util.Scanner;

public class DivisionSegura {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            realizarDivision();
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void realizarDivision() throws Exception {
        try {
            System.out.println("Ingrese el numerador (dividendo): ");
            int NumeroA = scanner.nextInt();

            int NumeroB = obtenerDenominador();

            int resultado = NumeroA / NumeroB;
            System.out.println("El resultado de la division es: " +resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero. ");
        } finally {
            scanner.close();
            System.out.println("Scanner Cerrado.");
        }
    }

    public static int obtenerDenominador() throws Exception {
        System.out.println("Ingrese el denominador (divisor): ");
        int denominador = scanner.nextInt();

        if (denominador == 0) {
            throw new Exception("El denominador no puede ser cero.");
        }
        if (denominador < 0) {
            throw new Exception("El denominador no puede ser menor que cero.");
        }

        return denominador;
    }
}

