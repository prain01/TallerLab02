
import java.util.Scanner;

public class TallerLab02 {
    public static void main(String[] args) {
        menu();
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

    public static int mayorProductoAdyacentes(int[] arreglo){
        if(arreglo.length<2){
            System.out.println("error con el largo del arreglo");
            return -1;
        }else{
            int mayorProducto = (arreglo[0]) * (arreglo[1]);
            for (int i = 0; i < (arreglo.length - 2); i++){
                if((mayorProducto) < (arreglo[i + 1] * arreglo[i + 2] )){
                    mayorProducto = arreglo[i + 1] * arreglo[i + 2];
                }
            }
            return mayorProducto;
        }
    }

    public static void menu(){
        System.out.println("ELIJA UNA OPCION" +
                "\n[1] mostrar pares aydacentes" +
                "\n[2] Mostrar el mayor valor de producto" +
                "\n[0] Salir");
        elegirOpcionMenu();
    }

    private static void elegirOpcionMenu() { //digamos que el menu tiene 5 opciones --> min=0, max=4
        int min = 0;
        int max = 2;
        int[] arreglo = generarArreglo();
        int opcion = -1;
        do{
            opcion = pedirNumeroLimitado(min, max);
            switch (opcion) {
                case 1 -> mostrarParesAdyacentes(arreglo);
                case 2 -> System.out.println(mayorProductoAdyacentes(arreglo));
                case 0 -> casoSalir();
            }
        } while (opcion != 0);

    }

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
