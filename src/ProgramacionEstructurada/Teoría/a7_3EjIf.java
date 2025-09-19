package Teoría;

import java.util.Scanner;

public class a7_3EjIf {
    public static void main(String[] args) {
        // Crear un valor y que diga en un mensaje que si está entre 1 y 10 o si no está entre 1 y 10

        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        numero = teclado.nextInt();

        if(numero>=1 && numero<=10){
            System.out.println("Está entre 1 y 10");
        } else {
            System.out.println("No está entre 1 y 10");
        }
    }


}
