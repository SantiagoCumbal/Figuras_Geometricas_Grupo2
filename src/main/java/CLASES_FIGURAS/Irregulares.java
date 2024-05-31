package CLASES_FIGURAS;

public class Irregulares extends DOS_D{
    String tipo_angulos;

    public Irregulares() {}
    public Irregulares(String tipo_angulos, double area, double perimetro, int nlados, String nombre) {
        super(area, perimetro, nlados, nombre);
        this.tipo_angulos = tipo_angulos;
    }

    public void setTipo_angulos(String tipo_angulos) {
        this.tipo_angulos = tipo_angulos;
    }

    public String getTipo_angulos() {
        return tipo_angulos;
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
}
