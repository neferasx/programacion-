package Teoría.clase_1;

public class Main {
    public static void main(String[] args) {
        // Declaración de dos objetos de tipo Bicycle
        Bicycle bicicleta1, bicicleta2;

        // Variables para almacenar las propiedades de la bicicleta1
        int velocidadBici1;
        int cadenceBici1;
        int marchasBici1;

        // Creación de un objeto Bicycle con parámetros iniciales (velocidad, cadence, marchas)
        bicicleta1 = new Bicycle(4 , 5 , 5);

        // Se establece la velocidad de bicicleta1 a 8
        bicicleta1.setSpeed(8);
        // Se obtiene la velocidad actual de bicicleta1 y se guarda en velocidadBici1
        velocidadBici1 = bicicleta1.getSpeed();
        // Se imprime la velocidad de bicicleta1 en consola
        System.out.println(velocidadBici1);

        // Se establece la cadencia (ritmo de pedaleo) de bicicleta1 a 5
        bicicleta1.setCadence(5);
        // Se obtiene la cadencia actual de bicicleta1 y se guarda en cadenceBici1
        cadenceBici1 = bicicleta1.getCadence();
        // Se imprime la cadencia de bicicleta1 en consola
        System.out.println(cadenceBici1);

        // Se establece la marcha (gear) de bicicleta1 a 6
        bicicleta1.setGear(6);
        // Se obtiene la marcha actual de bicicleta1 y se guarda en marchasBici1
        marchasBici1 = bicicleta1.getGear();
        // Se imprime la marcha de bicicleta1 en consola
        System.out.println(marchasBici1);

    }
}
