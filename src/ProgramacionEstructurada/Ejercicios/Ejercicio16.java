package ProgramacionEstructurada.Ejercicios;

public class Ejercicio16 {
    public static void main(String[] args) {

        int n = 0;
        int resultado = 1;

        while(resultado <= 1000) {
            n = n + resultado;
            resultado++;
        }

        System.out.println("La suma de los números del 1 al 1000 es: " + n);

    }
}
