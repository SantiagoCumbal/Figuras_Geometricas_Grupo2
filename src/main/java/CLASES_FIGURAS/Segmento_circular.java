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


     }
