package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double tasaChelinesAustriacos = 956.871 / 100;
        double tasaDolar = 122.499;
        double tasaDracmasGriegas = 88.607 / 100;
        double tasaLirasItalianas =  9.289 / 100;

        double chelinesAustriacos, dolar, dracmasGriegas, lirasItalianas, pesetas;

        Scanner teclado = new Scanner(System.in);

		// a.- Se introduce por teclado una cantidad en Chelines Austriacos y se visualiza su equivalente en Pesetas.
		System.out.println("Introduce una cantidad en Chelines Austriacos: ");
		chelinesAustriacos = teclado.nextDouble();
		double pesetasChelinesA = chelinesAustriacos * tasaChelinesAustriacos;
		System.out.println("Su equivalencia a pesetas son: " + pesetasChelinesA);
		
		// b.- Se introduce por teclado una cantidad en Dracmas Griegas y se visualiza su equivalente en Francos Franceses
		System.out.println("Introduce una cantidad en Dracmas Griegas: ");
		dracmasGriegas = teclado.nextDouble();
		double pesetasDracmasG = dracmasGriegas * tasaDracmasGriegas; 
		System.out.println("Su equivalencia a pesetas son: " + pesetasDracmasG);
		
		// c.- Se introduce por teclado una cantidad en Pesetas y se visualiza su equivalente en Dólares y Liras Italianas.
		System.out.println("Introduce una cantidad en pesetas: ");
		pesetas = teclado.nextDouble();
		dolar = pesetas / tasaDolar; 
		lirasItalianas = pesetas / tasaLirasItalianas; 
		System.out.println("Su equivalencia en dólares son: " + dolar);
		System.out.println("Su equivalencia en Liras Italianas son: " + lirasItalianas);
		
		teclado.close();

	}

}
