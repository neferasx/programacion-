package Teoría;

import java.util.Scanner;

public class a3LeerEnTeclado {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int numero1,numero2,resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce número 1: ");
        numero1=teclado.nextInt();
        System.out.println("Introduce número 2: ");
        numero2=teclado.nextInt();

        resultado = numero1+numero2;
        System.out.println("La suma es: " + resultado);

    }
}
