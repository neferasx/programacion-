package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double tasaChelinesAustriacos = 956.871 / 100;
        double tasaDolar = 122.499;
        double tasaDracmasGriegas = 88.607 / 100;
        double tasaLirasItalianas =  9.289 / 100;
		double tasaFrancosFranceses = 20.110;

        double chelinesAustriacos, dolar, dracmasGriegas, lirasItalianas, pesetas;

        Scanner teclado = new Scanner(System.in);

		// a.- Se introduce por teclado una cantidad en Chelines Austriacos y se visualiza su equivalente en Pesetas.
		System.out.print("Introduce una cantidad en Chelines Austriacos: ");
		chelinesAustriacos = teclado.nextDouble();
		double pesetasChelines = chelinesAustriacos * tasaChelinesAustriacos;
		System.out.println(chelinesAustriacos + " Chelines Austriacos = " + pesetasChelines + " Pesetas");
		
		// b.- Se introduce por teclado una cantidad en Dracmas Griegas y se visualiza su equivalente en Francos Franceses
		System.out.println("Introduce una cantidad en Dracmas Griegas: ");
		dracmasGriegas = teclado.nextDouble();
		double pesetasDracmas = dracmasGriegas * tasaDracmasGriegas;           // Dracmas → Pesetas
		double francosFranceses = pesetasDracmas / tasaFrancosFranceses;       // Pesetas → Francos Franceses
		System.out.println(dracmasGriegas + " Dracmas Griegas = " + francosFranceses + " Francos Franceses");
		
		// c.- Se introduce por teclado una cantidad en Pesetas y se visualiza su equivalente en Dólares y Liras Italianas.
		System.out.print("Introduce una cantidad en Pesetas: ");
		pesetas = teclado.nextDouble();
		dolar = pesetas / tasaDolar;
		lirasItalianas = pesetas / tasaLirasItalianas;
		System.out.println(pesetas + " Pesetas = " + dolar + " Dólares");
		System.out.println(pesetas + " Pesetas = " + lirasItalianas + " Liras Italianas");
		
		teclado.close();

	}

}
