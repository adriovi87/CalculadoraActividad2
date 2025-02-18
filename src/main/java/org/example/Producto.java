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
 * @see Main
 */

public class Producto {

    /**
     * Calcula el producto de dos números reales
     *
     * @param multiplicando primer número real
     * @param multiplicador segundo número real
     * @return el producto multiplicador y multiplicando
     */
    public double multiplicar(double multiplicando, double multiplicador) {
        return multiplicando * multiplicador;
    }

    /**
     * Calcula el producto de dos números enteros
     *
     * @param multiplicando primer número entero
     * @param multiplicador segundo número entero
     * @return el producto de el primer y segundo número entero
     * @throws ArithmeticException si el valor máximo de int se sobrepasa
     */
    public int multiplicar(int multiplicando, int multiplicador) {
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
     */
    public double multiplicar(double multiplicando, double multiplicador1, double multiplicador2) {
        return multiplicando * multiplicador1 * multiplicador2;
    }

    /**
     * Calcula la potencia con base y exponente
     *
     * @param base base de la potencia
     * @param exponente exponente al que se elevará la base
     * @return resultado de la potencia
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}