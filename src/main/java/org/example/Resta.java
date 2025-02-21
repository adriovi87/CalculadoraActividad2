package org.example;

/**
 * Clase que proporciona métodos para hacer operaciones restando
 * @author Marta Guillén
 * @version 1.0
 *
 */

public class Resta {

     //Atributo para almacenar el valor acumulado de la resta
    private static double valorAcumulado = 0; // del atributo 4.

    /**
     * Resta de dos números reales
     * @param a Número real al que se le resta
     * @param b Número real que restamos
     * @return El resultado de la resta de a - b
     * @throws IllegalArgumentException si alguno de los números es negativo
     */
    public static double restarReales(double a, double b) {
        if (a<0 || b<0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }
        return a-b;
    }

    /**
     * Resta de dos números enteros
     * @param a Número entero al que se le resta
     * @param b Número entero que restamos
     * @return El resultado de la resta de a - b
     */
    public static int restarEnteros(int a, int b) {
        if (a<0 || b<0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }
        return a-b;
    }

    /**
     * Resta de tres números reales
     * @param a Primer número real
     * @param b Segundo número real
     * @param c Tercer número real
     * @return El resultado de la resta de a - b - c
     */
    public static double restaTresReales(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Los números no pueden ser negativos");
        }
        return a - b - c;
    }

    /**
     * Realizar una resta acumulada
     * @param numero que va a restar el valor acumulado
     */

    public static double restarAcumulado(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número inicial no puede ser negativo");
        }
        valorAcumulado -= numero;
        return valorAcumulado;
    }

    /**
     * Obtener el valor acumulado al momento
     * @return El valor acumulado de las restas
     */
    public double resultadoValorAcumulado() {
        return valorAcumulado;
        }
    }


