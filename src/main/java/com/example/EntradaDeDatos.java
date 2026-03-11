package com.example;

import java.util.Scanner;

public class EntradaDeDatos {

    private static final Scanner scanner = new Scanner(System.in);

    public static void leerVariosTipos() {
        System.out.print("Ingresa el nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("¿Qué cantidad deseas? ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingresa el valor por unidad: ");
        double precio = scanner.nextDouble();

        // Consumir salto de línea pendiente
        scanner.nextLine();

        double total = cantidad * precio;

        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Total: " + total + "\n");
    }

    public static void manejarSaltoDeLineaPendiente() {
        System.out.print("Ingrese su clase: ");
        String texto = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Consumir salto de línea pendiente
        scanner.nextLine();

        System.out.print("Ingrese su día de cumpleaños: ");
        String diaCumple = scanner.nextLine();

        System.out.println("\n=== DATOS INGRESADOS ===");
        System.out.println("Clase: " + texto);
        System.out.println("Edad: " + edad);
        System.out.println("Día de cumpleaños: " + diaCumple);
    }
}