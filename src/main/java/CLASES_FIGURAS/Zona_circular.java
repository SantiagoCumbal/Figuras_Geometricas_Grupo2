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

    // Método para calcular el área de la zona circular
    public double calcularArea() {
        return (Math.PI * Math.pow(radio, 2) * grados) / 360;
    }
    
    @Override
     public void mostrar_datos() {
        System.out.println("Esta figura es: 2D");
        System.out.println("Nombre: Zona circular");
        System.out.println("Radio: " + radio);
        System.out.println("Grados: " + grados);
        System.out.println("Área: " + calcularArea());
    }

}
