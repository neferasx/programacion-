package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Introducir por teclado la altura y el radio de un cilindro y visualizar la superficie y volumen

        double altura, radio, areaL, areaBaseC, volumen, superficie;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la altura: ");
		altura = teclado.nextDouble();
		
		System.out.println("Introduce el radio: ");
		radio = teclado.nextDouble();

        /* Nota:
              Sl = 2 * PI * r * H
              Sb = PI * r^2
              St = Sl + (2*Sb)
              V = PI * r^2 * H
        */
		areaL = 2 * Math.PI * radio * altura;
		areaBaseC = Math.PI * Math.pow(radio, 2); 
		volumen = Math.PI * Math.pow(radio, 2) * altura; 
		superficie = areaL + (2* areaBaseC);
		
		System.out.println("La superficie es: " + superficie);
		System.out.println("El volumen es: " + volumen);
		
		teclado.close();
		
	}

}
