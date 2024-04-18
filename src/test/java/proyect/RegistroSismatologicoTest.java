package proyect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RegistroSismatologicoTest {
    @Test
    void testSismoMasFuerteVacio() {
        RegistroSismatologico R = new RegistroSismatologico();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            R.sismoMasFuerte();
        });

    }

    @Test
    void testSismoMasFuerteLleno() {
        RegistroSismatologico R = new RegistroSismatologico();
        R.llenarRegistro(5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            R.sismoMasFuerte();
        });

    }

    @Test
    void cantidadPorDiayMagnitudVacio() {
        RegistroSismatologico R = new RegistroSismatologico();

        assertThrows(Exception.class, () -> {
            R.cantidadPorDiayMagnitud(5,5.6);
        });

    }

    @Test
    void cantidadPorDiayMagnitudLleno() {
        RegistroSismatologico R = new RegistroSismatologico();
        R.llenarRegistro(4);

        assertThrows(Exception.class, () -> {
            R.cantidadPorDiayMagnitud(5,8.7);
        });

    }





}