package Teoría;

import java.util.Scanner;

public class a14JuegoCorrecion {

    public static void main (String[] args) {

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int numeroLeido, numeroIntentos = 0;
        final int MAXINTENTOS = 7;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce número");
        numeroLeido = teclado.nextInt();
        numeroIntentos++;
        while (numeroIntentos < MAXINTENTOS && numeroLeido != numeroSecreto) {

            if (numeroLeido < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            } else if (numeroLeido > numeroSecreto) {
                System.out.println("El número secreto es menor");
            }

            System.out.println("Introduce número");
            numeroLeido = teclado.nextInt();
            numeroIntentos++;
        }
        if(numeroLeido == numeroSecreto) {
            System.out.println("Aciertas");
        } else {
            System.out.println("No aciertas");
        }
    }
}
