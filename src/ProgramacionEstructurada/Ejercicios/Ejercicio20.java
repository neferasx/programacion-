package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Imprimir los N primeros múltiplos de 4. N es introducido por teclado.

       /* int n, contador = 1, multiplo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        n = teclado.nextInt();

        while (contador <= n) {
            multiplo = contador * 4;
            System.out.println(contador + " múltiplo de 4: " + multiplo);
            contador++;
        }
    }
}
*/

        // multiplos de 4 es numero%4==0
        // println para imprimir
        // sumar 4 para obtener múltiplos
        // nextInt para leer de teclado el valor N
        // contar cuántos voy imprimiendo
        // println 4
        // si N>0 imprimo y si no lo es no imprimo
        // cómo consigo hacer muchos println? --> bucle

        int cantidadMultiplos, multiploCuatro, contador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cantidad: ");
        cantidadMultiplos = teclado.nextInt();

        if (cantidadMultiplos > 0) {
            multiploCuatro = 4;
            contador = 0;
            while(contador<cantidadMultiplos) {
                System.out.println("multiploCuatro");
                multiploCuatro+=4;
                contador++;

            }

        }




    }
}