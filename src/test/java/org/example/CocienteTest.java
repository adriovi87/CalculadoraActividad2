package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {

    private Cociente cociente;

    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }


    @Test
    void dividirRealesPositivos() {
        cociente.dividirReales(7, 2);
        assertEquals(3.5, cociente.dividirReales(7, 2));
    }

    @Test
    void dividirRealesNegativos() {
        cociente.dividirReales(-7, -2);
        assertEquals(3.5, cociente.dividirReales(-7, -2));
    }

    @Test
    void dividirRealesDiferentesSignos() {
        cociente.dividirReales(7, -2);
        assertEquals(-3.5, cociente.dividirReales(7, -2));
    }


    @Test
    void dividirEnterosPostivos() {
        cociente.dividirEnteros(10, 2);
        assertEquals(5, cociente.dividirEnteros(10, 2));
    }

    @Test
    void dividirEnterosNegativos() {
        cociente.dividirEnteros(-10, -2);
        assertEquals(5, cociente.dividirEnteros(-10, -2));
    }

    @Test
    void dividirEnterosDiferentesSignos() {
        cociente.dividirEnteros(-10, 2);
        assertEquals(-5, cociente.dividirEnteros(-10, 2));
    }


    @Test
    void invertirPositivo() {
        cociente.invertir(10);
        assertEquals(0.1, cociente.invertir(10));
    }

    @Test
    void invertirNegativo() {
        cociente.invertir(-10);
        assertEquals(-0.1, cociente.invertir(-10));
    }


    @Test
    void raiz() {
        cociente.raiz(16);
        assertEquals(4, cociente.raiz(16));
    }
}