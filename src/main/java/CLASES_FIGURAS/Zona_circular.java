package CLASES_FIGURAS;

public class Zona_circular extends  Circulo{
    double radio;
    double grados;

    // Constructor

    public Zona_circular() {
    }
    public Zona_circular(double radio, double grados) {
        this.radio = radio;
        this.grados = grados;
    }

    //setters, getters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getGrados() {
        return grados;
    }
    public void setGrados(double grados) {
        this.grados = grados;
    }



}
