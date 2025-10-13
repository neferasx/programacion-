package ClasesYObjetos.clase_5_1.basketgrupal;

public class Jugador {
    // Atributos
    private double altura;
    private double porcentajeTirosDos;
    private double porcentajeTirosTres;

    // Constructores
    public Jugador() {
        this.altura = 1.85;
        this.porcentajeTirosDos = 40;
        this.porcentajeTirosTres = 25;
    }

    public Jugador(double altura, double porcentajeTirosDos, double porcentajeTirosTres) {
        this.altura = altura;
        this.porcentajeTirosDos = porcentajeTirosDos;
        this.porcentajeTirosTres = porcentajeTirosTres;
    }

    // Getter and Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPorcentajeTirosDos() {
        return porcentajeTirosDos;
    }

    public void setPorcentajeTirosDos(double porcentajeTirosDos) {
        this.porcentajeTirosDos = porcentajeTirosDos;
    }

    public double getPorcentajeTirosTres() {
        return porcentajeTirosTres;
    }

    public void setPorcentajeTirosTres(double porcentajeTirosTres) {
        this.porcentajeTirosTres = porcentajeTirosTres;
    }

    // Métodos

    // Tiros dobles
    public boolean lanzarDos() {
        if (Math.random() <= this.porcentajeTirosDos/100) {
            return true;
        }
        return false;
    }

    public boolean lanzarTres () {
        if (Math.random() <= this.porcentajeTirosTres/100) {
            return true;
        }
        return false;
    }

    // Entrenar con 50% probabilidad
    public void entrenarDos() {
        if(Math.random() < 0.5) {
            this.porcentajeTirosDos+=0.5;
        }
        if (this.porcentajeTirosDos > 100) {
            this.porcentajeTirosDos = 100;
        }
    }

    public void entrenarTres() {
        if(Math.random() < 0.5) {
            this.porcentajeTirosTres+=0.5;
        }
        if(this.porcentajeTirosTres > 100) {
            this.porcentajeTirosTres = 100;
        }
    }

    // Entrenar en días
    public void entrenarDos (int dias) {
        if(Math.random() < 0.5) {
            this.porcentajeTirosDos+=(0.5 * dias);
        }
        if (this.porcentajeTirosDos > 100) {
            this.porcentajeTirosDos = 100;
        }
    }

    public void entrenarTres (int dias) {
        if(Math.random() < 0.5) {
            this.porcentajeTirosTres+=(0.5 * dias);
        }
        if(this.porcentajeTirosTres > 100) {
            this.porcentajeTirosTres = 100;
        }
    }
}