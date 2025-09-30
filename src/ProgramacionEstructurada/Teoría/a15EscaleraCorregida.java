package ProgramacionEstructurada.Teoría;

import java.util.Scanner;

public class a15EscaleraCorregida {

    public static void main(String[] args) {

        // =============================
        // DECLARACIÓN DE VARIABLES
        // =============================

        int linea;              // Número de la línea en la que estamos actualmente.
        // Ejemplo: si estamos imprimiendo la fila 3 de la pirámide, linea = 3.

        int numero;             // El "tamaño" de la pirámide, o el número máximo en el centro.
        // Ejemplo: si numero = 4, el centro de la pirámide llega hasta el 4.

        int contadorNLinea;     // Contador que se usa para imprimir los números de cada línea.
        // Ejemplo: en la fila 3, primero imprimirá "321", luego "23".

        int espacios;           // Cantidad de espacios a imprimir antes de los números,
        // para que la pirámide quede centrada.

        // =============================
        // PEDIMOS EL NÚMERO AL USUARIO
        // =============================

        Scanner teclado = new Scanner(System.in);  // Creamos el objeto para leer por teclado
        System.out.println("Número: ");           // Pedimos al usuario que escriba un número
        numero = teclado.nextInt();               // Guardamos ese número en la variable 'numero'

        // =============================
        // PARTE SUPERIOR DE LA PIRÁMIDE
        // =============================

        linea = 1; // Empezamos desde la primera línea (la parte superior, el pico)

        // Bucle para imprimir desde la línea 1 hasta la línea "numero"
        while (linea <= numero) {

            // ---- ESPACIOS ----
            // Cada línea necesita unos espacios delante para centrar la pirámide.
            // La fórmula es: (numero - linea) espacios
            espacios = 1;
            while (espacios <= numero - linea) {
                System.out.print(" ");  // Imprimimos un espacio sin salto de línea
                espacios++;
            }

            // ---- NÚMEROS DESCENDENTES (lado izquierdo) ----
            // Desde "linea" hasta 1.
            // Ejemplo: si linea = 3 → imprime "321"
            contadorNLinea = linea;
            while (contadorNLinea >= 1) {
                System.out.print(contadorNLinea);
                contadorNLinea--;
            }

            // ---- NÚMEROS ASCENDENTES (lado derecho) ----
            // Desde 2 hasta "linea".
            // OJO: empieza en 2 porque ya imprimimos el 1 en el lado izquierdo.
            // Ejemplo: si linea = 3 → imprime "23"
            contadorNLinea = 2;
            while (contadorNLinea <= linea) {
                System.out.print(contadorNLinea);
                contadorNLinea++;
            }

            // Salto de línea al terminar la fila
            System.out.println();

            // Pasamos a la siguiente línea
            linea++;
        }

        // =============================
        // PARTE INFERIOR DE LA PIRÁMIDE
        // =============================
        // Aquí hacemos lo mismo pero al revés, desde (numero - 1) hasta 1.
        // Así conseguimos que quede simétrica.

        linea = numero - 1;

        while (linea >= 1) {

            // ---- ESPACIOS ----
            espacios = 1;
            while (espacios <= numero - linea) {
                System.out.print(" ");
                espacios++;
            }

            // ---- NÚMEROS DESCENDENTES (lado izquierdo) ----
            contadorNLinea = linea;
            while (contadorNLinea >= 1) {
                System.out.print(contadorNLinea);
                contadorNLinea--;
            }

            // ---- NÚMEROS ASCENDENTES (lado derecho) ----
            contadorNLinea = 2;
            while (contadorNLinea <= linea) {
                System.out.print(contadorNLinea);
                contadorNLinea++;
            }

            System.out.println();
            linea--; // Vamos bajando línea a línea
        }
    }
}





