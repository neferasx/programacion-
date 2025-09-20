package ProgramacionEstructurada.Teoría;

import java.util.Scanner;

public class a10_1InventoEnunciadoAND_ORWilliam {
    public static void main(String[] args) {
        /*
            Objetivo: subir de liga en Valorant
            Necesitas: horas de juego && horas de practica

            Si tus horas de practica antes de meterte a manquear en rankeds es igual o superior de 1h, y tus horas de juego diarias son >5
            Sistema lanza mensaje: "Subiras a radiant compañero"

            Si está entre 0.5h y 0.99, y tus horas de juego entre 3 y 4.9h
            Sistema imprime: "Tus posibilidades de subir de liga son del 50%"

            Si dedicas menos de 0.5h y tus horas de juego son 2h a 2.9h ósea 2-3 partidas max
            Sistema imprime: "Tus posibilidades de subir de liga no llegan al 30%"

            Si tus horas de practica antes de meterte a manquear en rankeds son igual a 0
            Sistema imprime: "Da igual cuantas horas juegues, desinstala el juego"
        * */

        double hJuego, hPractica;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántas horas prácticas en Valorant? ");
        hPractica = teclado.nextDouble();

        System.out.println("¿Cuántas horas juegas en Valorant? ");
        hJuego = teclado.nextInt();

        if (hPractica >= 1 && hJuego > 5) {
            System.out.println("Subirás de ranked compañero ");
        } else if (hPractica >= 0.5 && hPractica < 1 && hJuego >= 3 && hJuego <= 4.9) {
            System.out.println("Tus posibilidades de subir de liga son del 50%");
        } else if (hPractica < 0.5 && hJuego >= 2 && hJuego <= 2.9) {
            System.out.println("Tus posibilidades de subir de liga no llegan al 30%");
        } else if (hPractica == 0) {
            System.out.println("Da igual cuantas horas juegues, desinstala el juego");
        }
        teclado.close();
    }
}
