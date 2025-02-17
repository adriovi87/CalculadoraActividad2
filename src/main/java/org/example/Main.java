package org.example;

/**
 * Clase principal para probar la funcionalidad de la clase Suma.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Suma
        Suma suma = new Suma();

        // Pruebas con números enteros
        System.out.println("Suma de 10 + 2 = " + suma.sumarEnteros(10, 2)); // Debe imprimir: 12
        System.out.println("Suma de 20 + 5 = " + suma.sumarEnteros(20, 5)); // Debe imprimir: 25

        // Pruebas con números reales
        System.out.println("Suma de 1.2 + 2.3 = " + suma.sumarReales(1.2, 2.3)); // Debe imprimir: 3.5

        // Pruebas con tres números reales
        System.out.println("Suma de 1.1 + 2.1 + 3.3 = " + suma.sumarTresReales(1.1, 2.1, 3.3)); // Debe imprimir: 6.5

        // Pruebas de la suma acumulada
        System.out.println("Valor acumulado inicial: " + suma.getValorAcumulado()); // 0.0
        System.out.println("Acumulado tras sumar 10: " + suma.sumarAcumulado(1)); // 1.0
        System.out.println("Acumulado tras sumar 5: " + suma.sumarAcumulado(2));   // 3.0
    }
}
