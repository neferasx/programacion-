package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args)  {
        double numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        numero = teclado.nextDouble();

        if(numero >=10 && numero <=100) {
            System.out.println("El número está comprendido entre 10 y 100");
        } else {
            System.out.println("El número no está comprendido entre 10 y 100");
        }

    }
}
