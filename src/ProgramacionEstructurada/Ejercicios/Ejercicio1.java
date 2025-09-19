package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Dos variables.
		double pulgada, centimetros;

        // Introducir por teclado una cantidad en pulgadas y se visualiza por pantalla su equivalente
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número en pulgadas (equivale a 1) para posteriormente dartelo en centimetros: ");
		pulgada=teclado.nextDouble();

        // Nota: 1 pulgada = 2,54 cms
		centimetros = pulgada * 2.54;
		System.out.println("El resultado es: " + centimetros + " cms");
		
		teclado.close();

	}

}
