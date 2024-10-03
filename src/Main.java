import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funciones fun = new Funciones();
        Scanner sc = new Scanner(System.in);
        int ejercicio, f, c;
        boolean salir = false;
        int[] array = new int[10];
        String orden = "";
        int[] arrayOrdenado = new int[10];


        do {
            System.out.println("\nIndique que ejericio quiere revisar\nSi deseas salir presione 0");
            ejercicio = sc.nextInt();
            if (ejercicio == 1) {
                System.out.println("");
            }
            else if (ejercicio == 4) {
                System.out.println("Vamos a crear un array");
                System.out.println("Como quieres crear el array de forma ....\n1.carga manual\n2.valores aleatorios");
                int opcion = sc.nextInt();
                if (opcion == 1) {
                    fun.rellenarArrayPorConsola(array);
                    int[] arrayOredenado = array.clone();
                    fun.mostrarArray(array);
                    System.out.println("\n De que manera quieres ordenar el Array de manera ... \n1.Ascendente\n2.Descendente");
                    int modo = sc.nextInt();
                    if (modo == 1) {
                        orden = "asc";

                    } else if (modo == 2) {
                        orden = "desc";
                    } else {
                        System.out.println(" El numero ingresado no corresponde a una opcion valida");
                    }

                    fun.ordenarArray(arrayOredenado, orden);
                    fun.mostrarArray(arrayOredenado);


                } else if (opcion == 2) {
                    fun.rellenarArrayRandom(array, 50);

                    fun.mostrarArray(array);
                    arrayOrdenado = array.clone();
                    System.out.println("\n De que manera quieres ordenar el Array de manera ... \n1.Ascendente\n2.Descendente");
                    int modo = sc.nextInt();
                    if (modo == 1) {
                        orden = "asc";

                    } else if (modo == 2) {
                        orden = "desc";
                    } else {
                        System.out.println(" El numero ingresado no corresponde a una opcion valida");
                    }
                    fun.ordenarArray(arrayOrdenado, orden);
                    fun.mostrarArray(arrayOrdenado);


                }

            } else if (ejercicio == 2) {
                System.out.println("Los metodos sobre los algoritmos fundamentales estan en la carpeta de ´Funciones´ ");
            } else if (ejercicio == 3) {
                System.out.println(" Las modificaciones tambien estan en la carpeta ´Funciones´ junto a sus respectivos metodos");
            } else if (ejercicio == 0) {
                salir = true;
            } else if (ejercicio == 5) {

                do {
                    System.out.println("primero ingresa un numero mayor o igual a 2 que correspondera al numero de filas");
                    f = sc.nextInt();
                    if (f < 2) {
                        System.out.println("El numero que ingresaste no es valido, intentalo de nuevo");
                    }
                } while (f < 2);
                do {
                    System.out.println("primero ingresa un numero mayor o igual a 2 que correspondera al numero de filas");
                    c = sc.nextInt();
                    if (c < 2) {
                        System.out.println("El numero que ingresaste no es valido, intentalo de nuevo");
                    }
                } while (c < 2);

                int[][] matriz = new int[f][c];

                fun.rellenarMatriz(matriz);
                fun.mostrarMatriz(matriz);
                int prom = fun.calcularPromediodeMatriz(matriz);
                System.out.println("\nEl promedio de la matriz es " + prom);
                fun.buscarelementoEnMatriz(matriz, prom);

            }

        } while (!salir);


    }
}