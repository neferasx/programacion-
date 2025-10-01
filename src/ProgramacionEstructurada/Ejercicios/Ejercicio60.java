package Ejercicios;

import java.util.Scanner;

public class Ejercicio60 {
    public static void main (String[] args) {
        
        int numero;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i<=10; i++) {
            System.out.println("Número (1 a 49): ");
            numero = teclado.nextInt();
            while (numero < 1 || numero > 49) {
                System.out.println("Nope. Introduce un número del 1 al 49");
                numero = teclado.nextInt();
            }

            if (numero<=10) {
                System.out.println("Primera decena");
            } else if (numero<=20) {
                System.out.println("Segunda decena");
            } else if (numero<=30) {
                System.out.println("Tercera decena");
            } else if (numero<=40) {
                System.out.println("Cuarta decena");
            } else {
                System.out.println("Quinta decena");
            }

        }

    }

}

