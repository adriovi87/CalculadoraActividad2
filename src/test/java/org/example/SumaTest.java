package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Suma.
 */

class SumaTest {

    private Suma suma;

    @BeforeEach
    void setUp() {
        // Se crea una nueva instancia de Suma antes de cada prueba.
        suma = new Suma();
    }

    /**
     * Prueba el método sumarEnteros para valores válidos y casos con números negativos.
     */

    @Test
    void sumarEnteros() {
        // Pruebas válidas
        assertEquals(10, suma.sumarEnteros(5, 5), "La suma de 5 y 5 debe ser 10");
        assertEquals(20, suma.sumarEnteros(10, 10), "La suma de 10 y 10 debe ser 20");

        // Prueba que se lance una excepción al pasar un número negativo.
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumarEnteros(-1, 2);
        }, "Debe lanzar IllegalArgumentException para números negativos");
    }

    /**
     * Prueba el método sumarReales para valores válidos y con parámetros negativos.
     */
    @Test
    void sumarReales() {
        // Prueba válida para números reales
        assertEquals(3.3, suma.sumarReales(1.0, 2.3), "La suma de 1.0 y 2.3 debe ser 3.3");

        // Prueba que se lance una excepción al pasar un número negativo.
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumarReales(1.0, -3.2);
        }, "Debe lanzar IllegalArgumentException para números negativos");
    }

    /**
     * Prueba el método sumarTresReales para valores válidos y con parámetros negativos.
     */
    @Test
    void sumarTresReales() {
        // Prueba válida para tres números reales
        assertEquals(8.8, suma.sumarTresReales(1.1, 3.2, 4.5), "La suma de 1.1, 3.2 y 4.5 debe ser 8.8");

        // Prueba que se lance una excepción al pasar alguno de los números negativos.
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumarTresReales(2.4, -3.5, 1.3);
        }, "Debe lanzar IllegalArgumentException si alguno de los números es negativo");
    }

    /**
     * Prueba el método sumarAcumulado en casos válidos y con un valor negativo.
     */
    @Test
    void sumarAcumulado() {
        // Inicialmente, el acumulado debe ser 0.
        assertEquals(0, suma.getValorAcumulado(), "El valor acumulado inicial debe ser 0");

        // Suma valores y verifica el acumulado.
        assertEquals(5, suma.sumarAcumulado(5), "El acumulado tras sumar 5 debe ser 5, antes 0");
        assertEquals(7, suma.sumarAcumulado(2), "El acumulado tras sumar 2 más debe ser 7, antes 5");

        // Prueba que se lance una excepción al intentar sumar un valor negativo.
        assertThrows(IllegalArgumentException.class, () -> {
            suma.sumarAcumulado(-3);
        }, "Debe lanzar IllegalArgumentException al intentar sumar un valor negativo");
    }
}
