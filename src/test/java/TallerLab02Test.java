import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TallerLab02Test {
    @Test
    void testMayorProductoAdyacentes1() {
        int [] arreglo = {1};
        assertEquals(-1,TallerLab02.mayorProductoAdyacentes(arreglo));
    }

    @Test
    void testMayorProductoAdyacentes2() {
        int [] arreglo = {};
        assertEquals(-1,TallerLab02.mayorProductoAdyacentes(arreglo));
    }

    //NOS FALTA EL CASO 3 -->INPUT 'a';

    @Test
    void testMayorProductoAdyacentes4() {
        int [] arreglo = {3, 6, -2, -5, 7, 3};
        int mayor = arreglo[4]*arreglo[5];
        assertEquals(mayor,TallerLab02.mayorProductoAdyacentes(arreglo));
    }

    @Test
    void testMayorProductoAdyacentes5() {
        int [] arreglo = {-1, -2};
        int mayor = arreglo[0]*arreglo[1];
        assertEquals(mayor,TallerLab02.mayorProductoAdyacentes(arreglo));
    }

    @Test
    void testMayorProductoAdyacentes6() {
        int [] arreglo = {1, 0, 1, 0, 1000};
        int mayor = 0;
        assertEquals(0,TallerLab02.mayorProductoAdyacentes(arreglo));
    }
}