package ProgramacionEstructurada.Ejercicios;

public class Ejercicio41 {
    public static void main (String [] args) {

        int suma = 0;

        for (int i = 10; i <= 700; i++) {
            if (i%2==0) {
                suma+=i;
            }
        }

        System.out.println("La suma de los múltiplos de 2 del 10 al 700 es: " + suma);

    }
}
