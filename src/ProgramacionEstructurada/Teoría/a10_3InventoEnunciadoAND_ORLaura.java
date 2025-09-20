package ProgramacionEstructurada.Teoría;

import java.util.Scanner;

public class a10_3InventoEnunciadoAND_ORLaura {
    public static void main(String[] args) {
        /*
            Una discoteca tiene las siguientes reglas para permitir la entrada:
            La persona debe tener 18 años o más
            Pueden entrar a la discoteca personas de 17 años, solo si es viernes y vienen acompañado de un adulto.
            Como segurata, usa el programa para saber si las personas pueden entrar o no.
         */

        int edad;
        boolean viernes, adulto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qué edad tienes: ");
        edad = teclado.nextInt();

        System.out.println("¿Es viernes? ");
        viernes = teclado.nextBoolean();

        System.out.println("¿Vienes acompañado de un adulto? ");
        adulto = teclado.nextBoolean();

        if (edad >= 18) {
            System.out.println("Puedes entrar");
        } else if (edad== 17 && viernes && adulto) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}
