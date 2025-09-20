package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args)  {
        // Calcular la cantidad total a pagar por una llamada telefónica
        // a. Toda llamada que dure < 3 min = 10 pts
        // b. Cada minuto adicional a partir de 3 min es un paso de contador y = +5pts

        int llamada, pesetas;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos minutos has estado en llamada telefónica? ");
        llamada = teclado.nextInt();

        if(llamada<3) {
            pesetas = 10;
            System.out.println("Cuestán: " + pesetas + " pts");
        } else if (llamada>=3){
            pesetas = 10 + (llamada - 3) * 5;
            System.out.println("Cuestán: " + pesetas + " pts");
        }


    }
}
