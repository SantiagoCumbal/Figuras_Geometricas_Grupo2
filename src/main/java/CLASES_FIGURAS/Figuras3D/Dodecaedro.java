package CLASES_FIGURAS.Figuras3D;

public class Dodecaedro extends TRES_D {
    double medAristas;

    public Dodecaedro() {}

    public Dodecaedro(double medAristas) {
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
        double phi = (1 + Math.sqrt(5)) / 2; // Número áureo
        return 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(medAristas, 2);
    }

    public double calcularVolumen() {
        double phi = (1 + Math.sqrt(5)) / 2; // Número áureo
        return (15 + 7 * Math.sqrt(5)) / 4 * Math.pow(medAristas, 3);
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Dodecaedro");
        System.out.println("Caras: 12");
        System.out.println("Aristas: 30");
        System.out.println("Vértices: 20");
        System.out.println("Tamaño de las aristas: " + medAristas);
        System.out.println("Área: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}