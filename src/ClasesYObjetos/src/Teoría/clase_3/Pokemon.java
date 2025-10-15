package Teoría.clase_3;

public class Pokemon {
    private int puntoVida;
    private double ataque;
    private double defensa;
    private Punto1 ubicacion;
    private char puntoCardinal;

    public Pokemon(int puntoVida, double ataque, double defensa, Punto1 ubicacion) {

        this.puntoVida = puntoVida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ubicacion = ubicacion;
        this.puntoCardinal = 'N';
    }

    public char girarDerecha() {
        switch (this.puntoCardinal) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY()+1);
                break;
            case 'E':
                this.ubicacion.setY(this.ubicacion.getY()+1);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY()-1);
                break;
            case 'W':
                this.ubicacion.setY(this.ubicacion.getY()-1);
                break;
        }
        return this.puntoCardinal;
    }

    public char girarIzquierda() {
        switch (this.puntoCardinal) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY()+1);
                break;
            case 'W':
                this.ubicacion.setY(this.ubicacion.getY()+1);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY()-1);
                break;
            case 'E':
                this.ubicacion.setY(this.ubicacion.getY()-1);
                break;
        }
        return this.puntoCardinal;
    }

    public Punto1 getUbicacion() {
        return ubicacion;
    }

    public char getPuntoCardinal() {
        return puntoCardinal;
    }

    public void caminar() {

    }

    public boolean combatir(Pokemon rival) {
        rival.puntoVida -= (this.ataque - rival.defensa);
        if (rival.puntoVida <= 0) {
            return true;
        } else {
            this.puntoVida -= (rival.ataque - this.defensa);
            if (this.puntoVida <= 0) {
                return false;
            } else {
                if(this.puntoVida- rival.puntoVida>=0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }


    public void mostrarDatos() {
        System.out.println("Puntos vida: " + this.puntoVida);
        System.out.println("Atauqe: " + this.ataque);
        System.out.println("Defensa: " + this.defensa);
        System.out.println("Orientación: " + this.puntoCardinal);
        System.out.println("Ubicación");
        this.ubicacion.mostrarDatos();
        System.out.println("Orientación:" + this.puntoCardinal);
    }

    public void avanzar (int cantidadAvanzar) {
        switch (this.puntoCardinal) {
            case 'N':
                this.ubicacion.setY(this.ubicacion.getY()+cantidadAvanzar);
                break;
            case 'W':
                this.ubicacion.setY(this.ubicacion.getY()+cantidadAvanzar);
                break;
            case 'S':
                this.ubicacion.setY(this.ubicacion.getY()-cantidadAvanzar);
                break;
            case 'E':
                this.ubicacion.setY(this.ubicacion.getY()-cantidadAvanzar);
                break;
        }
    }
    public void metodoPruebas() {
        int numero=200000000;

        while (numero>=0) {
            metodoPruebas();
            numero--;
        }
    }
}

