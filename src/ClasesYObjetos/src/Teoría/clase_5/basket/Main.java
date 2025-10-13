package ClasesYObjetos.clase_5.basket;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1, jugador2;
        int canastasDos1 = 0;
        int canastasTres1 = 0;

        int canastasDos2 = 0;
        int canastasTres2 = 0;

        jugador1 = new Jugador();
        jugador2 = new Jugador(1.90, 45, 30);

        for (int i = 0; i < 10; i++) {
            jugador1.entrenarDos();
            jugador1.entrenarTres();
        }

        for (int i = 0; i < 10; i++) {
            jugador2.entrenarDos();
            jugador2.entrenarTres();
        }

        while (jugador1.getPorcentajeDeTirosDeDos() < 65 || jugador1.getPorcentajeDeTirosDeTres() < 45) {
            if (jugador1.getPorcentajeDeTirosDeDos() < 65) {
                jugador1.entrenarDos();
            }
            if (jugador1.getPorcentajeDeTirosDeTres() < 45) {
                jugador1.entrenarTres();
            }
        }

        while (jugador2.getPorcentajeDeTirosDeDos() < 65 || jugador2.getPorcentajeDeTirosDeTres() < 45) {
            if (jugador2.getPorcentajeDeTirosDeDos() < 65) {
                jugador2.entrenarDos();
            }
            if (jugador2.getPorcentajeDeTirosDeTres() < 45) {
                jugador2.entrenarTres();
            }
        }

        while (canastasDos1 < 10 || canastasTres1 < 4) {
            if (canastasDos1 < 10 && jugador1.lanzarDeDos()) {
                canastasDos1++;
            }
            if (canastasTres1 < 4 && jugador1.lanzarDeTres()) {
                canastasTres1++;
            }
        }
        System.out.println("El jugador 1 ha conseguido todas las canastas deseadas");

        while (canastasDos2 < 10 || canastasTres2 < 4) {
            if (canastasDos2 < 10 && jugador2.lanzarDeDos()) {
                canastasDos2++;
            }
            if (canastasTres2 < 4 && jugador2.lanzarDeTres()) {
                canastasTres2++;
            }
        }
        System.out.println("El jugador 2 ha conseguido todas las canastas deseadas");
    }
}