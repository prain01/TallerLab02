import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TallerLab02 {
    public static void main(String[] args) {
        System.out.println("hola mundo");
       // generarArreglo();
        menu();
    }

    public static int[] generarArreglo(){
        int min = 2;
        int max = 10;
        int largoArreglo = (int)(Math.random()*(max - min + 1) + min);
        int[] arreglo = new int[largoArreglo];
        for (int i = 0; i < largoArreglo; i++) {
            arreglo[i] = (-1000)+(int)(Math.random()*((1000 - (-1000) + 1) ));
            System.out.println(arreglo[i]);
        }
        return arreglo;
    }

    /*
    public static void generarArregloPares(int[] arreglo){
        int[][] arregloPares = new int[arreglo.length][2];
        for(int i = 0; i < arreglo.length; i++){
            arregloPares[i][0] = arreglo[i];
            arregloPares[i][1] = arreglo[i+1];
        }
        for(int i = 0; i < arregloPares.length; i++){
            System.out.println(Arrays.toString(arreglo));
        }
    }


     */
    public static void mostrarParesAdyacentes(int[] arreglo){
        for (int i = 0; i < (arreglo.length - 1); i++) {
            System.out.print("[" + arreglo[i] + "]" + "[" + arreglo[i + 1] + "]    ");
        }
    }

    public static int mayorProductoAdyacentes(int[][]arregloPares){
        int mayor= arregloPares[0][0];
        int mayor1=arregloPares[0][1];
        for(int i=1;i<arregloPares.length;i++){
            if(arregloPares[i][0]>mayor && arregloPares[i+1][1]>mayor1){

            }
        }
    }


    public static void menu(){
        System.out.println("esto es un tipico menu--> ELIJA UNA OPCION" +
                "\n[1] caso 1" +
                "\n[2] caso 2" +
                "\n[3] caso 3" +
                "\n[4] caso 4" +
                "\n[0] Salir");
        int min = 0;
        int max = 4;
        elegirOpcionMenu(pedirNumeroLimitado(min, max));
    }

    private static void elegirOpcionMenu(int opcion) { //digamos que el menu tiene 5 opciones --> min=0, max=4
        int min = 0;
        int max = 4;
        while (opcion != 0){
            switch (opcion) {
                case 1 -> casoMenu1();
                case 2 -> casoMenu2();
                case 3 -> casoMenu3();
                case 4 -> casoMenu4();
                case 0 -> casoMenu0();
            }
            opcion = pedirNumeroLimitado(min, max);
        }
    }

    public static void casoMenu1(){
        System.out.println("HOLA MUNDO --> caso 1");
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
    public static void casoMenu0(){ //por lo general ocupo el '0' para parar ejecucion del programa
        System.out.println("HOLA MUNDO --> Adios...");
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
}
