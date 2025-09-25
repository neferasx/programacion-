package Ejercicios;

public class Ejercicio18 {
    public static void main(String[] args) {
        // Que visualice la suma de los 10 primeros números pares


        /*
            int suma = 0, contador = 1, numero_par;

            while (contador <= 10) {
                numero_par = contador * 2;
                suma += numero_par;
                contador++;
            }


            System.out.println("La suma de los 10 primeros números pares es: " + suma);


    }
}
*/
        int contadorPares, numeroPar, suma;
        final int CANTIDADPARES = 10;

            suma = 0;
            numeroPar = 2;
            contadorPares = 0;

            while(contadorPares < CANTIDADPARES) {
                suma += numeroPar;
                contadorPares++;
                numeroPar+=2;
            }

        System.out.println("La suma es: " + suma);
    }
}
