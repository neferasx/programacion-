package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        int numero, resultado, contador = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 9: ");
        do {
            System.out.println("Debes introducir un número del 1 al 9: ");
            numero = teclado.nextInt();
        } while (numero<1 || numero>9);

        while (contador <= 10) {
            resultado = numero * contador;
            System.out.println(numero + " * " + contador + " = " + resultado);
            contador++;
        }
    }
}