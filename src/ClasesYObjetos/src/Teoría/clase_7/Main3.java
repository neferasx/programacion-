package Teoría.clase_7;

import java.util.Scanner;

public class Main3 {
    static void main() {
        String nombre1, nombre2, numero1;
        int contador;
        char digito;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        contador = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce otro número: ");
        numero1 = sc.nextLine();
        System.out.println("Número: " + contador);
        System.out.println("Número introducido: " + numero1);

        System.out.println("Introduce tu nombre: ");
        nombre1 = sc.nextLine();

        System.out.println("Nombre introducido: " + nombre1);

        numero1 = String.valueOf(contador);
        numero1 = Integer.toString(contador);

        digito = '2';
        /** if (digito >= '0' && digito<='9') {
        } **/

        if (Character.isDigit(digito)) {

        }

    }
}
