import java.io.OutputStream;
import java.util.Scanner;

public class SaludoUsuario {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        saludarUsuario();
    }

    public static void saludarUsuario() {
        try {
            System.out.println("Por favor, ingrese su nombre: ");
            String nombre = scanner.nextLine();

            if (nombre.length() <2) {
                throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres.");
            }
            System.out.println("!Hola, " +nombre+ "! Bienvenido/a.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " +e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner cerrado.");
        }
    }
}
