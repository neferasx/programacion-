package Teoría;

import java.util.Scanner;

public class a10InventoEnunciadoAND_OR {
    public static void main(String[] args) {
        // Comprueba si un usuario puede acceder a un libro de la biblioteca universitaria
        // únicamente si es mayor de 18 años y alumno de la universidad, o si está pagando una cuota.

        int edad;
        boolean esAlumno, cuota;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué edad tienes?: ");
        edad = teclado.nextInt();

        System.out.println("¿Eres alumno/a de la universidad?: ");
        esAlumno = teclado.nextBoolean();

        System.out.println("¿Estás pagando una cuota?: ");
        cuota = teclado.nextBoolean();

        if(edad >= 18 && esAlumno || cuota) {
            System.out.println("Puedes acceder a un libro");
        } else {
            System.out.println("No puedes acceder a un libro");
        }



    }
}
