package CLASES_FIGURAS.Figuras3D;

public class Octaedro extends TRES_D {
    double lado;

    public Octaedro() {}

    public Octaedro(double lado) {
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
        return 2 * Math.sqrt(3) * Math.pow(lado, 2);
    }

    public double calcularVolumen() {
        return Math.sqrt(2) * Math.pow(lado, 3) / 3;
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Octaedro");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
