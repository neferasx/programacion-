package Ejercicios.String.ej1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitamos por teclado
        System.out.println("Introduzca una cadena de caracteres: ");
        String cadena = teclado.nextLine();

        // Mostrar la cadena en mayúsculas
        System.out.println("Mayúsculas: " + cadena.toUpperCase());

        // Mostrar la cadena en minúsculas
        System.out.println("Minúsculas: " + cadena.toLowerCase());

        // Si la cadena tiene al menos 2 caracteres, mostramos los 2 primeros y los 2 últimos
        if (cadena.length() >= 2) {
            // Mostrar los dos primeros caracteres
            System.out.println("Dos primeros caracteres: " + cadena.substring(0,2));
            // Mostrar los dos últimos caracteres
            System.out.println("Dos últimos caracteres: " + cadena.substring(cadena.length() -2));
        } else {
            System.out.println("La cadena tiene menos de dos caracteres.");
        }

        // Si la cadena no está vacía, contamos cuántas veces aparece el último carácter
        if (cadena.length() > 0) {

            // Guardamos el último carácter de la cadena
            char ultimoCaracter = cadena.charAt(cadena.length()-1);
            // Creamos un contador para contar cuántas veces aparece
            int ocurrencias = 0;

            // Recorremos toda la cadena, carácter por carácter
            for (int i = 0; i < cadena.length(); i++) {
                // Si el carácter actual es igual al último, sumamos 1 al contador
                if (cadena.charAt(i) == ultimoCaracter) {
                    ocurrencias++;
                }
            }
            // Mostramos cuántas veces aparece el último carácter
            System.out.println("Ocurrencias del último carácter ('" + ultimoCaracter + "'): " + ocurrencias);
        }

        // Si la cadena no está vacía, convertimos todas las veces que aparece el primer carácter a mayúscula
        if (cadena.length() > 0) {
            // Guardamos el primer carácter
            char primerCaracter = cadena.charAt(0);
            // Creamos una nueva cadena vacía donde iremos construyendo el resultado
            StringBuilder modificada = new StringBuilder();

            // Recorremos cada carácter de la cadena original
            for (int i = 0; i < cadena.length(); i++) {
                char actual = cadena.charAt(i);
                // Si el carácter actual es igual al primero, lo convertimos a mayúscula
                if (actual == primerCaracter) {
                    modificada.append(Character.toUpperCase(actual)); // Convertimos a mayúscula
                } else {
                    modificada.append(actual); // Dejamos el carácter como está
                }
            }
            // Mostramos la cadena con el primer carácter en mayúscula en todas sus apariciones
            System.out.println("Cadena con el primer carácter en mayúscula: " + modificada);
        }

        // Añadimos tres asteriscos al principio y al final de la cadena
        System.out.println("Cadena con *** delante y detrás: ***" + cadena + "***");

        // Invertimos la cadena, es decir, escribimos los caracteres al revés
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena invertida: " + cadenaInvertida);
        }
    }
