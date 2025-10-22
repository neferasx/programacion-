package Ejercicios.ClasesObjetos.ej2.ej3;

public class Main {
    public static void main (String [] args) {
        NIF nif1;

        for (int i = 0; i <= 22; i++) {
            nif1 = new NIF(i);
            nif1.mostrarDatos();
        }
    }
}
