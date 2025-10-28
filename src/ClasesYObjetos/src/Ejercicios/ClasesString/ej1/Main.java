package Ejercicios.ClasesString.ej1;

public class Main {
    public static void main(String[] args) {
        String texto = "a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
        String textoCifrado = Cesar.cifrar(texto);
        String textoDescifrado = Cesar.descifrar(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto cifrado: " + textoCifrado);
        System.out.println("Texto descifrado: " + textoDescifrado);

    	}

}
