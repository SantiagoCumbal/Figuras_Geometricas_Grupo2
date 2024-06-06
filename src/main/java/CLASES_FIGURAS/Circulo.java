package CLASES_FIGURAS;

public class Circulo extends regulares {
    double radio;
    double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    //Calcular el area del circulos
    public double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    // Calcular el diametro del circulos
    public double diametro(double radio){
        return (2*radio);
    }
    // Calcular circunferencia del circulo con PI
    public double circunferenciaPi(double radio){
        return (2*Math.PI * radio);
    }
    // Calcular circunferencia del circulo con diametro
    public double circunferenciaDiametro(double diametro){
        return (Math.PI * diametro);
    }
    @Override
    public void mostrar_datos() {
        System.out.println("Nombre: Circulo");
        System.out.println("Radio: " + radio);
        System.out.println("Diametro: " + diametro);
        System.out.println("Área del circulo: " + area(radio));
        System.out.println("Diametro:" + diametro(radio));
        System.out.println("Circunferencia con valor PI:" + circunferenciaPi(radio));
        System.out.println("Circunferencia con valor de diametro:" + circunferenciaDiametro(diametro));
    }
}
