package ProgramacionEstructurada.Teoría;

import java.util.Scanner;

public class a7_1EjIf {

    public static void main(String[] args) {

        // Leer de teclado un número
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un valor: ");
        numero = teclado.nextInt();

        // Si el numero introducido es > 10 debe aparecer un mensaje
        if (numero > 10) {
            System.out.println("Has elegido un numero mayor que 10");
            if (numero % 2 == 0) {
                // Cosas si par
                System.out.println("Es par");
            } else {
                System.out.println("No es par");
            }
        } else {
            System.out.println("No es mayor que 10");
        }
    }
}
