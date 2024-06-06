package CLASES_FIGURAS;

public class Cuadrilateros extends regulares{
    int vertices;
    double medidaLados;

    public Cuadrilateros() {
    }

    public Cuadrilateros(double area, double perimetro, int nlados, String nombre, double altura, double base, int vertices, double medidaLados) {
        super(area, perimetro, nlados, nombre, altura, base);
        this.vertices = vertices;
        this.medidaLados = medidaLados;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public double getMedidaLados() {
        return medidaLados;
    }

    public void setMedidaLados(double medidaLados) {
        this.medidaLados = medidaLados;
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Nombre:  Cuadrilateros");
        System.out.println("Base:" + base);
        System.out.println("Altura" + altura);
        System.out.println("Número de lados: "+getNlados());
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
}
