package CLASES_FIGURAS.Figuras3D;

public class Tetraedro extends TRES_D {
    double lado;

    public Tetraedro() {}

    public Tetraedro(double lado) {
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
        return Math.sqrt(3) * Math.pow(lado, 2);
    }

    public double calcularVolumen() {
        return Math.pow(lado, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Tetraedro");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}