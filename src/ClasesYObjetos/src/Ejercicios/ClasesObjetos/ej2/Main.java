package Ejercicios.ClasesObjetos.ej2;

public class Main {
    public static void main (String [] args) {
        Cuenta cuenta1;

        cuenta1 = new Cuenta(25, 5200);

        cuenta1.mostrarDatos();
        cuenta1.ingresar(250);
        cuenta1.retirar(6850);

        System.out.println(cuenta1.getCantidad());

    }
}
