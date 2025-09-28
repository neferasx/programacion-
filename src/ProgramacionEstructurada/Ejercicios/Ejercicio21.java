package Ejercicios;

public class Ejercicio21 {
    public static void main (String [] args){

        int contadorImpares, numeroImpar, suma;
        final int CANTIDADIMPARES = 10;

        suma = 0;
        numeroImpar = 1;
        contadorImpares = 0;

        while(contadorImpares < CANTIDADIMPARES) {
            suma += numeroImpar;
            contadorImpares++;
            numeroImpar +=2;
        }

        System.out.println("La suma es: " + suma);
    }
}


