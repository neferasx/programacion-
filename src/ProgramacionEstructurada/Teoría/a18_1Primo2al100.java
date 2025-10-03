package Teoría;
import java.util.Scanner;

public class a18_1Primo2al100 {
    public static void main (String[] args) {


        System.out.println("Números primos en orden creciente:");
        for (int numero = 2; numero <= 100; numero++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(numero + " ");
            }
        }

        System.out.println("\nNúmeros primos en orden decreciente:");
        for (int numero = 100; numero >= 2; numero--) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(numero + " ");
            }
        }
    }
}