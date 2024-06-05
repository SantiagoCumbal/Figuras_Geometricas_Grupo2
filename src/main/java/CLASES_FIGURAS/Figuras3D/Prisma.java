package CLASES_FIGURAS.Figuras3D;

public class Prisma extends TRES_D {
    int numeroDeCaras;
    double areaBase;
    double altura;

    public Prisma() {}

    public Prisma(int numeroDeCaras, double areaBase, double altura) {
        this.numeroDeCaras = numeroDeCaras;
        this.areaBase = areaBase;
        this.altura = altura;
    }

    public int getNumeroDeCaras() {
        return numeroDeCaras;
    }

    public void setNumeroDeCaras(int numeroDeCaras) {
        this.numeroDeCaras = numeroDeCaras;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos

    public double calcularArea() {
        return 2 * areaBase + numeroDeCaras * altura;
    }

    public double calcularVolumen() {
        return areaBase * altura;
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Prisma");
        System.out.println("Número de caras: " + numeroDeCaras);
        System.out.println("Area Base: " + areaBase);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Volumen: " + calcularVolumen());
    }
}