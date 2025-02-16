package org.example;

/**
 * Clase Calculadora que proporciona operaciones matemáticas básicas.
 */
public class Suma {

    /**
     * Suma dos números enteros.
     *
     * @param a Primer número (debe ser positivo o cero).
     * @param b Segundo número (debe ser positivo o cero).
     * @return Resultado de la suma.
     * @throws IllegalArgumentException si alguno de los números es negativo.
     */
    public int sumar(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos.");
        }
        return a + b;
    }
}
