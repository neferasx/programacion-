package Ejercicios.String.ej3;

public class Texto {
    private String texto;
    private static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";

    public Texto(String texto) {
        this.texto = texto;
    }

    public boolean esPalindromo() {
        // Convertir a minúsculas
        String minusculas;
        minusculas = convertirAMinusculas();

        // Limpiar
        String textoLimpio, alReves;
        textoLimpio = limpiarTexto(minusculas);
        alReves = generarAlReves(textoLimpio);

        if(textoLimpio.equals(alReves)) {
            return true;
        } else {
            return false;
        }

        // Al Revés

        // Comparar y devolver boolean
    }

    private String limpiarTexto(String minusculas) {
        String soloLetras="";
        for(int i = 0; i < minusculas.length(); i++) {
            if(esLetra(minusculas.charAt(i))) {
                soloLetras+=minusculas.charAt(i);
            }
        }
        return soloLetras;
    }

    private boolean esLetra(char caracter) {
        int posicion;
        posicion = ABECEDARIO.indexOf(caracter);
        if (posicion!= -1) {
            return true;
        }
        return false;
    }

    private String generarAlReves(String textoLimpio) {
        String alReves ="";
        for (int i = textoLimpio.length(); i >= 0; i++) {
            if(esLetra(textoLimpio.charAt(i))) {
                alReves+=textoLimpio.charAt(i);
            }
        }
        return alReves;
    }

    private String convertirAMinusculas() {
        return this.texto.toLowerCase();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
