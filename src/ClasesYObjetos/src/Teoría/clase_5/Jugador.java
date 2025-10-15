package Teoría.clase_5;

public class Jugador {

    private double altura;
    private double porcentajeDos;
    private double porcentajeTres;

    public Jugador () {
        this.altura = 1.85;
        this.porcentajeDos = 40;
        this.porcentajeTres = 25;
    }

    public Jugador(double altura, double porcentajeDos, double porcentajeTres) {
        this.altura = altura;
        this.porcentajeDos = porcentajeDos;
        this.controlarPorcentajeDosMaximo();
        this.porcentajeTres = porcentajeTres;
        this.controlarPorcentajeTresMaximo();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPorcentajeDos() {
        return porcentajeDos;
    }

    public void setPorcentajeDos(double porcentajeDos) {
        this.porcentajeDos = porcentajeDos;
        this.controlarPorcentajeDosMaximo();

    }

    public double getPorcentajeTres() {
        return porcentajeTres;
    }

    public void setPorcentajeTres(double porcentajeTres) {
        this.porcentajeTres = porcentajeTres;
        this.controlarPorcentajeTresMaximo();
    }

    private void controlarPorcentajeDosMaximo() {
        if (this.porcentajeDos > 100) {
            this.porcentajeDos = 100;
        }
    }

    private void controlarPorcentajeTresMaximo() {
        if (this.porcentajeTres > 100) {
            this.porcentajeTres = 100;
        }
    }

    public boolean lanzarDeDos() {
        if(Math.random() < this.porcentajeDos/100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lanzarDeTres() {
        if(Math.random() < this.porcentajeTres/100) {
            return true;
        } else {
            return false;
        }
    }

    public void entrenarDos() {
        if (Math.random() < 0.5) {
            this.porcentajeDos+=0.5;
            this.controlarPorcentajeDosMaximo();
        }
    }

    public void entrenarTres() {
        if (Math.random() < 0.5) {
            this.porcentajeTres+=0.5;
            this.controlarPorcentajeTresMaximo();
        }
    }

    public void entrenarDos (int dias) {
        for(int i=0; i<dias;i++) {
            this.entrenarDos();
        }
    }

    public void entrenarTres (int dias) {
        for(int i=0; i<dias;i++) {
            this.entrenarTres();
        }
    }

}
