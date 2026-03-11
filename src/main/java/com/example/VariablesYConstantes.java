package com.example;

public class VariablesYConstantes {

    public static void demostrarConvencionesNombres() {
        System.out.println("=== CONVENCIONES DE NOMBRES ===");

        // Ejemplos de nombres de variables en camelCase
        int numero = 10;
        double precio = 19.99;
        String texto = "Esta es una prueba de conocimiento";
        boolean esVerdadero = true;

        // Imprimir los valores
        System.out.println("Número = " + numero);
        System.out.println("Precio = " + precio);
        System.out.println("Texto = " + texto);
        System.out.println("¿Es verdadero? " + esVerdadero + "\n");
    }

    public static void demostracionDeclaracionAsignacion() {
        System.out.println("=== DECLARACIÓN Y ASIGNACIÓN ===");

        // Declaración y asignación de variables
        int edad = 25;
        String nombre = "Jorge";
        boolean esEstudiante = true;

        // Imprimir los valores
        System.out.println("Tienes " + edad + " años de edad");
        System.out.println("Tu nombre es " + nombre + " y eres bienvenido");
        System.out.println("¿Es estudiante? " + esEstudiante + "\n");
    }

    public static void demostracionConstantes() {
        System.out.println("=== CONSTANTES ===");

        // Uso de la palabra reservada final
        final double PI = 3.14159;
        final String MENSAJE = "Constantes en Java";

        System.out.println("El valor de PI es = " + PI);
        System.out.println("Mensaje constante = " + MENSAJE);
        System.out.println("Nota: Las constantes se escriben en MAYÚSCULAS con guiones bajos.\n");
    }
}