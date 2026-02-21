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
            + " y el precio de este es: " + precio);

        scanner.close();
    }
}
