package Teoría.clase_4;

public class Persona {
    private int edad;
    private boolean acompañada;

    public Persona(int edad, boolean acompañada) {
        this.edad = edad;
        this.acompañada = acompañada;
    }

    public Persona(int edad) {
        this.edad = edad;
        this.acompañada=true;
    }

    public boolean esMayorDeEdad() {
        if (this.edad >=18) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarDatos() {
        System.out.println("Edad" + this.edad);
        System.out.println("Acompañada:" + this.acompañada);
    }

}
