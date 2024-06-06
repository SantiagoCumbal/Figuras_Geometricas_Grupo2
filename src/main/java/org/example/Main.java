package org.example;
import CLASES_FIGURAS.DOS_D;
import CLASES_FIGURAS.Figuras3D.TRES_D;
import CLASES_FIGURAS.Figuras3D.Esfera;
import CLASES_FIGURAS.Figuras3D.Cono;
import CLASES_FIGURAS.Figuras3D.Cilindro;
public class Main {
    public static void main(String[] args) {
        Cilindro c = new Cilindro(4, 10);
        c.mostrar_datos();
    }
}