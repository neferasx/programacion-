package Teoría;

import java.util.Scanner;

public class a17ForEx5 {

    public static void main (String [] args) {

        // Pedir al usuario la tabla de multiplicación y que aparezca también las anteriores tablas, es decir, si me pides 5 tablas debe aparecer también:
        // Las tablas de multiplicar del 1,2,3,4 y el 5.


        int numero, resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 10: ");
        numero = teclado.nextInt();

        while (!(numero >= 1 && numero <= 10)) {
            System.out.println("Debes introducir un número del 1 al 10: ");
            numero = teclado.nextInt();
        }

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= 10; j++) {
                resultado = i * j;
                System.out.println(i + " * " + j + " = " + resultado);
            }
            System.out.println();
        }
    }
}

