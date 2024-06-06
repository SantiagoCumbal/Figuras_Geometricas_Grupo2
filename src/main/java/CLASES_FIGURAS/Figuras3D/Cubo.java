package CLASES_FIGURAS.Figuras3D;

public class Cubo extends TRES_D {
    double medAristas;

    public Cubo() {}

    public Cubo(double medAristas) {
        this.medAristas = medAristas;
    }

    public double getMedAristas() {
        return medAristas;
    }

    public void setMedAristas(double medAristas) {
        this.medAristas = medAristas;
    }

    // Métodos

    public double calcularArea() {
        return 6 * Math.pow(medAristas, 2);
    }

    public double calcularVolumen() {
        return Math.pow(medAristas, 3);
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Cubo");
        System.out.println("Caras: 6");
        System.out.println("Aristas: 12");
        System.out.println("Vértices: 8");
        System.out.println("Tamaño de las aristas: " + medAristas);
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}