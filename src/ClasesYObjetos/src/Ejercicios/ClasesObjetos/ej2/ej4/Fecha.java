package Ejercicios.ClasesObjetos.ej2.ej4;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        valida();
    }

    public boolean bisiesto() {
        return ((this.anio % 4 == 0) && (this.anio % 100 != 0)) || (this.anio % 400 == 0);
    }

    public int diasMes() {
        int numeroDias = 0;
        switch (this.mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numeroDias = 31;
            case 4: case 6: case 9: case 11:
                numeroDias = 30;
            case 2:
                if (this.bisiesto()) {
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
        } return numeroDias;
    }

    private void valida() {
        if (this.anio < 1900 || this.anio > 2050) {
            this.anio = 1900;
        }
        if (this.mes < 1 || this.mes > 12) {
            this.mes = 1;
        }
        if(this.dia < 1 || this.dia > this.diasMes()) {
            this.dia = 1;
        }
    }

    public void siguiente() {
        if (this.dia < this.diasMes()) {
            this.dia++;
        } else {
            this.dia = 1;
            if (this.mes < 12) {
                this.mes++;
            } else {
                this.mes = 1;
                if(this.anio<2050) {
                    this.anio++;
                } else {
                    this.anio=1900;
                }
            }
        }
    }

    public void anterior() {
        if (this.dia < this.diasMes()) {
            this.dia--;
        } else {
            this.dia = 1;
            if (this.mes < 12) {
                this.mes--;
            } else {
                this.mes = 1;
                if(this.anio>1900) {
                    this.anio--;
                } else {
                    this.anio=2050  ;
                }
            }
            this.dia = this.diasMes();
        }
    }

    public boolean igualQue(Fecha otraFecha) {
        return
                this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anio == otraFecha.anio;
    }

    public boolean menorQue (Fecha otraFecha) {
        if (this.anio < otraFecha.anio) {
            return true;
        } else if (this.anio == otraFecha.anio) {
            if (this.mes < otraFecha.mes) {
                return true;
            } else if (this.mes == otraFecha.mes) {
                return this.dia < otraFecha.dia;
            }
        }
        return false;
    }

    public boolean mayorQue (Fecha otraFecha) {
        boolean resultado = false;
        if(this.anio > otraFecha.anio) {
            resultado = true;
        } else {
            if (this.anio == otraFecha.anio) {
                if (this.mes > otraFecha.mes) {
                    resultado = true;
                } else {
                    if(this.mes == otraFecha.mes) {
                        if(this.dia > otraFecha.dia) {
                            resultado = true;
                        }
                    }
                }
            }
        }
        return resultado;
    }


    public void mostrarFecha() {
        System.out.println("Fecha: " + this.dia + "/" + this.mes + "/" + this.anio);
    }
}
