package ProgramacionEstructurada.Teoría;

import java.util.Scanner;

public class a14Juego2 {
    public static void main(String[] args) {
        // Pedir 100 numeros por teclado, después de pedirlos se saca por pantalla el mayor de todos

        int mayor = 0; // se guarda el numero mas grande
        int contador = 0; // contador para saber cuantos numeros llevamos
        int numero; // leer en teclado

        Scanner teclado = new Scanner(System.in);

        while (contador < 100) {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();

            if (contador == 0) {
                // el primer numero siempre lo guardamos como mayor
                mayor = numero;
            } else if (numero > mayor) {
                // si el numero nuevo es mayor que el guardado, se cambia
                mayor = numero;
            }
            contador++;
        }

        System.out.println("El número más grande es: " + mayor);
    }
}

