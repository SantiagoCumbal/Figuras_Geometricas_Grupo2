package CLASES_FIGURAS.Figuras3D;

public class Esfera extends TRES_D{
    double radio;

    public Esfera() {}
    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double calcularVolumen() {
        return (4*Math.PI*radio*radio*radio)/3;
    }
    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Esfera");
        System.out.println("Número de caras: 1");
        System.out.println("Radio: "+ radio);
        System.out.println("Volumen: "+ calcularVolumen());
    }
}
