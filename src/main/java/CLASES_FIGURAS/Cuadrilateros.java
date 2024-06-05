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
}
