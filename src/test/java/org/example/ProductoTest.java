package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias de la clase Producto
 *
 * <p>Ver <a href="https://github.com/adriovi87/CalculadoraActividad2">https://github.com/adriovi87/CalculadoraActividad2</a></p>
 *
 * <p>Pruebas unitarias que permiten evaluar el funcionamiento de
 * los métodos de la clase producto; tanto si se trata de números
 * negativos como si se excede el límite de capacidad que soportan
 * variables primitivas.</p>
 *
 * @author Manuel Marcote Codesido (GitHub: ManuelMarcoteC)
 * @version 1.0
 * @see Main
 * @see Producto
 */
class ProductoTest {

    /**
     * Constructor por defecto para la clase de test ProductoTest
     */
    public ProductoTest() {

    }


    /**
     * Creación de una variable de instancia previa a las pruebas unitarias
     */
    private Producto producto;

    /**
     * Generación de un objeto de la clase Producto antes de
     * cada prueba unitaria.
     */
    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    /**
     * Prueba del método de la multiplicación de dos números reales
     */
    @Test
    void testMultiplicarDosReales() {
        double resultado = producto.multiplicar(10.0, 10.0);
        assertEquals(100.0, resultado);
        double resultado2 = producto.multiplicar(10.0, -10.0);
        assertEquals(-100.0, resultado2); //test con reales negativos tras modificar Producto
    }

    /**
     * Prueba de la excepción del método de la multiplicación
     * de dos números enteros con longitud mayor a la soportada por int
     */
    @Test
    void testMultiplicarDosEnterosExcepcionAritmetica() {
        Exception excepcion = assertThrows(ArithmeticException.class,
                () -> producto.multiplicar(1000000, 100000));
        assertEquals("Valor de int sobrepasado: multiplicación inválida", excepcion.getMessage());
    }

    /**
     * Prueba del método de la multiplicación de dos números enteros
     */
    @Test
    void testMultiplicarDosEnteros() {
        int resultado = producto.multiplicar(10, 10);
        assertEquals(100, resultado);
        int resultado2 = producto.multiplicar(-10, 10);
        assertEquals(-100, resultado2); //test con enteros negativos tras modificar Producto
    }

    /**
     * Prueba del método de la multiplicación de tres números enteros
     */
    @Test
    void testMultiplicarTresReales() {
        double resultado = producto.multiplicar(10.0, 10.0, 10.0);
        assertEquals(1000.0, resultado);
        double resultado2 = producto.multiplicar(-10.0, -10.0, 10.0);
        assertEquals(1000.0, resultado2); //test con reales negativos tras modificar Producto
    }

    /**
     * Prueba del método de la potencia
     */
    @Test
    void testPotencia() {
        double resultado = producto.potencia(10.0, 10.0);
        assertEquals(10000000000.0, resultado);
        double resultado2 = producto.potencia(10.0, -10.0);
        assertEquals(0.0000000001, resultado2); //test con reales negativos tras modificar Producto
    }
}