package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Introducir por teclado los catetos de un triangulo y visualizar el valor hipotenusa

        double aCateto, bCateto, hipotenusa;

        Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el primer cateto: ");
		aCateto = teclado.nextDouble();
		
		System.out.println("Introduce el segundo cateto: ");
		bCateto = teclado.nextDouble(); 

        // H^2 = a^2 + b^2  --> Math.sqrt es la raíz cuadrada.
		hipotenusa = Math.sqrt(Math.pow(aCateto, 2) + Math.pow(bCateto, 2));
		
		System.out.println("La hipotenusa es: " + hipotenusa);
		
		teclado.close();
		
		
	}

}
