package Ejercicios.ClasesString.ej1;

public class Cesar {

    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";

    public static String cifrar(String original) {
        String textoCifrado = "";
        char caracterOriginal, caracterCifrado=' ';
        int posicion, longitud;

        longitud = original.length();
        for (int i = 0; i < longitud; i++) {
            caracterOriginal = original.charAt(i);
            posicion = ABECEDARIO.indexOf(caracterOriginal);

            if (posicion != -1) {
                if (posicion < ABECEDARIO.length() - 3) {
                    caracterCifrado = ABECEDARIO.charAt(posicion + 3);
                } else {
                    if (caracterOriginal == 'x') {
                        caracterCifrado = 'a';
                    } else if (caracterOriginal == 'y') {
                        caracterCifrado = 'b';
                    } else if (caracterOriginal == 'z') {
                        caracterCifrado = 'c';
                    }
                }
            } else {
                caracterCifrado = caracterOriginal;
            }
            textoCifrado += caracterCifrado;
        }

        return textoCifrado;
    }

    public static String descifrar(String cifrado) {
        String textoDescifrado = "";
        char caracterCifrado, caracterOriginal = ' ';
        int posicion, longitud;

        longitud = cifrado.length();
        for (int i = 0; i < longitud; i++) {
            caracterCifrado = cifrado.charAt(i);
            posicion = ABECEDARIO.indexOf(caracterCifrado);

            if (posicion != -1) {
                if (posicion >= 3) {
                    caracterOriginal = ABECEDARIO.charAt(posicion - 3);
                } else {
                    if (caracterCifrado == 'a') {
                        caracterOriginal = 'x';
                    } else if (caracterCifrado == 'b') {
                        caracterOriginal = 'y';
                    } else if (caracterCifrado == 'c') {
                        caracterOriginal = 'z';
                    }
                }
            } else {
                caracterOriginal = caracterCifrado;
            }
            textoDescifrado += caracterOriginal;
        }

        return textoDescifrado;
    }

}
