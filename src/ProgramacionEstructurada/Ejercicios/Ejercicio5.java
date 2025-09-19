package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Menú
        double tasaHamburguesa = 500;
        double tasaCerveza = 150;
        double tasaCocaCola = 175;
        double tasaEnsalada = 200;
        double tasaSalchichas = 275;
        double tasaRefrescos = 200;
        double tasaSopa = 260;
        double tasaPastel = 300;

        double hamburguesa, cerveza, cocaCola, ensalada, salchichas, refrescos, sopa, pastel;

        // Calcular ventas totales al final día, así como los impuestos a pagar (12% de las ventas)
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuántas hamburguesas se han vendido? ");
		hamburguesa = teclado.nextInt();
		double valorH = hamburguesa * tasaHamburguesa; 
		
		System.out.println("¿Cuántas cervezas se han vendido? ");
		cerveza = teclado.nextInt();
		double valorC = cerveza * tasaCerveza;
		
		System.out.println("¿Cuántas coca colas se han vendido? ");
		cocaCola = teclado.nextInt();
		double valorCC = cocaCola * tasaCocaCola;
		
		System.out.println("¿Cuántas ensaladas se han vendido? ");
		ensalada = teclado.nextInt();
		double valorE = ensalada * tasaEnsalada; 
		
		System.out.println("¿Cuántas salchichas se han vendido? ");
		salchichas = teclado.nextInt();
		double valorSA = salchichas * tasaSalchichas; 
		
		System.out.println("¿Cuántos refrescos se han vendido? ");
		refrescos = teclado.nextInt();
		double valorR = refrescos * tasaRefrescos; 
		
		System.out.println("¿Cuántas sopas se han vendido? ");
		sopa = teclado.nextInt();
		double valorSO = sopa * tasaSopa; 
		
		System.out.println("¿Cuántos pasteles se han vendido? ");
		pastel = teclado.nextInt(); 
		double valorP = pastel * tasaPastel; 
		
		double ventaTotal = (valorH + valorC + valorCC + valorE + valorSA + valorR + valorSO + valorP);
		double iva = ventaTotal * 0.12;
		double ventaTotalConIVA = ventaTotal +  iva;
		System.out.println("La venta total sin iva es: " + ventaTotal + " pts");
		System.out.println("La venta tota con iva es: " + ventaTotalConIVA + " pts");

	}

}
