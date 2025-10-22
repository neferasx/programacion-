package Ejercicios.ClasesObjetos.ej2;

public class Cuenta {
    private int id;
    private double cantidad;

    public Cuenta (int id, double cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void mostrarDatos() {
        System.out.println("ID de la cuenta: " + this.id);
        System.out.println("Cantidad: " + this.cantidad);
    }

    public void ingresar (double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        } else {
            System.out.println("No se puede ingresar cantidad negativa");
        }
    }

    public void retirar (double cantidad) {
        if (cantidad > 0) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No se puede retirar cantidad negativa");
        }
    }
}
