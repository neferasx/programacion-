import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String[] args) {
        // Calcule la media de 50 numeros que se introducen por teclado

        final int cantidadN = 50;

        int numero, suma = 0, contador = 1;
        double media;

        Scanner teclado = new Scanner(System.in);

        while(contador <= cantidadN) {
            System.out.println("Dime un número");
            numero = teclado.nextInt();
            suma += numero;
            contador++;
        }

        media = (double) suma / cantidadN;

        System.out.println("La media es: " + media);


    }
}
