package CLASES_FIGURAS;

public class Triangulo extends regulares{
    double base;
    double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(double base, double altura) {
        return (base*altura)/2;
    }

    public void imprimir_datos(){
        System.out.println(area);
    }
}
