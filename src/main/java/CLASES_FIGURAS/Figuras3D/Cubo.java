package CLASES_FIGURAS.Figuras3D;

public class Cubo extends TRES_D {
    double lado;

    public Cubo() {}

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Métodos

    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Cubo");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
