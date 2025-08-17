package principal;

import calculos.Conversor;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        boolean salir = false;

        while (!salir) {
            conversor.exibirMenu();
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> conversor.convertir("USD", "ARS");
                case "2" -> conversor.convertir("ARS", "USD");
                case "3" -> conversor.convertir("USD", "BRL");
                case "4" -> conversor.convertir("BRL", "USD");
                case "5" -> conversor.convertir("USD", "COP");
                case "6" -> conversor.convertir("COP", "USD");
                case "7" -> {
                    System.out.println("¡Gracias por usar el Conversor!");
                    salir = true;
                }
                default -> System.out.println("Opción no válida. Por favor elija un número del 1 al 7.");
            }
        }

        scanner.close();
    }
}
