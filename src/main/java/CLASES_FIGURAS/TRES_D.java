package CLASES_FIGURAS;

public class TRES_D extends Figuras_Geometricas {
    int ncaras;
    double aristas;
    public TRES_D() {}
    public TRES_D(int nlados, String nombre, int ncaras, double aristas) {
        super(nlados, nombre);
        this.ncaras = ncaras;
        this.aristas = aristas;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public int getNcaras() {
        return ncaras;
    }

    public void setNcaras(int ncaras) {
        this.ncaras = ncaras;
    }

    public double getAristas() {
        return aristas;
    }

    public void setAristas(double aristas) {
        this.aristas = aristas;
    }
    //metodo
    @Override
    public void mostrar_datos(){
        System.out.println("el nombre es:" + getNombre());
    }


}
