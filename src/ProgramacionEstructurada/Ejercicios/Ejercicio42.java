package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main (String [] args) {

        int n, contadorPositivo, contadorNegativo;
        double sumaPositivos, sumaNegativos, mediaPositivos, mediaNegativos;

        sumaPositivos = 0;
        sumaNegativos = 0;
        contadorPositivo = 0;
        contadorNegativo = 0;

        Scanner teclado = new Scanner(System.in) ;

        System.out.println("Introduce un número (0 para terminar): ");
        n = teclado.nextInt();

        // Procesar números hasta que se introduzca 0
        while (n != 0) {
            if (n > 0) {
                sumaPositivos+=n;
                contadorPositivo++;
            } else if (n < 0) {
                sumaNegativos+=n;
                contadorNegativo++;
            }
            System.out.println("Introduce el siguiente número (0 para terminar): ");
            n = teclado.nextInt();
        }


        if (contadorPositivo > 0) {
            mediaPositivos = sumaPositivos / contadorPositivo;
            System.out.println("Media de números positivos: " + mediaPositivos);
        }  else {
            System.out.println("No se introdujeron números positivos");
        }

        if (contadorNegativo > 0) {
            mediaNegativos = sumaNegativos / contadorNegativo;
            System.out.println("Media de números negativos: " + mediaNegativos);
        } else {
            System.out.println("No se introdujeron números negativos");
        }
    }
}
