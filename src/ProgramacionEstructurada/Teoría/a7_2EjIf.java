package Teoría;

import java.util.Scanner;

public class a7_2EjIf {
    public static void main(String[] args) {

        // Leer de teclado un número
        int numero, numero2=9;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un valor: ");
        numero = teclado.nextInt();

        if (!(numero>9)&&(numero%2==0) || (numero%3==0 && numero2%5==0)) {

        }
    }

    // Crear un valor y que diga en un mensaje que si está entre 1 y 10 o si no está entre 1 y 10
}
