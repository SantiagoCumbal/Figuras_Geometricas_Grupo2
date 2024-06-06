package org.example;

import java.util.Scanner;

import CLASES_FIGURAS.Irregulares;
import CLASES_FIGURAS.Triangulo;
import CLASES_FIGURAS.Cuadrilateros;
import CLASES_FIGURAS.Segmento_circular;
import CLASES_FIGURAS.Zona_circular;
import CLASES_FIGURAS.Figuras3D.Esfera;
import CLASES_FIGURAS.Figuras3D.Cono;
import CLASES_FIGURAS.Figuras3D.Cilindro;
import CLASES_FIGURAS.Figuras3D.Cubo;
import CLASES_FIGURAS.Figuras3D.Prisma;
import CLASES_FIGURAS.Figuras3D.Tetraedro;
import CLASES_FIGURAS.Figuras3D.Octaedro;
import CLASES_FIGURAS.Figuras3D.Dodecaedro;


public class Main {
    public static void main(String[] args) {
        Irregulares figura3 = new Irregulares();
        Triangulo figuro5 = new Triangulo();
        Cuadrilateros figuro6 = new Cuadrilateros();
        Segmento_circular figura7 = new Segmento_circular();
        Zona_circular figura8 = new Zona_circular();
        Esfera figura10 = new Esfera();
        Cono figura11 = new Cono();
        Cilindro figura12 = new Cilindro();
        Cubo figura13 = new Cubo();
        Prisma figura14 = new Prisma();
        Tetraedro figura15 = new Tetraedro();
        Octaedro figura16 = new Octaedro();
        Dodecaedro figura17 = new Dodecaedro();


        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----MENU DE FIGURAS-----");
            System.out.println("1. Figuras Geometricas");
            System.out.println("2. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("-----FIGURAS GEOMETRICAS-----");
                        System.out.println("1. Figuras 2D");
                        System.out.println("2. Figuras 3D");
                        System.out.println("3. Salir al menu principal");
                        System.out.print("Ingrese su opcion: ");
                        opcion = scanner.nextInt();
                        switch (opcion) {
                            case 1:
                                do {
                                    System.out.println("-----Menu Figuras 2D-----");
                                    System.out.println("1. Regulares");
                                    System.out.println("2. Irregulaes");
                                    System.out.println("3. Regresando al menu");
                                    System.out.print("Ingrese su opcion: ");
                                    opcion = scanner.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            do {
                                                System.out.println("-----Menu Regulares-----");
                                                System.out.println("1. Circulo");
                                                System.out.println("2. Triangulo");
                                                System.out.println("3. Cuadrilatero");
                                                System.out.println("4. Regresando al menu");
                                                System.out.print("Ingrese su opcion: ");
                                                opcion = scanner.nextInt();
                                                switch (opcion) {
                                                    case 1:
                                                        do{
                                                            System.out.println("-----Menu Circulo-----");
                                                            System.out.println("1. Zona Circular");
                                                            System.out.println("2. Segmento Circular");
                                                            System.out.println("3. Regresando al menu");
                                                            System.out.print("Ingrese su opcion: ");
                                                            opcion = scanner.nextInt();
                                                            switch (opcion) {
                                                                case 1:
                                                                    System.out.print("Ingrese el radio del circulo: ");
                                                                    double radioZona = scanner.nextDouble();
                                                                    figura8.setRadio(radioZona);

                                                                    System.out.print("Ingrese los grados de la zona circular: ");
                                                                    double gradosZona = scanner.nextDouble();
                                                                    figura8.setGrados(gradosZona);

                                                                    figura8.mostrar_datos();
                                                                    break;

                                                                case 2:
                                                                    System.out.print("Ingrese el radio del círculo: ");
                                                                    double radioSegmento = scanner.nextDouble();
                                                                    figura7.setRadio(radioSegmento);

                                                                    System.out.print("Ingrese los grados del segmento circular: ");
                                                                    double gradosSegmento = scanner.nextDouble();
                                                                    figura7.setGrados(gradosSegmento);

                                                                    figura7.mostrar_datos();
                                                                    break;
                                                                case 3:
                                                                    System.out.println("Saliendo al menu");
                                                                    break;
                                                                default:
                                                                    System.out.println("Opcion no valida");
                                                            }
                                                        }while (opcion != 3);
                                                        break;
                                                    case 2:
                                                        System.out.print("Ingrese la base del triángulo: ");
                                                        double baseTriangulo = scanner.nextDouble();
                                                        figuro5.setBase(baseTriangulo);

                                                        System.out.print("Ingrese la altura del triángulo: ");
                                                        double alturaTriangulo = scanner.nextDouble();
                                                        figuro5.setAltura(alturaTriangulo);

                                                        System.out.print("Ingrese el lado 1 del triángulo: ");
                                                        double lado1Triangulo = scanner.nextDouble();
                                                        figuro5.setLado1(lado1Triangulo);

                                                        System.out.print("Ingrese el lado 2 del triángulo: ");
                                                        double lado2Triangulo = scanner.nextDouble();
                                                        figuro5.setLado2(lado2Triangulo);

                                                        System.out.print("Ingrese el lado 3 del triángulo: ");
                                                        double lado3Triangulo = scanner.nextDouble();
                                                        figuro5.setLado3(lado3Triangulo);

                                                        figuro5.mostrar_datos();
                                                        break;
                                                    case 3:
                                                        System.out.print("Ingrese la base del cuadrilátero: ");
                                                        double baseCuadrilatero = scanner.nextDouble();
                                                        figuro6.setBase(baseCuadrilatero);

                                                        System.out.print("Ingrese la altura del cuadrilátero: ");
                                                        double alturaCuadrilatero = scanner.nextDouble();
                                                        figuro6.setAltura(alturaCuadrilatero);

                                                        figuro6.mostrar_datos();
                                                        break;
                                                    case 4:
                                                        System.out.println("Saliendo al menu");
                                                        break;
                                                    default:
                                                        System.out.println("Opcion no valida");
                                                }
                                            }while (opcion != 4);
                                            break;
                                        case 2:
                                            System.out.print("Ingrese el nombre de la figura irregular: ");
                                            String nombreFiguraIrregular = scanner.next();
                                            figura3.setNombre(nombreFiguraIrregular);

                                            System.out.print("Ingrese el número de lados de la figura irregular: ");
                                            int nladosFiguraIrregular = scanner.nextInt();
                                            figura3.setNlados(nladosFiguraIrregular);

                                            System.out.print("Ingrese el tipo de ángulos de la figura irregular: ");
                                            String tipoAngulosFiguraIrregular = scanner.next();
                                            figura3.setTipo_angulos(tipoAngulosFiguraIrregular);

                                            figura3.mostrar_datos();
                                            break;
                                        case 3:
                                                System.out.print("Regresando al menu");
                                                break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                }while (opcion != 3);
                                break;
                            case 2:
                                do {
                                    System.out.println("-----Menu Figuras 3D-----");
                                    System.out.println("1. Esfera");
                                    System.out.println("2. Cono");
                                    System.out.println("3. Cilindro");
                                    System.out.println("4. Prisma");
                                    System.out.println("5. Cubo");
                                    System.out.println("6. Tetraedro");
                                    System.out.println("7. Octaedro");
                                    System.out.println("8. Dodecaedro");
                                    System.out.println("9. Salir al menu");
                                    System.out.print("Ingrese su opcion: ");
                                    opcion = scanner.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.print("Ingrese el radio de la esfera: ");
                                            double radioEsfera = scanner.nextDouble();
                                            figura10.setRadio(radioEsfera);
                                            figura10.mostrar_datos();
                                            break;
                                        case 2:
                                            System.out.print("Ingrese el radio del cono: ");
                                            double radioCono = scanner.nextDouble();
                                            figura11.setRadio(radioCono);
                                            System.out.print("Ingrese la altura del cono: ");
                                            double alturaCono = scanner.nextDouble();
                                            figura11.setAltura(alturaCono);
                                            figura11.mostrar_datos();
                                            break;
                                        case 3:
                                            System.out.print("Ingrese el radio del cilindro: ");
                                            double radioCilindro = scanner.nextDouble();
                                            figura12.setRadio(radioCilindro);
                                            System.out.print("Ingrese la altura del cilindro: ");
                                            double alturaCilindro = scanner.nextDouble();
                                            figura12.setAltura(alturaCilindro);
                                            figura12.mostrar_datos();
                                            break;
                                        case 4:
                                            System.out.print("Ingrese el número de caras del prisma: ");
                                            int numeroCarasPrisma = scanner.nextInt();
                                            figura14.setNumeroDeCaras(numeroCarasPrisma);
                                            System.out.print("Ingrese el área de la base del prisma: ");
                                            double areaBasePrisma = scanner.nextDouble();
                                            figura14.setAreaBase(areaBasePrisma);
                                            System.out.print("Ingrese la altura del prisma: ");
                                            double alturaPrisma = scanner.nextDouble();
                                            figura14.setAltura(alturaPrisma);
                                            figura14.mostrar_datos();
                                            break;
                                        case 5:
                                            System.out.print("Ingrese la longitud de las aristas del cubo: ");
                                            double longitudAristasCubo = scanner.nextDouble();
                                            figura13.setMedAristas(longitudAristasCubo);
                                            figura13.mostrar_datos();
                                            break;
                                        case 6:
                                            System.out.print("Ingrese la longitud de un lado del tetraedro: ");
                                            double longitudLadoTetraedro = scanner.nextDouble();
                                            figura15.setLado(longitudLadoTetraedro);
                                            figura15.mostrar_datos();
                                            break;
                                        case 7:
                                            System.out.print("Ingrese la longitud de las aristas del octaedro: ");
                                            double longitudAristasOctaedro = scanner.nextDouble();
                                            figura16.setMedAristas(longitudAristasOctaedro);
                                            figura16.mostrar_datos();
                                            break;
                                        case 8:
                                            System.out.print("Ingrese la longitud de las aristas del dodecaedro: ");
                                            double longitudAristasDodecaedro = scanner.nextDouble();
                                            figura17.setMedAristas(longitudAristasDodecaedro);
                                            figura17.mostrar_datos();
                                            break;
                                        case 9:
                                            System.out.println("Saliendo al menu");
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                    }
                                }while (opcion != 9);
                                break;
                            case 3:
                                System.out.println("Saliendo al menu principal");
                                break;
                            default:
                                System.out.println("Opcion no válida. Ingrese una opción valida");
                        }
                    }while (opcion != 3);
                    break;
                case 2:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no válida. Ingrese una opción valida");
            }
        } while (opcion != 2);

    }
}