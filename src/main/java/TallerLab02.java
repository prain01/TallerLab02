import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TallerLab02 {
    public static void main(String[] args) {
        menu();
        System.out.println("hola mundo");
    }

    public static int[] generarArreglo(){
        int min = 2;
        int max = 10;
        int largoArreglo = (int)(Math.random()*(max - min + 1) + min);
        int[] arreglo = new int[largoArreglo];
        for (int i = 0; i < largoArreglo; i++) {
            arreglo[i] = (-1000)+(int)(Math.random()*((1000 - (-1000) + 1) ));
        }
        return arreglo;
    }

    public static void mostrarParesAdyacentes(int[] arreglo){
        for (int i = 0; i < (arreglo.length - 1); i++) {
            System.out.print("[" + arreglo[i] + "]" + "[" + arreglo[i + 1] + "]    ");
        }
        System.out.println("");
    }


    public static void mayorProductoAdyacentes1(int[] arreglo){
        int mayorProducto = (arreglo[0]) * (arreglo[1]);
        for (int i = 0; i < (arreglo.length - 2); i++){
            if(arreglo[i] * arreglo[i + 1] < arreglo[i + 1] *arreglo[i + 2] ){
                mayorProducto = arreglo[i + 1] *arreglo[i + 2];
            }
        }
        //return mayorProducto;
        System.out.println(mayorProducto);
    }


    public static void menu(){
        System.out.println("ELIJA UNA OPCION" +
                "\n[1] mostrar pares aydacentes" +
                "\n[2] Mostrar el mayor valor de producto" +
                "\n[3] caso 3" +
                "\n[0] Salir");
        int min = 0;
        int max = 3;
        elegirOpcionMenu(pedirNumeroLimitado(min, max));
    }

    private static void elegirOpcionMenu(int opcion) { //digamos que el menu tiene 5 opciones --> min=0, max=4
        int min = 0;
        int max = 3;
        int[] arreglo = generarArreglo();
        while (opcion != 0){
            switch (opcion) {
                case 1 -> mostrarParesAdyacentes(arreglo);
                case 2 -> mayorProductoAdyacentes1(arreglo);
                case 0 -> casoSalir();
            }
            opcion = pedirNumeroLimitado(min, max);
        }
    }

    /*
    public static void casoMostrarParesAdyacentes(){

    }
    public static void casoMenu2(){
        System.out.println("HOLA MUNDO --> caso 2");
    }
    public static void casoMenu3(){
        System.out.println("HOLA MUNDO --> caso 3");
    }
    public static void casoMenu4(){
        System.out.println("HOLA MUNDO --> caso 4");
    }

     */
    public static void casoSalir(){
        System.out.println("Adios...");
    }

    public static int pedirNumeroLimitado(int min, int max){
        System.out.println("Indique un numero (" + min + "-" + max + ")");
        int num;
        do {
            num = pedirNumero();
            if(!limitesNumero(num, min, max)){
                System.out.println("Indique un número y/o carácter válido");
            }
        } while (!limitesNumero(num, min, max));
        return num;
    }

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            try {
                numero = teclado.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Indique un número y/o carácter válido");
                teclado.nextLine();
            }
        } while (true);
        return  numero;
    }

    public static boolean limitesNumero(int num, int min ,int max) {
        return (min <= num && num <= max);
    }
}
