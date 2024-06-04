package CLASES_FIGURAS.Figuras3D;
import CLASES_FIGURAS.Figuras_Geometricas;
public class TRES_D extends Figuras_Geometricas {
    int ncaras;
    public TRES_D() {}
    public TRES_D(int nlados, String nombre, int ncaras) {
        super(nlados,nombre);
        this.ncaras = ncaras;
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

    //metodo
    @Override
    public void mostrar_datos(){
        System.out.println("Esta figura es: 3D");
        System.out.println("Nombre: " + getNombre());
        System.out.println("N Caras: " + ncaras);
        System.out.println("Aristas: " + getNlados());
    }


}
