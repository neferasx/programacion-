package Teoría.clase_2;

public class Main {
    public static void main (String [] args) {
        Point punto1;
        Rectangle rectangulo1,rectangulo2;

        rectangulo1 = new Rectangle(new Point(3, 4), 6, 7);
        punto1 = new Point(5,6);
        rectangulo2 = new Rectangle(punto1, 6, 7);

    }
}
