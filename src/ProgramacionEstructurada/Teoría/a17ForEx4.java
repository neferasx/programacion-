package Teoría;

import java.util.Scanner;

public class a17ForEx4 {

    public static void main (String [] args) {
        // Introducir 50 numeros y que te diga el valor más pequeño introducido

        int minimo = Integer.MAX_VALUE;
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce 50 números: ");


        for (int i = 1; i < 50; i++) {
            System.out.println("Número " + i + ": ");
            numero = teclado.nextInt();

            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("El número más pequeño es: " + minimo);

    }


}
