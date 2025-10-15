package Teoría.clase_5;

public class Main {
    public static void main (String[] args) {
        Jugador jugador1,jugador2;
        int contadorDos, contadorTres, contadorCanastasConseguidasDos, contadorCanastasConseguidasTres;
        boolean encestaDos, encestaTres;

        jugador1 = new Jugador();
        jugador2 = new Jugador(2.07, 50, 50);

        System.out.println("J1 de 2: " + jugador1.getPorcentajeDos());
        System.out.println("J2 de 2: " + jugador2.getPorcentajeDos());
        jugador1.entrenarDos(10);
        jugador2.entrenarDos(10 );

        System.out.println("J1 de 3: " + jugador1.getPorcentajeTres());
        System.out.println("J2 de 3: " + jugador2.getPorcentajeTres());
        jugador1.entrenarTres(10);
        jugador2.entrenarTres(10);

        contadorDos = 0;
        while(jugador1.getPorcentajeDos() < 65) {
            jugador1.entrenarDos();
            contadorDos++;
        }
        System.out.println("Ha entrenado " + contadorDos + " veces para llegar al 65%");

        contadorTres = 0;
        while(jugador1.getPorcentajeTres() < 45) {
            jugador1.entrenarTres();
            contadorTres++;
        }
        System.out.println("Ha entrenado " + contadorTres + " veces para llegar al 45%");

        contadorDos = 0;
        while(jugador2.getPorcentajeDos() < 65) {
            jugador2.entrenarDos();
            contadorDos++;
        }
        System.out.println("Ha entrenado " + contadorDos + " veces para llegar al 65%");

        contadorTres = 0;
        while(jugador2.getPorcentajeTres() < 45) {
            jugador2.entrenarTres();
            contadorTres++;
        }
        System.out.println("Ha entrenado " + contadorTres + " veces para llegar al 45%");

        contadorCanastasConseguidasDos = 0;
        while(contadorCanastasConseguidasDos < 10) {
            encestaDos = jugador1.lanzarDeDos();
            if(encestaDos) {
                contadorCanastasConseguidasDos++;
            }
        }
        System.out.println("Has conseguido 10 canastas");

        contadorCanastasConseguidasDos = 0;
        while(contadorCanastasConseguidasDos < 10) {
            encestaDos = jugador2.lanzarDeDos();
            if(encestaDos) {
                contadorCanastasConseguidasDos++;
            }
        }
        System.out.println("Has conseguido 10 canastas");

        contadorCanastasConseguidasTres = 0;
        while(contadorCanastasConseguidasTres < 4) {
            encestaDos = jugador1.lanzarDeTres();
            if(encestaDos) {
                contadorCanastasConseguidasTres++;
            }
        }
        System.out.println("Has conseguido 4 canastas");

        contadorCanastasConseguidasTres = 0;
        while(contadorCanastasConseguidasTres < 4) {
            encestaDos = jugador2.lanzarDeTres();
            if(encestaDos) {
                contadorCanastasConseguidasTres++;
            }
        }
        System.out.println("Has conseguido 4 canastas");



    }
}
