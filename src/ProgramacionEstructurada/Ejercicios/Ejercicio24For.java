package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio24For {
    public static void main(String[] args) {
        int a, b;

        Scanner teclado = new Scanner(System.in);

        System.out.println("A: ");
        a = teclado.nextInt();

        System.out.println("B: ");
        b = teclado.nextInt();

        int resultado = 0;

        for (int i = 1; i <= b; i++) {
            resultado += a;
        }
        System.out.println("El producto de " + a + " * " + b + " = " + resultado);
    }
}
