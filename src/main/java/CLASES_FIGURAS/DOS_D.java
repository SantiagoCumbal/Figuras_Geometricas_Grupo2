package CLASES_FIGURAS;

public class DOS_D extends Figuras_Geometricas {
    double area, perimetro;
    public DOS_D(){}
    public DOS_D(double area, double perimetro,int nlados, String nombre) {
        super(nlados, nombre);
        this.area = area;
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double calcularArea() {
        return area * perimetro;
    }
    public double calcularPerimetro() {
        return perimetro * nlados;
    }
}
