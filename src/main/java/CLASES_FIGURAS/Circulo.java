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
    public void imprimirAreaCirculo(){
        System.out.println(area(radio));
    }

    // Calcular el diametro del circulos
    public double diametro(double radio){
        return (2*radio);
    }
    public void imprimirDiametroCirculo(){
        System.out.println(diametro(radio));
    }

    // Calcular circunferencia del circulo con PI
    public double circunferenciaPi(double radio){
        return (2*Math.PI * radio);
    }
    public void imprimirCircunferenciaPi(){
        System.out.println(circunferenciaPi(radio));
    }

    // Calcular circunferencia del circulo con diametro
    public double circunferenciaDiametro(double diametro){
        return (Math.PI * diametro);
    }
    public void imprimirCircunferenciaDiametro(){
        System.out.println(circunferenciaDiametro(diametro));
    }
}
