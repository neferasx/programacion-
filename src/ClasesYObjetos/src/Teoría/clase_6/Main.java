package Teoría.clase_6;

public class Main {
    public static void main (String [] args) {
        //        Asignatura lengua = new Asignatura(1);
        //        Asignatura historia = new Asignatura(2);
        //        Asignatura matematicas = new Asignatura(3);
        //
        //        Alumno roberto = new Alumno(lengua, historia, matematicas);
        //
        //        Profesor nacho = new Profesor();
        //
        //        nacho.ponerNotas(roberto);
        //
        //        double notaMedia = nacho.calcularMedia(roberto);
        //        System.out.println("La nota media que tiene el alumno es: " + notaMedia);

        Alumno alumno1,alumno2;
        Asignatura asignatura1, asignatura2,asignatura3;
        Profesor profesor1,profesor2;
        double media1, media2;

        asignatura1 = new Asignatura(836);
        asignatura2 = new Asignatura(222);
        asignatura3 = new Asignatura(769);

        alumno1 = new Alumno(asignatura1,asignatura2,asignatura3);
        alumno2 = new Alumno(asignatura1,asignatura2,asignatura3);

        profesor1 = new Profesor();
        profesor1.ponerNotas(alumno1);
        media1 = profesor1.calcularMedia(alumno1);
        System.out.println(media1);

        profesor2 = new Profesor();
        profesor2.ponerNotas(alumno2);
        media2 = profesor2.calcularMedia(alumno2);
        System.out.println(media2);


    }
}