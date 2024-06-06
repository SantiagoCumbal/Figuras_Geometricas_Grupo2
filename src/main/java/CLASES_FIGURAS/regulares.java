package CLASES_FIGURAS;

public class regulares extends DOS_D  {
double base;
double altura;

    public regulares() {
    }

    public regulares(double area, double perimetro, int nlados, String nombre, double altura, double base) {
        super(area, perimetro, nlados, nombre);
        this.altura = altura;
        this.base = base; //
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

    @Override
    public double calcularArea() {
        System.out.println("Area del "+getNombre());
        return super.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro del "+getNombre());
        return super.calcularPerimetro();
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Figura Regular \n");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Número de lados: "+getNlados());
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }
}

