package proyect;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void ejecutarMenu() {
        RegistroSismatologico registro = new RegistroSismatologico();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            mostrarMenu();
            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println(registro.sismoMasFuerte());
                        break;
                    case 2:
                        System.out.println(registro.SismoMayorA4(12));
                        break;
                    case 3:
                        registro.vaciarRegistro();
                        registro.llenarRegistro(3);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa.....");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número entero.");
                scanner.nextLine();
            }
        } while (opcion != 4);

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