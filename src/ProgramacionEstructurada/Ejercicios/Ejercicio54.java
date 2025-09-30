package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio54 {
    public static void main (String [] args) {

        int a,b;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("A: ");
            a = teclado.nextInt();
            System.out.println("B: ");
            b = teclado.nextInt();

            int producto = 0;

            for (int j = 1; j <= a; j++) {
                producto += b;
            }
            System.out.println("El producto de " + a + " * " + b + " = " + producto);
        }

    }
}
