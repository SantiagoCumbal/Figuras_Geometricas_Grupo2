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
}
