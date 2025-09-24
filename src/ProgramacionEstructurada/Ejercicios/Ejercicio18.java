package ProgramacionEstructurada.Ejercicios;

public class Ejercicio18 {
    public static void main (String[] args) {

        int suma = 0, contador = 1, numero_par;

        while (contador <=10) {
            numero_par = contador * 2;
            suma += numero_par;
            contador++;
        }


        System.out.println("La suma de los 10 primeros números pares es: " + suma);


    }
}
