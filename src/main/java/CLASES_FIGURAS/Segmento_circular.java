package CLASES_FIGURAS;

public class Segmento_circular extends  Circulo{
     double radio;
     double grados;

     //Constructor

     public Segmento_circular() {
     }

     //Constructor

     public Segmento_circular(double radio, double grados) {
          this.radio = radio;
          this.grados = grados;
     }

     //setters, getters
     public double getRadio() {
          return radio;
     }
     public void setRadio(double radio) {
          this.radio = radio;
     }
     public double getGrados() {
          return grados;
     }
     public void setGrados(double grados) {
          this.grados = grados;
     }
     
     // Método para calcular el área del segmento circular
    public double calcularAreaSegmento() {
        double radianes = Math.toRadians(grados);  // Convierte grados a radianes
        return 0.5 * Math.pow(radio, 2) * (radianes - Math.sin(radianes));
    }
     @Override
     public void mostrar_datos() {
        System.out.println("Esta figura es: 2D");
        System.out.println("Nombre: Segmento circular");
        System.out.println("Radio: " + radio);
        System.out.println("Grados: " + grados);
        System.out.println("Área del segmento: " + calcularAreaSegmento());
    }
     
}
