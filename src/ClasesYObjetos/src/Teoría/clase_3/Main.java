package Teoría.clase_3;

public class Main {
    public static void main (String[] args) {
        Pokemon pokimon1, pokimon2;
        boolean resultado;

        pokimon1 = new Pokemon (45, 5.6, 78.6, new Punto1(8,9));
        pokimon2 = new Pokemon (32, 7.8, 60.6, new Punto1(8,10));

        if (pokimon1.combatir(pokimon2)) {
            System.out.println("Gana pokimon1");
        } else {
            System.out.println("Pierde pokimon1");
        }
        pokimon1.girarDerecha();
        pokimon1.girarDerecha();
        System.out.println("Punto cardinal actual: " + pokimon1.getPuntoCardinal());

        pokimon1.metodoPruebas();

        for(int i=0; i<100; i++) {
            pokimon1.caminar();
        }
        pokimon1.avanzar(100);

        pokimon1.getUbicacion().mostrarDatos();


        pokimon1.mostrarDatos();


    }
}
