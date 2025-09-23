package Teoría;

import java.util.Scanner;

public class a13_2WhileClase {
    public static void main (String[] args) {

        int numero=1, resultado, opcion;

        Scanner teclado = new Scanner(System.in);

        // Esto es un bucle infinito
        /* while(numero<=10) {
            System.out.println("Hola");
        } */

        // Esto es un bucle finito
        while (numero<=10) {
            System.out.println("Hola");
            numero++;
        }




    }
}
