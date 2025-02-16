package org.example;

/**
 * <h1>Elaboración Clase Producto</h1>
 * <pre>
 * Esta clase implementa los métodos relacionados con la multiplicación de la actividad.
 * Los métodos que se han incluido son: multiplicar dos números reales, dos números enteros,
 * tres números y cálculo de la potencia.
 *
 * </pre>
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 * Producto producto = new Producto();
 * producto.multiplicar(4, 6)
 * System.out.println("4 x 6= " + producto)
 * }</pre>
 *
 * @author Manuel Marcote Codesido
 * @version 1.0
 * @see
 */

public class Producto {

    private int multiplicacion;

    /**
     * Calcula el producto de dos números reales
     *
     * @param multiplicando primer número real
     * @param multiplicador segundo número real
     * @return el producto multiplicador y multiplicando
     * @throws IllegalArgumentException si alguno de los números es negativo
     */
    public static double multiplicar(double multiplicando, double multiplicador) {
        if (multiplicando < 0 || multiplicador < 0) {
            throw new IllegalArgumentException("No se permiten números negativos en esta calculadora");
        }
        return multiplicando * multiplicador;
    }

    /**
     * Calcula el producto de dos números enteros
     *
     * @param multiplicando primer número entero
     * @param multiplicador segundo número entero
     * @return el producto de el primer y segundo número entero
     * @throws IllegalArgumentException si alguno de los números es negativo
     * @throws ArithmeticException si el valor máximo de int se sobrepasa
     */
    public static int multiplicar(int multiplicando, int multiplicador) {
        if (multiplicando < 0 || multiplicador < 0)
            throw new IllegalArgumentException("No se permiten números negativos");

        long multiplicacion = (long) multiplicando * (long) multiplicador; //casting para verificación

        if(multiplicacion > Integer.MAX_VALUE)
            throw new ArithmeticException("Valor de int sobrepasado: multiplicación inválida");

        return (int) multiplicacion; //casting a int posible, devuelve el resultado
    }

    /**
     * Calcula el producto de tres números reales
     *
     * @param multiplicando primer número real
     * @param multiplicador1 segundo número real
     * @param multiplicador2 tercer número real
     * @return producto de los factores de la multiplicación
     * @throws IllegalArgumentException si alguno de los números es negativo
     */
    public static double multiplicar(double multiplicando, double multiplicador1, double multiplicador2) {
        if(multiplicando < 0 || multiplicador1 < 0 || multiplicador2 < 0)
            throw new IllegalArgumentException("No se permiten números negativos");

        return multiplicando * multiplicador1 * multiplicador2;
    }

    /**
     * Calcula la potencia con base y exponente
     *
     * @param base base de la potencia
     * @param exponente exponente al que se elevará la base
     * @return resultado de la potencia
     * @throws IllegalArgumentException Si la base o el exponente son negativos
     */
    public static double potencia(double base, double exponente) {
        if(base < 0 || exponente < 0)
           throw new IllegalArgumentException("No se permiten números negativos");

        return Math.pow(base, exponente);
    }
}