package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main (String[] args) {
        int n, contador = 1, multiplo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        n = teclado.nextInt();

        while (contador <= n) {
            multiplo = contador * 4;
            System.out.println(contador + " múltiplo de 4: " + multiplo);
            contador++;
        }
    }
}
