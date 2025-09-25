package Teoría;

import java.util.Scanner;

public class a14Juego {
    public static void main(String[] args) {

        /*
            El programa generará un número aleatorio entre 1 y 100. El usuario debe adivinar dicho número.
            Después de cada intento, el programa indicará si el número ingresado es mayor o menor que el número objetivo, hasta que el usuario acierte.
            Se establecerá un máximo de 7 intentos.
            Si el usuario no logra adivinar el número después del séptimo intento,
            el programa le informará que ha agotado el número máximo de intentos y que no ha acertado.
            En ese momento, el juego finalizará y no podrá continuar intentando.

        */

        int numeroAleatorio = (int) (Math.random() * 100) + 1; // 1 al 100
        int intentos = 0;
        int maxIntentos = 7;
        int intento;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Esto es un juego. Se trata de adivinar un número del 1 al 100");
        System.out.println("Tienes " + maxIntentos + " intentos como máximo");

        while (intentos < maxIntentos) {
            System.out.print("Introduce un número: ");
            intento = teclado.nextInt();
            intentos++;

            if (intento == numeroAleatorio) {
                System.out.println("¡Has adivinado el número en " + intentos + " intentos!");
                break;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número aleatorio es mayor.");
            } else {
                System.out.println("El número aleatorio es menor.");
            }
            System.out.println("Intentos restantes: " + (maxIntentos - intentos));
        }

        if (intentos == maxIntentos) {
            System.out.println("Has agotado tus " + maxIntentos + " intentos. El número era " + numeroAleatorio + ".");
        }
    }
}

