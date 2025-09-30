package Teoría;

import java.util.Scanner;

public class a15EscaleraCorregido {
    public static void main (String [] args) {
        int linea, numero, contadorNLinea;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Número: ");
        numero = teclado.nextInt();
        linea = 1;
        // Control de lineas
        while (linea <= numero) {
            // Cada línea con print
            contadorNLinea = 1;

            while (contadorNLinea <= linea) {
                System.out.print(contadorNLinea);
                contadorNLinea++;
            }

            System.out.println();
            linea++;
        }

    }
}
