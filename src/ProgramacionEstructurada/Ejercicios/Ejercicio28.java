package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main (String [] args) {

        int dividendo, divisor, cociente, resto;

        // Dividendo / Divisor = Debajo de divisor está el cociente y debajo del dividiendo está el resto

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dividendo: ");
        dividendo = teclado.nextInt();

        System.out.println("Divisor: ");
        divisor = teclado.nextInt();

        cociente = 0;
        resto = dividendo; // Hay que pensar en esto con un ejemplo:

        /*
            Dividendo: 17, Divisor: 5
            Inicio: resto = 17 (tengo 17 para trabajar)
            1ª resta: resto = 17 - 5 = 12 (me quedan 12)
            2ª resta: resto = 12 - 5 = 7 (me quedan 7)
            3ª resta: resto = 7 - 5 = 2 (me quedan 2)
            Como 2 < 5, no puedo restar más. El resto final es 2.
        */

        while (resto >= divisor) {
            resto-=divisor;
            cociente++;
        }

        System.out.println(dividendo + " / " + divisor + " = " + cociente + " resto: " + resto);

    }


}
