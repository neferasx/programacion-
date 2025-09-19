package Teoría;

import java.util.Scanner;

public class a9EjClase {
    public static void main(String[] args) {

        int n1, n2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige el primer número: ");
        n1 = teclado.nextInt();

        System.out.println("Elige el segundo número: ");
        n2 = teclado.nextInt();

        if(n1 < n2) {
            System.out.println("El primer número es menor que el segundo");
        } else if(n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El primer número es mayor que el segundo");
        }

    }
}
