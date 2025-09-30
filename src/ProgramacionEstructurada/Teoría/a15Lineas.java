package ProgramacionEstructurada.Teoría;

public class a15Lineas {
    public static void main(String[] args) {

        int linea, numero; // Controlamos qué número imprimir en cada línea

        linea = 1; // controlamos qué línea estamos imprrimiendo (1 a 8)

        while (linea <= 8) { // repetimos 8 veces, una para cada línea
            numero = 1; // reiniciamos el contador de números, es como si pusieramos la primera bolita

            while (numero <= linea) { // hace que en la línea 1, el bucle interno se ejecute una vez, en la línea 2, el bucle interno se ejecute 2 veces, así 8 veces
                // Es como si dijera cuántas bolitas pongo, y si estoy en la caja 3, pongo hasta bolita 3
                System.out.print(numero);
                numero++;
            }

            System.out.println();
            linea++;
        }
    }
}
