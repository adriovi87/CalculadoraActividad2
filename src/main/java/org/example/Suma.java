package org.example;

/**
 * Clase Suma que proporciona operaciones matemáticas básicas.
 * @author Adrián (aka adriovi87)
 * @version 1.1
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
    public int sumarEnteros(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos.");
        }
        return a + b;
    }

    /**
     * Suma dos números reales.
     *
     * @param a Primer número (debe ser positivo o cero).
     * @param b Segundo número (debe ser positivo o cero).
     * @return Resultado de la suma.
     * @throws IllegalArgumentException si alguno de los números es negativo.
     */
    public double sumarReales(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos.");
        }
        return a + b;
    }

    /**
     * Suma tres números reales.
     *
     * @param a Primer número (debe ser positivo o cero).
     * @param b Segundo número (debe ser positivo o cero).
     * @param c Tercer número (debe ser positivo o cero).
     * @return Resultado de la suma.
     * @throws IllegalArgumentException si alguno de los números es negativo.
     */
    public double sumarTresReales(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos.");
        }
        return a + b + c;
    }

    /**
     * Suma un valor al acumulado.
     *
     * @param valor Número a sumar al acumulado (debe ser positivo o cero).
     * @return El nuevo valor acumulado.
     * @throws IllegalArgumentException si el número es negativo.
     */
    private double valorAcumulado = 0;

    public double sumarAcumulado(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        valorAcumulado += valor;
        return valorAcumulado;
    }

    /**
     * Calcula el valor acumulado.
     *
     * @return El valor acumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }
}
