package CLASES_FIGURAS.Figuras3D;

public class Cilindro extends TRES_D {
    double radio;
    double altura;

    public Cilindro() {}

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos

    public double calcularArea() {
        double areaLateral = 2 * Math.PI * radio * altura;
        double areaBase = Math.PI * Math.pow(radio, 2);
        return 2 * areaBase + areaLateral;
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Cilindro");
        System.out.println("Número de caras: 3");
        System.out.println("Radio: " + radio);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}