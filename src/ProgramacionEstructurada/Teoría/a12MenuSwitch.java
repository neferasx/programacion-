package Teoría;

import java.util.Scanner;

public class a12MenuSwitch {
    public static void main (String[]args)  {

        /*
         Pedir un número
         1. Número al cuadrado
         2. Raíz cuadrada
         3. Valor absoluto
         4. Es múltiplo de 3
         5. Salir
         Si es otro número distinto no válido
        */

        int numero, resultado, opcion;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce valor: ");
        numero = teclado.nextInt();

        System.out.println
                ("1. Número al cuadrado\n"
                + "2. Raíz cuadrada\n"
                + "3. Valor absoluto\n"
                + "4. Es múltiplo de 3\n"
                + "5. Salir");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1: resultado = (int)Math.pow(numero,2);
                System.out.println("Cuadrado: " + resultado);
                break;
            case 2: resultado =(int)Math.sqrt(numero);
                System.out.println("Raíz cuadrada: " + resultado);
                break;
            case 3: resultado = Math.abs(numero);
                System.out.println("Valor absoluto: " + resultado);
                break;
            case 4:
                if (numero % 3 == 0) {
                System.out.println("Múltiplo de 3");
            } else {
                System.out.println("No es múltiplo de 3");
            }
                break;
            case 5:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción NO válida");
                break;
        }
    }
}
