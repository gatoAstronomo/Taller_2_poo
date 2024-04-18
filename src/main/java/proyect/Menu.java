package proyect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            mostrarMenu();
            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Seleccionaste la opción 1");
                        break;
                    case 2:
                        System.out.println("Seleccionaste la opción 2");
                        break;
                    case 3:
                        System.out.println("Seleccionaste la opción 3");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número entero.");
                scanner.nextLine();
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Mostrar sismo más intenso");
        System.out.println("2. Mostrar sismos ≥ 4.0 grados Richter");
        System.out.println("3. Reiniciar el arreglo con nuevos valores");
        System.out.println("4. Salir del Programa");
        System.out.print("Selecciona una opción: ");
    }
}