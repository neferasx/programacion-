package Ejercicios;

import java.util.Scanner;

public class Ejercicio64 {
    public static void main (String [] args) {
        int n;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Imprima los N primeros primos");
        n = teclado.nextInt();

        int numero = 2;
        int contador = 0;

        while (contador < n) {
            boolean esPrimo = true; {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i==0) {
                        esPrimo = false;
                        break;
                    }

                }
            }
            if (esPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}