package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Variables
        double distancia, nMillas;
        int opciones;

        // Esta manera de poner es para que el usuario pueda elegir entre opción 1 u opción 2
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Quieres calcularlo en milla marina o en milla terrestre?");
        System.out.println("Opción 1: milla marina \nOpción 2: milla terrestre");
        opciones = teclado.nextInt();

        System.out.println("¿Cuántas millas quieres?");
        nMillas = teclado.nextDouble();

        // Si elige opción 1, se convertirá las millas marinas a km
        // Si elige opción 2, se convertirá la milla terrestre a km
        if(opciones==1) {
            distancia = 1852 * nMillas / 1000;
            System.out.println("La conversión de milla marinas a km es: " + distancia + " km");
        } else if (opciones==2) {
            distancia = 1609 * nMillas / 1000;
            System.out.println("La conversión de milla terrestre a km es: " + distancia + " km");
        }




    }
}
