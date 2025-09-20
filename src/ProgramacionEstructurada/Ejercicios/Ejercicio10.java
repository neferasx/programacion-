package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args)  {

        double a, b, c;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime valor de a: ");
        a = teclado.nextDouble();

        System.out.println("Dime valor de b: ");
        b = teclado.nextDouble();

        System.out.println("Dime valor de c: ");
        c = teclado.nextDouble();

        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else {
            double discriminante = Math.pow(b,2) - 4*a*c;

            if(discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
                System.out.println("X1 = " + x1 + " y X2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2*a);
                System.out.println("La única solución es x = " + x);
            } else {
                System.out.println("No hay soluciones reales");
            }
        }

        teclado.close();


    }
}
