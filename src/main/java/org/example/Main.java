package org.example;

import java.util.Scanner;
/**
 * Menú funcional de calculadora
 * <p>Ver <a href="https://github.com/adriovi87/CalculadoraActividad2">https://github.com/adriovi87/CalculadoraActividad2</a></p>
 * <p>Desde esta clase se permite lanzar una calculadora funcional desde
 * consola que permite realizar las siguientes operaciones: </p>
 * <ul>
 *  <li>Suma</li>
 *  <li>Resta</li>
 *  <li>Multiplicación</li>
 *  <li>División</li>
 * </ul>
 *
 * @author Manuel Marcote Codesido (GitHub: ManuelMarcoteC)
 * @version 1.0
 *
 * //@see Suma
 * //@see Resta
 * @see Producto
 * //@see Cociente
 */
public class Main {
    /**
     * Implementación de un scanner como instancia de clase debido
     * a su uso recursivo
     */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Inicialización de la calculadora
     * @param args Menú de la calculadora con sus diferentes operaciones
     */
    public static void main(String[] args) {
        menuCalculadora();
        scanner.close();
    }

    /**
     * Muestra el menú principal de la calculadora y gestiona la selección de opciones.
     * <p>
     * El menú permite elegir entre operaciones de suma, resta, producto y cociente,
     * o salir de la aplicación. Se utiliza un bucle {@code do-while} para que el menú
     * se muestre repetidamente hasta que se elija la opción de salir.
     * </p>
     */
    private static void menuCalculadora() {
        int opcion;

        do {
            System.out.println("\n=== Menu de calculadora ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. Cociente");
            System.out.println("0. Salir");
            System.out.print("\nMarque el numero de una de las opciones: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    menuSuma();
                    break;

                case 2:
                    menuResta();
                    break;

                case 3:
                    menuProducto();
                    break;

                case 4:
                    menuCociente();
                    break;

                case 0:
                    System.out.println("\n=== HASTA LA PROXIMA ===");
                    break;

                default:
                    System.out.println("\nOPCION NO DISPONIBLE");
                    break;
            }
        } while (opcion != 0);


    }

    private static void menuSuma() {

    }

    private static void menuResta() {

    }

    /**
     * Muestra el menú de producto y gestiona las operaciones relacionadas.
     * <p>
     * El menú de producto ofrece las siguientes opciones:
     * </p>
     *
     * <ul>
     *   <li>Producto de dos números reales.</li>
     *   <li>Producto de dos números enteros.</li>
     *   <li>Producto de tres números reales.</li>
     *   <li>Cálculo de una potencia.</li>
     *   <li>Volver al menú principal.</li>
     * </ul>
     *
     *
     * <p>
     * Se utiliza un bucle para repetir el menú hasta que se elija la opción de volver
     * al menú principal
     * </p>
     *
     */
    private static void menuProducto() {

        int opcion3;

        do {

            System.out.println("\n=== Menu Producto ===");
            System.out.println("1. Producto de dos numeros reales");
            System.out.println("2. Producto de dos numeros enteros");
            System.out.println("3. Producto de tres numeros reales");
            System.out.println("4. Potencia");
            System.out.println("5. Volver al menu de calculadora");
            System.out.print("\nMarque el numero de una de las opciones para " +
                    "calcular un producto: ");
            opcion3 = scanner.nextInt();

            switch (opcion3) {

                case 1: {
                    System.out.print("\nIndique el multiplicando real: ");
                    double multiplicando = scanner.nextDouble();
                    System.out.print("Indique el multiplicador real: ");
                    double multiplicador = scanner.nextDouble();

                    Producto producto = new Producto();
                    double resultado = producto.multiplicar(multiplicando, multiplicador);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;
                }

                case 2: {
                    System.out.print("\nIndique el multiplicando entero: ");
                    int multiplicando = scanner.nextInt();
                    System.out.print("Indique el multiplicador entero: ");
                    int multiplicador = scanner.nextInt();

                    Producto producto = new Producto();
                    int resultado = producto.multiplicar(multiplicando, multiplicador);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }

                case 3: {
                    System.out.print("\nIndique el multiplicando real: ");
                    double multiplicando = scanner.nextDouble();
                    System.out.print("Indique el primer multiplicador real: ");
                    double multiplicador1 = scanner.nextDouble();
                    System.out.print("Indique el segundo multiplicador real: ");
                    double multiplicador2 = scanner.nextDouble();

                    Producto producto = new Producto();
                    double resultado = producto.multiplicar(multiplicando, multiplicador1, multiplicador2);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }

                case 4: {
                    System.out.print("\nIndique la base real: ");
                    double base = scanner.nextDouble();
                    System.out.print("Indique el exponente real: ");
                    double exponente = scanner.nextDouble();

                    Producto producto = new Producto();
                    double resultado = producto.potencia(base, exponente);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }
                case 5: {
                    break;
                }

                default: {
                    System.out.print("\nNO EXISTE ESE CALCULO\n");
                    break;

                }
            }

        } while (opcion3 != 5);



    }

    private static void menuCociente() {


    }

    /**
     * Constructor por defecto para la clase Main
     */
    public Main() {
    }

}
