package Ejercicios.ClasesObjetos.ej2.ej4;

public class Main {
    public static void main (String [] args) {
        Fecha fecha1, fecha2;
        boolean resultado;

        fecha1 = new Fecha(2,2,2060);
        fecha2 = new Fecha(27,2,2005);

        fecha1.mostrarFecha();
        fecha2.mostrarFecha();
        if (fecha1.mayorQue(fecha2)) {

        }

    }
}
