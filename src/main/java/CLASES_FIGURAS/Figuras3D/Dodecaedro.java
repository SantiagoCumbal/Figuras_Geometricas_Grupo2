package CLASES_FIGURAS.Figuras3D;

public class Dodecaedro extends TRES_D {
    double lado;

    public Dodecaedro() {}

    public Dodecaedro(double lado) {
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
        return  3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(lado, 2);
    }

    public double calcularVolumen() {
        return (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(lado, 3);
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Dodecaedro");
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}
