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
        suma = new Suma();
    }

    /**
     * Prueba el método sumarEnteros para valores válidos y casos de desbordamiento.
     */
    @Test
    void sumarEnteros() {
        // Pruebas válidas
        assertEquals(10, suma.sumarEnteros(5, 5));
        assertEquals(-10, suma.sumarEnteros(-5, -5));

        // Desbordamiento positivo: Integer.MAX_VALUE + Integer.MAX_VALUE supera el límite
        assertThrows(ArithmeticException.class, () -> {
            suma.sumarEnteros(Integer.MAX_VALUE, Integer.MAX_VALUE);
        });

        // Desbordamiento negativo: Integer.MIN_VALUE + Integer.MIN_VALUE supera el límite negativo
        assertThrows(ArithmeticException.class, () -> {
            suma.sumarEnteros(Integer.MIN_VALUE, Integer.MIN_VALUE);
        });
    }

    /**
     * Prueba el método sumarReales para valores válidos y casos de desbordamiento.
     */
    @Test
    void sumarReales() {
        // Prueba válida para números reales
        assertEquals(3.3, suma.sumarReales(1.0, 2.3));

        // Prueba desbordamiento: al sumar un valor grande que produce Infinity
        assertThrows(ArithmeticException.class, () -> {
            suma.sumarReales(Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    /**
     * Prueba el método sumarTresReales para valores válidos y casos de desbordamiento.
     */
    @Test
    void sumarTresReales() {
        // Prueba válida para tres números reales
        assertEquals(8.8, suma.sumarTresReales(1.1, 3.2, 4.5));

        // Prueba desbordamiento: al sumar tres valores grandes que producen Infinity
        assertThrows(ArithmeticException.class, () -> {
            suma.sumarTresReales(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
        });
    }

    /**
     * Prueba el método sumarAcumulado para valores válidos y casos de desbordamiento.
     */
    @Test
    void sumarAcumulado() {
        // Inicialmente, el acumulado debe ser 0.
        assertEquals(0, suma.getValorAcumulado());

        // Suma valores y verifica el acumulado.
        assertEquals(5, suma.sumarAcumulado(5));
        assertEquals(7, suma.sumarAcumulado(2));

        // Prueba desbordamiento: al sumar un valor grande que produce Infinity en el acumulado
        assertThrows(ArithmeticException.class, () -> {
            suma.sumarAcumulado(Double.MAX_VALUE);
        });
    }
}
