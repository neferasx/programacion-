package Teoría.clase_4;

public class Main {
    public static void main(String[] args) {
        Persona persona1, persona2;
        boolean mayorEdad;

        persona1 = new Persona(19,false);
        persona2 = new Persona(20);

        mayorEdad=persona1.esMayorDeEdad();
        if (mayorEdad) {
            System.out.println("Mayor");
        } else {
            System.out.println("Menor");
        }

        if(Math.random()<0.53) {

        }

        persona1.mostrarDatos();
        persona2.mostrarDatos();



    }
}
