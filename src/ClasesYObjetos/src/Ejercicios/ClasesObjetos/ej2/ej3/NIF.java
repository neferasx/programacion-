package Ejercicios.ClasesObjetos.ej2.ej3;

public class NIF {
    private int numero;
    private char letra;
    private final int DIVISOR_LETRAS = 23;

    public NIF() {
        this.numero = 0;
        this.letra = ' ';
    }

    public NIF (int numero) {
        this.numero = numero;
        this.asignarLetra();
    }

    private void asignarLetra() {
        switch(this.numero % this.DIVISOR_LETRAS) {
            case 0: this.letra = 'T'; break;
            case 1: this.letra = 'R'; break;
            case 2: this.letra = 'W'; break;
            case 3: this.letra = 'A'; break;
            case 4: this.letra = 'G'; break;
            case 5: this.letra = 'M'; break;
            case 6: this.letra = 'Y'; break;
            case 7: this.letra = 'F'; break;
            case 8: this.letra = 'P'; break;
            case 9: this.letra = 'D'; break;
            case 10: this.letra = 'X'; break;
            case 11: this.letra = 'B'; break;
            case 12: this.letra = 'N'; break;
            case 13: this.letra = 'J'; break;
            case 14: this.letra = 'Z'; break;
            case 15: this.letra = 'S'; break;
            case 16: this.letra = 'Q'; break;
            case 17: this.letra = 'V'; break;
            case 18: this.letra = 'H'; break;
            case 19: this.letra = 'L'; break;
            case 20: this.letra = 'C'; break;
            case 21: this.letra = 'K'; break;
            case 22: this.letra = 'E'; break;
            default: this.letra = '?'; break;
        }
    }

    public void mostrarDatos() {
        System.out.println("NIF: " + this.numero + " - " + this.letra);
    }
}
