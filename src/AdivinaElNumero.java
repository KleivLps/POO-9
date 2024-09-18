import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(50) + 1;

        int intentos = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de adivinar el numero!");
        System.out.println("Adivina el numero que estoy pensando, es entre el 1 y el 50. ¿Podras adivinarlo? ");

        while (!adivinado) {
            System.out.println("Ingresa un numero: ");

            try {
                intentos++;
                int numeroUsuario = scanner.nextInt();

                if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El numero es mayor.");
                } else if (numeroUsuario > numeroAdivinar) {
                    System.out.println("El numero es menor.");
                } else {
                    System.out.println("¡¡Felicidades!!, sabia que lo lograrias, lo adivinaste en " +intentos+ " intentos. ");
                    adivinado = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un numero que este dentro del limite (1- 50). ");
                intentos++;
                scanner.next();
            }
        }

        scanner.close();
    }
}