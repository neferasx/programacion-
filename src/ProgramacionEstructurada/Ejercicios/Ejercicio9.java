package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args)  {
        final double IVA = 0.12;

        double articuloPC = 12.000;

        int unidades;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas unidades quieres para comprar el PC? ");
        unidades = teclado.nextInt();

        double precioSinIVA = articuloPC * unidades;

        double precioConIVA = precioSinIVA + (precioSinIVA * IVA);

        if (precioConIVA > 50.000) {
            precioConIVA = precioConIVA * 0.95;
        }
        System.out.println("El precio final es: " + precioConIVA + " pts");
    }
}