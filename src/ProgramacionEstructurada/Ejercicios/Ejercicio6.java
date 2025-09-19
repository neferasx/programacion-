package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Realizar un programa Java que permita calcular el precio de un billete de ida y vuelta en avión,
        //conociendo la distancia a recorrer, el número de días de estancia

        double precio, distancia, dias, pagoT;
        final double precio_km = 8.5;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de distancia a recorrer: ");
        distancia = teclado.nextDouble();

        System.out.println("Introduce la cantidad de días de estancia: ");
        dias = teclado.nextDouble();

        // y sabiendo que si la distancia es superior
        // a 1000km y el número de días de estancia es superior a 7, la línea aérea le hace un descuento del 30%. El
        // precio por kilómetro recorrido es de 8.5 pts.

        precio = distancia * precio_km * 2;

        if(distancia > 1000 && dias > 7) {
            pagoT = precio - (precio * 0.3);
            System.out.println("La línea aérea te hace un descuento del 30%, por lo que pagarás: " + pagoT);
        } else {
            pagoT = precio;
            System.out.println("No hay descuento. El precio total a pagar es: " + pagoT);
        }

    }
}
