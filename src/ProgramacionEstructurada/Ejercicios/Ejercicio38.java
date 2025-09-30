package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main (String [] args) {

        int secuencia;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime 100 números: ");

        int positivo = 0;
        int negativo = 0;
        int nulo = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Número: " + i + ": ");
            secuencia = teclado.nextInt();

            if (secuencia > 0) {
                positivo++;
            } else if (secuencia < 0) {
                negativo++;
            } else if (secuencia == 0)  {
                nulo++;
            }
        }
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Nulo: " + nulo);
    }
}
