package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void leerVariosTipos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del producto: ");
        String nombre_producto = scanner.nextLine();

        System.out.print("Ingresa la cantidad: ");
        int numero = scanner.nextInt();

        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();

        System.out.println("El producto que buscas es: " + nombre_producto
            + ", la cantidad de productos son: " + numero
            + " y el precio de este producto es : " + precio);

        scanner.close();
    }

    // Resolver salto de linea con nextLine, nextInt, nextDouble
    public static void manejarSaltoDeLineaPendiente() {
        Scanner sc = new Scanner(System.in);

        // String (línea completa)
        System.out.print("Ingrese una frase: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        // double
        System.out.print("Ingrese un número decimal: ");
        double decimal = sc.nextDouble();

        System.out.println("Texto: " + texto);
        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);

        sc.close();
    }
}