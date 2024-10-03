import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Funciones {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    // punto numero 3, cada metodo de ordenamiento tiene un argumento que indica si el ordenamiento sera de forma ascendente o descendente
    //punto numero dos, metodos que representan los algoritmos de ordenamiento por incercion
    public void ordenarPorIncercion(int[]array,String modo){

        if(modo.equals("asc")){
            for (int i = 1; i < array.length; i++) {
                int value = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > value) {
                    array[j + 1] = array[j];

                        j= j -1;

                }
                array[j + 1] = value;
            }
        } else if (modo.equals("desc")) {
            for (int i = 1; i < array.length; i++) {
                int value = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < value) {
                    array[j + 1] = array[j];

                        j--;

                }
                array[j + 1] = value;
            }
        }else{
            System.out.println("error: el comando ingresado no corresponde a una opcion correcta");
        }
    }
    public void ordenarPorIncercion(double[]array,String modo){

        if(modo.equals("asc")){
            for (int i = 1; i < array.length; i++) {
                double value = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > value) {
                    array[j + 1] = array[j];
                    if (j<5){
                        j--;
                    }
                }
                array[j + 1] = value;
            }
        } else if (modo.equals("desc")) {
            for (int i = 1; i < array.length; i++) {
                double value = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] < value) {
                    array[j + 1] = array[j];
                    if (j<5){
                        j--;
                    }
                }
                array[j + 1] = value;
            }
        }else{
            System.out.println("error: el comando ingresado no corresponde a una opcion correcta");
        }
    }

    //punto numero dos, metodos que representan los algoritmos de ordenamiento por el metodo de burbuja
    public void ordenarPorMetodoBurbuja(int[]array,String modo){int n = array.length;
        boolean cambiado;
        if(modo.equals("asc")){
            for (int i = 0; i < n - 1; i++) {
                cambiado = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // Intercambiar arr[j] y arr[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        cambiado = true;
                    }
                }
                // Si no hubo intercambios, la lista ya está ordenada
                if (!cambiado) break;
            }
        }else{
            for (int i = 0; i < n - 1; i++) {
                cambiado = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        // Intercambiar arr[j] y arr[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        cambiado = true;
                    }
                }
                // Si no hubo intercambios, la lista ya está ordenada
                if (!cambiado) break;
            }
        }

    }
    public void ordenarPorMetodoBurbuja(double[]array,String modo){
        int x = 0;
        if(modo.equals("asc")){
            do{
                for (int i = 1; i < array.length; i++) {
                    double y  = array[i];
                    double z =array[i-1];

                    if(array[i-1] > array[i]){
                        array[i-1]=y;
                        array[i]=z;
                        x++;
                    }
                }
            }while(x<array.length);
        }else if(modo.equals("desc")){
            do{
                for (int i = 1; i < array.length; i++) {
                    double y  = array[i];
                    double z =array[i-1];

                    if(array[i-1] < array[i]){
                        array[i-1]=y;
                        array[i]=z;
                        x++;
                    }
                }
            }while(x<array.length);
        }else{
            System.out.println("El codigo ingresado no corresponde a una opcion correcta");
        }
    }

    //punto numero 2 , metodos que resperesentan los algoritmos de ordenamiento por el metodo selectivo
    public void ordenarPorSeleccion(int[] array,String modo) {

        if(modo.equals("asc")){
            int l = array.length;
            for (int i = 0; i < l - 1; i++) {
                int aux = i;
                for (int j = i + 1; j < l; j++) {
                    if (array[j] < array[aux]) {
                        aux = j;
                    }
                }
                int temp = array[aux];
                array[aux] = array[i];
                array[i] = temp;
            }
        } else if (modo.equals("desc")) {
            int l = array.length;
            for (int i = 0; i < l - 1; i++) {
                int aux = i;
                for (int j = i + 1; j < l; j++) {
                    if (array[j] > array[aux]) {
                        aux = j;
                    }
                }
                int temp = array[aux];
                array[aux] = array[i];
                array[i] = temp;
            }
        }
    }
    public void ordenarPorSeleccion(double[] array,String modo) {

        if(modo.equals("asc")){
            int l = array.length;
            for (int i = 0; i < l - 1; i++) {
                int aux = i;
                for (int j = i + 1; j < l; j++) {
                    if (array[j] < array[aux]) {
                        aux = j;
                    }
                }
                double temp = array[aux];
                array[aux] = array[i];
                array[i] = temp;
            }
        } else if (modo.equals("desc")) {
            int l = array.length;
            for (int i = 0; i < l - 1; i++) {
                int aux = i;
                for (int j = i + 1; j < l; j++) {
                    if (array[j] > array[aux]) {
                        aux = j;
                    }
                }
                double temp = array[aux];
                array[aux] = array[i];
                array[i] = temp;
            }
        }
    }
    public void ordenarArray(int[] array, String ascOdesc){
        String metodo="";
        System.out.println("selecciona el metodo con el que quieres ordenar el array..\n1.Insercion\n2.Metodo Burbuja\n3.Seleccion");
        int o = sc.nextInt();
        if (o==1){
            metodo="insercion";
        } else if (o==2) {
            metodo="burbuja";
        }else if (o==3) {
            metodo="seleccion";
        }else{
            System.out.println("ha ingresado una opcion no valida");
        }
        switch (metodo) {
            case "insercion" -> ordenarPorIncercion(array, ascOdesc);
            case "burbuja" -> ordenarPorMetodoBurbuja(array, ascOdesc);
            case "seleccion" -> ordenarPorSeleccion(array, ascOdesc);
        }
    }

    //punto numero 2 metodos que representan los algoritmos de busqueda
    public void buscarElemento(int[] array, int num){

        boolean encontrado=false;
        for (int j : array) {

            if (j == num) {
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("no se encontro el elemento");
        }else{
            System.out.println("El elemento "+ num + " ha sido encontrado dentro del array");
        }

    }
    public void buscarElemento(double[] array, int num){

        boolean encontrado=false;
        for (double j : array) {

            if (j == num) {
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("no se encontro el elemento");
        }else{
            System.out.println("El elemento "+ num + " ha sido encontrado dentro del array");
        }

    }
    public void buscarElemento(String[] array, String str){

        boolean encontrado=false;
        for (String j : array) {

            if (j.equals(str)) {
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("no se encontro el elemento");
        }else{
            System.out.println("El elemento "+ str + " ha sido encontrado dentro del array");
        }

    }

    //punto numero 2 metodos que representan los algoritmos de busqueda binaria
    public int busquedaBinaria(int[] array, int num){
            int l = 0;
            int r = array.length - 1;

            while (l <= r) {
                int m = l + (r - l) / 2;
                if (array[m] == num)
                    return m;
                if (array[m] < num)
                    l = m + 1;
                else
                    r = m - 1;
            }
            return -1;
    }

    public void rellenarArrayRandom(int[] array,int rango) {

        for (int i = 0; i < array.length; i++) {
            int num = rd.nextInt(rango) + 1;
            array[i] = num;

        }
    }

    public void mostrarArray(int[] array) {

        for (int i : array) System.out.print(i + " ; ");

    }

    public void rellenarArrayPorConsola(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese el elemento");
            array[i] = sc.nextInt();
        }
    }

    public void mostrarMatriz(int[][] matriz){

        for (int i=0; i<matriz.length;i++){
            System.out.println(" ");
            for (int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }

        }
    }
    public void rellenarMatriz(int[][] matriz){
        for (int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length;j++){
                System.out.println("\nIngresa un elemento ");
                matriz[i][j]=sc.nextInt();
            }
        }

    }

    public void buscarelementoEnMatriz(int[][]matriz, int n){
        boolean encontrado =false;
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j]==n){
                    encontrado=true;
                    System.out.println("el elemento " + n +" ha sido encontrado en la fila "+ i + " columna "+ j);

                }
            }
        }
        if(!encontrado){
            System.out.println("no se encontro el elemento dentro de la matriz");
        }
    }
    public void buscarelementoEnMatriz(double[][]matriz, double n){
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j]==n){
                    System.out.println("el elemento " + n +" ha sido encontrado en la fila "+ i + " columna "+ j);

                }
            }
        }
    }
    public int calcularPromediodeMatriz(int[][]matriz){
        int cont = 0;
        int suma = 0;
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                suma += matriz[i][j];
                cont ++;
            }
        }
        return suma/cont;
    }






    /*do {
        System.out.println("\nIndique que ejericio quiere revisar\nSi deseas salir presione 0");
        ejercicio = sc.nextInt();
        if (ejercicio == 1) {
            System.out.println("");
        }
        else if (ejercicio == 4) {
        System.out.println("Vamos a crear un array");
        System.out.println("Como quieres crear el array de forma ....\n1.carga manual\n2.valores aleatorios");
        int opcion = sc.nextInt();
        if(opcion==1){
            fun.rellenarArrayPorConsola(array);
            int[] arrayOredenado = array.clone();
            fun.mostrarArray(array);
            System.out.println("\n De que manera quieres ordenar el Array de manera ... \n1.Ascendente\n2.Descendente");
            int modo = sc.nextInt();
            if (modo==1){
                orden = "asc";

            }else if(modo==2){
                orden = "desc";
            }else{
                System.out.println(" El numero ingresado no corresponde a una opcion valida");
            }

            fun.ordenarArray(arrayOredenado,orden);
            fun.mostrarArray(arrayOredenado);


        } else if (opcion==2) {
            fun.rellenarArrayRandom(array,50);

            fun.mostrarArray(array);
            arrayOrdenado = array.clone();
            System.out.println("\n De que manera quieres ordenar el Array de manera ... \n1.Ascendente\n2.Descendente");
            int modo = sc.nextInt();
            if (modo==1){
                orden = "asc";

            }else if(modo==2){
                orden = "desc";
            }else{
                System.out.println(" El numero ingresado no corresponde a una opcion valida");
            }
            fun.ordenarArray(arrayOrdenado,orden);
            fun.mostrarArray(arrayOrdenado);


        }

        }
        else if (ejercicio==2){
            System.out.println("Los metodos sobre los algoritmos fundamentales estan en la carpeta de ´Funciones´ ");
        }
        else if (ejercicio==3){
            System.out.println(" Las modificaciones tambien estan en la carpeta ´Funciones´ junto a sus respectivos metodos");
        }
        else if (ejercicio == 0) {
            salir = true;
        }
        else if (ejercicio == 5) {

            int f = 0;
            int c = 0;
            do{
                System.out.println("primero ingresa un numero mayor o igual a 2 que correspondera al numero de filas");
                f = sc.nextInt();
                if (f < 2) {
                    System.out.println("El numero que ingresaste no es valido, intentalo de nuevo");
                }
            }while(f<2);
            do{
                System.out.println("primero ingresa un numero mayor o igual a 2 que correspondera al numero de filas");
                c = sc.nextInt();
                if (c < 2) {
                    System.out.println("El numero que ingresaste no es valido, intentalo de nuevo");
                }
            }while(c<2);

            int[][] matriz = new int[f][c];

            fun.rellenarMatriz(matriz);
            fun.mostrarMatriz(matriz);
            int prom = fun.calcularPromediodeMatriz(matriz);
            System.out.println("\nEl promedio de la matriz es " + prom);
            fun.buscarelementoEnMatriz(matriz,prom);

        }

    } while (!salir);*/






}
