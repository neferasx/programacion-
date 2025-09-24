package Ejercicios;

import java.util.Scanner;

public class Ejercicio13_CorrecionProfe {
    public static void main(String[] args) {

        int numero, resultado, valor = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 9: ");
        numero = teclado.nextInt();

        while (!(numero >= 1 && numero <= 9)) {
            System.out.println("Debes introducir un número del 1 al 9: ");
            numero = teclado.nextInt();
        }

        while (valor <= 10) {
            resultado = numero * valor;
            System.out.println(numero + " * " + valor + " = " + resultado);
            valor++;
        }
    }
}
    /*
        numero  valor   resultado
        3     x    1 =      3
        3     x    2 =      6
        ....
        3     x    10 =     30
    * */


