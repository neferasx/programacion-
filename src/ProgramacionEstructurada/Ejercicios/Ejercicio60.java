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

            switch (numero/10) {
                case 0:
                    System.out.println("Primera decena");
                    break;
                case 1:
                    System.out.println("Segunda decena");
                    break;
                case 2:
                    System.out.println("Tercera decena");
                    break;
                case 3:
                    System.out.println("Cuarta decena");
                    break;
                case 4:
                    System.out.println("Quinta decena");
                    break;
            }


        }

    }

