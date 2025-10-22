package Teoría.clase_7;

public class Main2 {
    public static void main (String [] args) {
        String texto, texto2, mayusculas, minusculas, asterisco, alReves;
        int longitud, posicion, contador;
        char primero = 0, primeroMayusculas;
        String ultimo;
        char letra;

        texto = new String("Technical difficulties - Paul Gilbert");
        System.out.println("Cadena original: " + texto);

        mayusculas = texto.toUpperCase();
        System.out.println("Mayusculas: " + mayusculas);

        minusculas = texto.toLowerCase();
        System.out.println("Minusculas: " + minusculas);

        longitud = texto.length();
        if (longitud >= 2) {
            System.out.println("Dos primeros: " + texto.substring(0 , 2));
            System.out.println("Dos últimos: " + texto.substring(longitud -2));
        }

        if (longitud > 0) {
            contador = 0;
            ultimo = texto.substring(longitud - 1);

            for (int i = 0; i < longitud; i++) {
                if (texto.charAt(i) == ultimo.charAt(0)) {
                    contador++;
                }
            }
            System.out.println("Ocurrencias: " + contador);

            primeroMayusculas = Character.toUpperCase(primero);
            primero = texto.charAt(0);
            for (int i=0; i < longitud; i++) {
                if (primero == texto.charAt(i)) {
                    System.out.println(primeroMayusculas);
                } else {
                    System.out.println(texto.charAt(i));
                }
            }
            System.out.println();

        }

        asterisco = "***" + texto + "***";
        System.out.println(asterisco);

        alReves = "";
        for (int j=longitud-1; j>=0; j--) {
            alReves+=texto.charAt(j);
        }
        System.out.println("Al revés: " + alReves);
    }
}
