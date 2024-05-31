package CLASES_FIGURAS;

public class Figuras_Geometricas {
    int nlados;
    String nombre;
    public Figuras_Geometricas() {}
    public Figuras_Geometricas(int nlados, String nombre) {
        this.nlados = nlados;
        this.nombre = nombre;
    }

    public int getNlados() {
        return nlados;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void mostrar_datos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("El nlados es: " + nlados);
    }

}
