package Teoría.clase_7;

public class Main {
    public static void main (String[] args) {
        String texto, texto2, texto3, texto4;
        int longitud, posicion;
        char primero, ultimo;

        texto = new String("pikachu");
        texto = "metal";

        longitud = texto.length();
        System.out.println("Tiene " + longitud + " caracteres");

        primero = texto.charAt(0);
        ultimo = texto.charAt(texto.length()-1);
        System.out.println(primero + " y " + ultimo);

        texto2 = "heavy";
        texto3 = "metal";
        texto4 = texto2 + texto3;
        System.out.println(texto4);
        texto2 = texto2.concat(texto3);
        System.out.println(texto2);

        posicion = texto.indexOf("w");
        System.out.println(posicion);



        texto2 = texto.substring(texto.indexOf("m"));
        System.out.println(texto2);

    }
}
