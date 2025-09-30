package Teoría;

import java.util.Scanner;

public class a16DoWhileEjemplo {

    public static void main (String[] args) {
        int numeroLeido, media, suma, contador;
        final int CANTIDAD = 50;

        Scanner teclado = new Scanner(System.in);

        suma = 0;
        contador = 0;

        do {
            System.out.println("Numero");
            numeroLeido = teclado.nextInt();
            suma+=numeroLeido;
            contador++;
        } while (contador < CANTIDAD);

        media = suma / CANTIDAD;
        System.out.println("Media: " + media);
    }
}
