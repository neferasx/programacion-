package Teoría;

import java.util.Scanner;

public class a18PrimoONo {
    public static void main (String[] args) {

        // Es primo

        int numero;
        boolean esPrimo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Número: ");
        numero = teclado.nextInt();

        // Suponemos que numero > = 2
        esPrimo = true;
        /* for (int i = 2; i < numero; i++) {
            if (numero%i==0) {
                esPrimo = false;
                // Parar el bucle
            }
        }
        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

         */
        for (int i = 2; i <= Math.sqrt(numero) && esPrimo; i++) {
            if (numero%i==0) {
                esPrimo = false;
                break; // Solo para situaciones complejas
            }
        }
        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
