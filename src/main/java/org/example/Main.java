package org.example;

/**
 * Clase principal para probar la funcionalidad de la clase Suma.
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Suma
        Suma suma = new Suma();

        // ✅ Pruebas con números válidos
        System.out.println("Suma de 5 + 3 = " + suma.sumar(5, 3)); // Debe imprimir: Suma de 5 + 3 = 8
        System.out.println("Suma de 10 + 20 = " + suma.sumar(10, 20)); // Debe imprimir: Suma de 10 + 20 = 30

    }
}
