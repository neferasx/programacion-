package ClasesYObjetos.clase_5_1.basketgrupal;

public class Main {
    public static void main (String [] args) {
        // Crear dos jugadores, cada uno con un constructor distinto

        Jugador jugador1, jugador2;

        jugador1 = new Jugador();
        jugador2 = new Jugador(1.90, 65, 35);

        // Los jugadores entrenarán 10 días

        jugador1.entrenarDos(10);
        jugador1.entrenarTres(10);

        jugador2.entrenarDos(10);
        jugador2.entrenarTres(10);

        // Los jugadores entrenarán hasta que alcancen un mín 65% tiros dos y un mín 45% tiros tres
        while (jugador1.getPorcentajeTirosDos() < 65 && jugador1.getPorcentajeTirosTres() < 45) {
            jugador1.entrenarDos();
            jugador1.entrenarTres();
        }

        while (jugador2.getPorcentajeTirosDos() < 65 && jugador2.getPorcentajeTirosTres() < 45) {
            jugador2.entrenarDos();
            jugador2.entrenarTres();
        }

        // Lanzar hasta que logren 10 canastas de dos y 4 de tres
        int canastasDoblesJugador1 = 0, canastasTriplesJugador1 = 0;
        int canastasDoblesJugador2 = 0, canastasTriplesJugador2 = 0;

        while(canastasDoblesJugador1 < 10) {
            if (jugador1.lanzarDos()) {
                canastasDoblesJugador1++;
            }
        }

        while(canastasTriplesJugador1 < 4) {
            if (jugador1.lanzarTres()) {
                canastasTriplesJugador1++;
            }
        }

        while(canastasDoblesJugador2 < 10) {
            if (jugador2.lanzarDos()) {
                canastasDoblesJugador2++;
            }
        }

        while(canastasTriplesJugador2 < 4) {
            if (jugador2.lanzarTres()) {
                canastasTriplesJugador2++;
            }
        }


        // Resultados
        System.out.println("Resultados finales");
        System.out.println("El jugador ha conseguido 1 ha conseguido: " + canastasDoblesJugador1+ " canastas dobles y " + canastasTriplesJugador1 + " canastas triples.");
        System.out.println("El jugador ha conseguido 2 ha conseguido: " + canastasDoblesJugador2+ " canastas dobles y " + canastasTriplesJugador2 + " canastas triples.");

    }
}
