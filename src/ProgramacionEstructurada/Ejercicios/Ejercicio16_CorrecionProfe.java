package Ejercicios;

public class Ejercicio16_CorrecionProfe {
    public static void main (String[] args) {

        final int VALORFINAL = 1000;

        int numero = 1, suma = 0;

        while(numero <= VALORFINAL) {
            suma = suma + numero;
            numero++;
        }
        System.out.println("La suma es: " + suma);
    }
}


