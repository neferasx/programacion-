package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int n1,n2,n3;

        Scanner teclado = new Scanner(System.in);

        System.out.println("N1: ");
        n1 = teclado.nextInt();

        System.out.println("N2: ");
        n2 = teclado.nextInt();

        System.out.println("N3: ");
        n3 = teclado.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println("Es orden creciente");
        } else {
            System.out.println("No es orden creciente");
        }
    }
}
