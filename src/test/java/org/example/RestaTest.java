package org.example;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        //nueva resta antes de cada prueba
        Resta resta = new Resta();
    }

    /**
     * Probamos el método restarReales con valores válidos y negativos
     */
    @org.junit.jupiter.api.Test
    void restarReales() {
        //pruebas correctas
        assertEquals(1.0,Resta.restarReales(11.0,10.0), "La resta entre 11.0 y 10.0 es 1 ");
        assertEquals(15.0,Resta.restarReales(25.2,10.2), "La resta entre 25.2 y 10.2 es 15.0 ");
        //pruebas incorrectas
        assertThrows(IllegalArgumentException.class, () -> {
            Resta.restarReales(-4.0,-5.8);
        }, "Debe lanzar IllegalArgumentException para números negativos");

    }
    /**
     * Probamos el método restarEnteros con valores válidos y negativos
     */
    @org.junit.jupiter.api.Test
    void restarEnteros() {
        //pruebas correctas
        assertEquals(2,Resta.restarEnteros(12,10), "La resta entre 12 y 10 es 2");
        assertEquals(15,Resta.restarEnteros(30,15), "La resta entre 30 y 15 es 15");
        //pruebas incorrectas
        assertThrows(IllegalArgumentException.class, () -> {
            Resta.restarEnteros(-2,-8);
        }, "Debe lanzar IllegalArgumentException para números negativos");
    }
    /**
     * Probamos el método restaTresReales con valores válidos y negativos
     */
    @org.junit.jupiter.api.Test
    void restaTresReales() {
        //prueba correcta
        assertEquals(1,Resta.restaTresReales(12,10,1), "La resta entre 12, 10 y 1 es 1");
        assertEquals(10,Resta.restaTresReales(30,15,5), "La resta entre 30, 15 y 5 es 10");
        //pruebas incorrectas
        assertThrows(IllegalArgumentException.class, () -> {
            Resta.restaTresReales(-2,-8, -1);
        }, "Debe lanzar IllegalArgumentException para números negativos");
    }

    @org.junit.jupiter.api.Test
    void restarAcumulado() {
        //inicialmente es 0
        assertEquals(0,Resta.restarAcumulado(0), "Inicialmente el valor es 0");
        //resta de valores verificando el acumulado
        assertEquals(-5, Resta.restarAcumulado(5), "El acumulado es -5");
        assertEquals(-7, Resta.restarAcumulado(2), "El acumulado es -2");
        //restamos negativos
        assertThrows(IllegalArgumentException.class, () -> {
            Resta.restarAcumulado(-2);
        }, "Debe lanzar IllegalArgumentException para números negativos");
    }
}