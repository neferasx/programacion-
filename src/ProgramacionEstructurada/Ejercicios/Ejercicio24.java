package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main (String [] args) {
        int a,b;

        Scanner teclado = new Scanner(System.in);

        System.out.println("A: ");
        a = teclado.nextInt();

        System.out.println("B: ");
        b = teclado.nextInt();

        int producto = 0, contador = 0;

        while (contador < b) {
            producto += a;
            contador++;
        }

        System.out.println("El producto de " + a + " * " + b + " = " + producto);

    }
}
