package com.example;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDatos {

    private static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void leerVariosTipos() {
        System.out.print("Ingresa el nombre del producto: ");
        String nombre_producto = scanner.nextLine();
        System.out.print("Ingresa la cantidad: ");
        int numero = scanner.nextInt();
        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de linea pendiente

        System.out.println("El producto que buscas es: " + nombre_producto
                + ", la cantidad de productos son: " + numero + " y el precio de este producto es : " + precio);
    }

    // Resolver salto de linea con nextLine, nextInt, nextDouble
    public static void manejarSaltoDeLineaPendiente() {
        // String (línea completa)
        System.out.print("Ingrese una frase: ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        // double
        System.out.print("Ingrese un número decimal: ");
        double decimal = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de linea pendiente

        System.out.println("Texto: " + texto);
        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);
    }
}