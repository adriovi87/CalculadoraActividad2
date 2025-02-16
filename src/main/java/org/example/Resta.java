package org.example;

/**
 * Clase que proporciona métodos para hacer operaciones restando
 * @author Marta Guillén
 * @version 1.0
 *
 */

public class Resta {

     //Atributo para almacenar el valor acumulado de la resta

    private double valorAcumulado = 0; // del atributo 4.

    /**
     * Resta de dos números reales
     * @param a Número real al que se le resta
     * @param b Número real que restamos
     * @return El resultado de la resta de a - b
     */
    public double restarReales(double a, double b) {
        double resultado = a - b;
        return resultado;
    }

    /**
     * Resta de dos números enteros
     * @param a Número entero al que se le resta
     * @param b Número entero que restamos
     * @return El resultado de la resta de a - b
     */
    public int restarEnteros(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    /**
     * Resta de tres números reales
     * @param a Primer número real
     * @param b Segundo número real
     * @param c Tercer número real
     * @return El resultado de la resta de a - b - c
     */
    public double restaTresReales(double a, double b, double c) {
        double resultado = a-b-c;
        return resultado;
    }

    /**
     * Realizar una resta acumulada
     * @param numero que va a restar el valor acumulado
     */

    public void restarAcumulado(double numero) {
        this.valorAcumulado -= numero;
    }

    /**
     * Obtener el valor acumulado al momento
     * @return El valor acumulado de las restas
     */
    public double resultadoValorAcumulado() {
        return this.valorAcumulado;
    }



}
