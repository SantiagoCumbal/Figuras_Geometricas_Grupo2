package CLASES_FIGURAS;

public class Triangulo extends regulares{
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // se calculara el area del triangulo

    public double area(double base, double altura) {
        return (base*altura)/2;
    }

    // Se calcula el perimetro del triangulo
    public double perimetro( double lado1, double lado2, double lado3){
        return (lado1+lado2+lado3);
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Nombre:  Triangulo");
        System.out.println("Base:" + base);
        System.out.println("Altura" + altura);
        System.out.println("Area: " + area(base, altura));
        System.out.println("Perimetro: " + perimetro(lado1,lado2,lado3));
    }
}
