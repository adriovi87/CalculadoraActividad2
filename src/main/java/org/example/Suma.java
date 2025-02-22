package org.example;

/**
 * Clase Suma que proporciona operaciones matemáticas básicas,
 * controlando el desbordamiento.
 * @author Adrián
 * @version 1.2
 */
public class Suma {

    private double valorAcumulado = 0;

    /**
     * Suma dos números enteros con detección de desbordamiento.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la suma.
     * @throws ArithmeticException si la suma desborda el rango de int.
     */
    public int sumarEnteros(int a, int b) {
        // Verificación para desbordamiento positivo:
        if (a > 0 && b > Integer.MAX_VALUE - a) {
            throw new ArithmeticException("Desbordamiento positivo en la suma de enteros.");
        }
        // Verificación para desbordamiento negativo:
        if (a < 0 && b < Integer.MIN_VALUE - a) {
            throw new ArithmeticException("Desbordamiento negativo en la suma de enteros.");
        }
        return a + b;
    }

    /**
     * Suma de dos números reales controlando el desbordamiento.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la suma.
     * @throws ArithmeticException si el resultado es infinito.
     */
    public double sumarReales(double a, double b) {
        double resultado = a + b;
        if (Double.isInfinite(resultado)) {
            throw new ArithmeticException("Desbordamiento en la suma de números reales.");
        }
        return resultado;
    }

    /**
     * Suma tres números reales con detección de desbordamiento.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @return Resultado de la suma.
     * @throws ArithmeticException si el resultado es infinito.
     */
    public double sumarTresReales(double a, double b, double c) {
        double resultado = a + b + c;
        if (Double.isInfinite(resultado)) {
            throw new ArithmeticException("Desbordamiento en la suma de números reales.");
        }
        return resultado;
    }

    /**
     * Suma un valor al acumulado y lo retorna.
     *
     * @param valor Número a sumar al acumulado.
     * @return El valor acumulado.
     * @throws ArithmeticException para resultados infinitos.
     */
    public double sumarAcumulado(double valor) {
        double nuevoValor = valorAcumulado + valor;
        if (Double.isInfinite(nuevoValor)) {
            throw new ArithmeticException("Desbordamiento en el acumulado.");
        }
        valorAcumulado = nuevoValor;
        return valorAcumulado;
    }

    /**
     * Obtiene el valor acumulado.
     *
     * @return El valor acumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }
}
