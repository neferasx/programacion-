package Teoría;

import java.util.Scanner;

public class a10_2InventoEnunciadoAND_OR {
    public static void main(String[] args) {
        // >0 y par o <0 o >10
        int valor;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dato");
        valor = teclado.nextInt();

        if ((valor > 0 && valor % 2 == 0) || (valor < 0 || valor > 10)) {
            System.out.println("Es válido");
        } else {
            System.out.println("No es válido");
        }
    }
}

