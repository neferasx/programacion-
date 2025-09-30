package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio60 {
    public static void main (String[] args) {

        int decena = 1;
        int numero;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i<=10; i++) {
            System.out.println("Número (1 a 49): ");
            numero = teclado.nextInt();
            while (numero < 1 || numero > 49) {
                System.out.println("Nope. Introduce un número del 1 al 49");
                numero = teclado.nextInt();
            }

            decena = numero / 10;

            System.out.println("El número " + numero + " pertenece a la decena " + decena);

        }

    }

}
