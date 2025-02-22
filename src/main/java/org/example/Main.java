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
 * @author Adrián Araujo González  (GitHub: adriovi87)
 * @author Pablo Garrido López (GitHub: Pablo-Garridolop)
 * @author Manuel Marcote Codesido (GitHub: ManuelMarcoteC)
 * @author Marta Guillén Escudero (GitHub: mge1905)
 * @version 1.2
 *
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
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
        int opcion1;

        do {
            System.out.println("\n=== Menu Suma ===");
            System.out.println("1. Suma de dos numeros reales");
            System.out.println("2. Suma de dos numeros enteros");
            System.out.println("3. Suma de tres numeros reales");
            System.out.println("4. Suma de números acumulados");
            System.out.println("5. Volver al menu de calculadora");
            System.out.print("\nMarque el número de una de las opciones para calcular una suma: ");
            opcion1 = scanner.nextInt();

            switch (opcion1) {

                case 1: {
                    System.out.print("\nIndique el primer número real: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Indique el segundo número real: ");
                    double num2 = scanner.nextDouble();

                    Suma suma = new Suma();
                    double resultado = suma.sumarReales(num1, num2);
                    System.out.println("El resultado es: " + resultado);

                    break;
                }

                case 2: {
                    System.out.print("\nIndique el primer número entero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Indique el segundo número entero: ");
                    int num2 = scanner.nextInt();

                    Suma suma = new Suma();
                    int resultado = suma.sumarEnteros(num1, num2);
                    System.out.println("El resultado es: " + resultado);

                    break;
                }

                case 3: {
                    System.out.print("\nIndique el primer número real: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Indique el segundo número real: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Indique el tercer número real: ");
                    double num3 = scanner.nextDouble();

                    Suma suma = new Suma();
                    double resultado = suma.sumarTresReales(num1, num2, num3);
                    System.out.println("El resultado es: " + resultado);

                    break;
                }

                case 4: {
                    System.out.print("\nIndique el primer número a sumar: ");
                    double resultado = scanner.nextDouble();
                    double num2;

                    do {
                        System.out.print("Indique el siguiente número a sumar (0 para terminar): ");
                        num2 = scanner.nextDouble();
                        if (num2 != 0) {
                            resultado += num2;
                        }
                    } while (num2 != 0);
                    System.out.println("El resultado final es: " + resultado);

                    break;
                }

                case 5: {
                    break;
                }

                default: {
                    System.out.println("\nOpción no disponible.");
                    break;
                }
            }

        } while (opcion1 != 5);
    }

    private static void menuResta() {
        int opcion2;

        do {

            System.out.println("\n=== Menu Resta ===");
            System.out.println("1. Resta de dos numeros reales");
            System.out.println("2. Resta de dos numeros enteros");
            System.out.println("3. Resta de tres numeros reales");
            System.out.println("4. Resta de números acumulados");
            System.out.println("5. Volver al menu de calculadora");
            System.out.print("\nMarque el número de una de las opciones para " +
                    "calcular una resta: ");
            opcion2 = scanner.nextInt();

            switch (opcion2) {

                case 1: {
                    System.out.print("\nIndique el primer número real: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Indique el segundo número real: ");
                    double num2 = scanner.nextDouble();

                    Resta resta = new Resta();
                    double resultado = Resta.restarReales(num1, num2);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;
                }

                case 2: {
                    System.out.print("\nIndique el primer entero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Indique el segundo entero: ");
                    int num2 = scanner.nextInt();

                    Resta resta = new Resta();
                    int resultado = Resta.restarEnteros(num1, num2);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }

                case 3: {
                    System.out.print("\nIndique el primer real: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Indique el segundo real: ");
                    double num2 = scanner.nextDouble();
                    System.out.print("Indique el tercer real: ");
                    double num3 = scanner.nextDouble();

                    Resta resta = new Resta();
                    double resultado = Resta.restaTresReales(num1, num2, num3);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }

                case 4: {
                    System.out.print("\nIndique el primer número a restar: ");
                    double resultado = scanner.nextDouble();
                    double num2;

                    do {
                        System.out.print("Indique el siguiente número a restar (0 para terminar): ");
                        num2 = scanner.nextDouble();
                        if(num2 !=0){
                            resultado -= num2;
                        }
                    } while (num2 !=0);
                    System.out.println("El resultado final es: " + resultado);

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

        } while (opcion2 != 5);
    }

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

        int opcion4;

        do {

            System.out.println("\n=== Menu Cociente ===");
            System.out.println("1. Division de dos numeros reales");
            System.out.println("2. Division de dos numeros enteros");
            System.out.println("3. Inverso de un numero real");
            System.out.println("4. Raiz cuadrada de un numero real no negativo");
            System.out.println("5. Volver al menu de calculadora");
            System.out.print("\nMarque el numero de una de las opciones para " +
                    "calcular un producto: ");
            opcion4 = scanner.nextInt();

            switch (opcion4) {

                case 1: {
                    System.out.print("\nIndique el dividendo real: ");
                    double dividendo = scanner.nextDouble();
                    System.out.print("Indique el multiplicador real: ");
                    double divisor = scanner.nextDouble();

                    Cociente cociente = new Cociente();
                    double resultado = cociente.dividirReales(dividendo, divisor);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;
                }

                case 2: {
                    System.out.print("\nIndique el dividendo entero: ");
                    int dividendo = scanner.nextInt();
                    System.out.print("Indique el divisor entero: ");
                    int divisor = scanner.nextInt();

                    Cociente cociente = new Cociente();
                    int resultado = cociente.dividirEnteros(dividendo, divisor);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }

                case 3: {
                    System.out.print("\nIndique el numero que queremos invertir: ");
                    double numero = scanner.nextDouble();


                    Cociente cociente = new Cociente();
                    double resultado = cociente.invertir(numero);
                    System.out.print("El resultado es: " + resultado + "\n");

                    break;

                }

                case 4: {
                    System.out.print("\nIndique la base de la raiz: ");
                    double baseRAiz = scanner.nextDouble();


                    Cociente cociente = new Cociente();
                    double resultado = cociente.raiz(baseRAiz);
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

        } while (opcion4 != 5);
    }

    /**
     * Constructor por defecto para la clase Main
     */
    public Main() {
    }

}
