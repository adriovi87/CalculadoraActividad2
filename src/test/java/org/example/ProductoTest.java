package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto();
    }
    @Test
    void multiplicarDosRealesExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> producto.multiplicar(10.0, -10.0));
        assertEquals("No se permiten números negativos", exception.getMessage());
    }

    @Test
    void testMultiplicarDosReales() {
        double resultado = producto.multiplicar(10.0, 10.0);
        assertEquals(100.0, resultado);
    }

    @Test
    void testMultiplicarDosEnterosExcepcionArgumento() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> producto.multiplicar(10, -10));
        assertEquals("No se permiten números negativos", exception.getMessage());
    }

    @Test
    void testMultiplicarDosEnterosExcepcionAritmetica() {
        Exception excepcion = assertThrows(ArithmeticException.class, () -> producto.multiplicar(1000000, 100000));
        assertEquals("Valor de int sobrepasado: multiplicación inválida", excepcion.getMessage());
    }

    @Test
    void testMultiplicarDosEnteros() {
        int resultado = producto.multiplicar(10, 10);
        assertEquals(100, resultado);
    }

    @Test
    void testMultiplicarTresRealesExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> producto.multiplicar(10.0, -10.0, 10.0));
        assertEquals("No se permiten números negativos", exception.getMessage());
    }

    @Test
    void testMultiplicarTresReales() {
        double resultado = producto.multiplicar(10.0, 10.0, 10.0);
        assertEquals(1000.0, resultado);
    }

    @Test
    void testPotenciaExcepcion() {
        Exception excepcion = assertThrows(IllegalArgumentException.class, () -> producto.potencia(10.0, -10.0));
        assertEquals("No se permiten números negativos", excepcion.getMessage());
    }

    @Test
    void testPotencia() {
        double resultado = producto.potencia(10.0, 10.0);
        assertEquals(10000000000.0, resultado);
    }


}