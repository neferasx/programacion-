package Ejercicios;

public class Ejercicio19 {
    public static void main (String [] args) {
        // calcule la suma de los cuadrados de los 100 primeros números naturales.

        int suma = 0, contador = 1;

        while (contador <= 100) {
            suma+= (int) Math.pow(contador , 2);
            contador++;
        }

        System.out.println("La suma de los cuadrados es: " + suma);
    }
}
