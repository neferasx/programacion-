package Teoría;

import java.util.Scanner;

public class a17ForEx3 {
    public static void main (String[] args) {
        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Número: ");
        numero = teclado.nextInt();

        int factorial = 1;

        while (numero <= 0) {
            System.out.println("Número mayor o igual que cero, por favor: ");
            numero = teclado.nextInt();

        }

        for (int i = 1; i<=numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

}
