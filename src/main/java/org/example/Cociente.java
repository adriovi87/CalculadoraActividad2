package org.example;
/**
 * Clase Cociente - Operaciones de division para la calculadora de la Actividad2
 *
 * @author PabloGarrido
 * @version 1.0
 */

public class Cociente {

    /**
     * Division entre dos números reales
     *
     * @param a es el dividendo
     * @param b es el divisor (no puede ser 0)
     * @return el resultado de la division
     * @throws ArithmeticException excepcion si b es 0
     */

    public double dividirReales(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }

    /**
     * Division de dos números enteros
     *
     * @param a es el dividendo
     * @param b es el divisor (no puede ser 0)
     * @return el resultado de la division
     * @throws ArithmeticException excepcion si b es 0
     */

    public int dividirEnteros(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }

    /**
     * Inverso de un numero
     *
     * @param a es el numero que queremos invertir (no puede ser 0)
     * @return el inverso del número
     * @throws ArithmeticException excepcion si a es 0
     */

    public double invertir(double a) {
        if (a == 0) {
            throw new ArithmeticException("No se puede invertir el numero 0");
        }
        return 1 / a;
    }

    /**
     * Calculo de la raiz cuadrada de un numero
     *
     * @param a es el numero al que le queremos sacar la raiz cuadrada (no puede ser negativo)
     * @return la raiz cuadrada
     * @throws ArithmeticException excepcion si a es negativo
     */
    public double raiz(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede sacar la raiz cuadrada de un numero negativo");
        }
        return Math.sqrt(a);

    }
}