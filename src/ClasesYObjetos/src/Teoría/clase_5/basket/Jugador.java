package ClasesYObjetos.clase_5.basket;

public class Jugador {
    private double altura;
    private double porcentajeDeTirosDeDos;
    private double porcentajeDeTirosDeTres;

    public Jugador() {
        altura = 1.85;
        porcentajeDeTirosDeDos = 40;
        porcentajeDeTirosDeTres = 25;
    }

    public Jugador(double altura, double porcentajeDeTirosDeDos, double porcentajeDeTirosDeTres) {
        this.altura = altura;
        this.porcentajeDeTirosDeDos = porcentajeDeTirosDeDos;
        this.porcentajeDeTirosDeTres = porcentajeDeTirosDeTres;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPorcentajeDeTirosDeDos() {
        return porcentajeDeTirosDeDos;
    }

    public void setPorcentajeDeTirosDeDos(double porcentajeDeTirosDeDos) {
        this.porcentajeDeTirosDeDos = porcentajeDeTirosDeDos;
    }

    public double getPorcentajeDeTirosDeTres() {
        return porcentajeDeTirosDeTres;
    }

    public void setPorcentajeDeTirosDeTres(double porcentajeDeTirosDeTres) {
        this.porcentajeDeTirosDeTres = porcentajeDeTirosDeTres;
    }

    public boolean lanzarDeTres() {
        return (this.porcentajeDeTirosDeTres / 100) > Math.random();
    }

    public boolean lanzarDeDos() {
        return (this.porcentajeDeTirosDeDos / 100) > Math.random();
    }

    public void entrenarDos() {
        double probabilidad = Math.random();
        if (probabilidad < 0.5) {
            this.porcentajeDeTirosDeDos += 0.5;
        }
        if (this.porcentajeDeTirosDeDos > 100) {
            this.porcentajeDeTirosDeDos = 100;
        }
    }

    public void entrenarTres() {
        double probabilidad = Math.random();
        if (probabilidad < 0.5) {
            this.porcentajeDeTirosDeTres += 0.5;
        }
        if (this.porcentajeDeTirosDeTres > 100) {
            this.porcentajeDeTirosDeTres = 100;
        }
    }

    public void entrenarDos(int dias) {
        for (int i = 0; i < dias; i++) {
            if (Math.random() < 0.5) {
                this.porcentajeDeTirosDeDos += 0.5;
                if (this.porcentajeDeTirosDeDos > 100) {
                    this.porcentajeDeTirosDeDos = 100;
                    return;
                }
            }
        }
    }

    public void entrenarTres(int dias) {
        for (int i = 0; i < dias; i++) {
            if (Math.random() < 0.5) {
                this.porcentajeDeTirosDeTres += 0.5;
                if (this.porcentajeDeTirosDeTres > 100) {
                    this.porcentajeDeTirosDeTres = 100;
                    return;
                }
            }
        }
    }
}
