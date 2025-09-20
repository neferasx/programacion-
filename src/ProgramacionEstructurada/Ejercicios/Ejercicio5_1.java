package ProgramacionEstructurada.Ejercicios;

import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {
        // Menú
        double tasaHamburguesa = 500;
        double tasaCerveza = 150;
        double tasaCocaCola = 175;
        double tasaEnsalada = 200;
        double tasaSalchichas = 275;
        double tasaRefrescos = 200;
        double tasaSopa = 260;
        double tasaPastel = 300;

        // Inicializar total de ventas
        double ventaTotal = 0;

        Scanner teclado = new Scanner(System.in);

        // Producto y tasa a comparar
        String[] productos = {"hamburguesa", "cerveza", "cocaCola", "ensalada", "salchichas", "refrescos", "sopa", "pastel"};
        double[] tasas = {tasaHamburguesa, tasaCerveza, tasaCocaCola, tasaEnsalada, tasaSalchichas, tasaRefrescos, tasaSopa, tasaPastel};

        // Iteración para preguntar las cantidades vendidas
        for (int i = 0; i < productos.length; i++) {
            System.out.println("¿Cuántos " + productos[i] + " se han vendido? ");
            int cantidad = teclado.nextInt();
            double valorProducto = cantidad * tasas[i];
            ventaTotal += valorProducto;
        }

        // Cálculo del IVA y total con IVA
        double iva = ventaTotal * 0.12;
        double ventaTotalConIVA = ventaTotal + iva;

        // Mostrar resultados
        System.out.println("La venta total sin IVA es: " + ventaTotal + " pts");
        System.out.println("La venta total con IVA es: " + ventaTotalConIVA + " pts");

        teclado.close();
    }
}
