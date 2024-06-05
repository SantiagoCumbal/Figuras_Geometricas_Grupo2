package CLASES_FIGURAS.Figuras3D;

public class Cono extends TRES_D {
    double radio;
    double altura;
    public Cono() {}
    public Cono(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    //Metodos

    public double calcularHipotenusa() {
        double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        return generatriz;
    }

    public double calcularArea() {
        double generatriz=calcularHipotenusa();
        return Math.PI * Math.pow(radio, 2) + Math.PI * radio * generatriz;
    }

    public double calcularVolumen() {
        return (Math.PI*Math.pow(radio, 2)*altura)/3;
    }

    @Override
    public void mostrar_datos() {
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: Cono");
        System.out.println("Número de caras: 2");
        System.out.println("Radio: "+ radio);
        System.out.println("Altura: "+ altura);
        System.out.println("Altura Inclinada: "+ calcularHipotenusa());
        System.out.println("Area: "+calcularArea());
        System.out.println("Volumen: "+ calcularVolumen());
    }

}
