package com.example;

public class VariablesYConstantes {
    public static void demostrarConvencionesNombres() {
        // muestra ejemplos de nombres de variables en camelCase
        int numero;
        double precio;
        String texto;
        boolean esVerdadero;

        // Asignación de valores
        numero = 10;
        precio = 19.99;
        texto = "Esta es una prueba de conocimiento";
        esVerdadero = true;
        // Imprimir los valores
        System.out.println("Número = " + numero);
        System.out.println("Precio = " + precio);
        System.out.println("Texto = " + texto);
        System.out.println("¿Es verdadero? " + esVerdadero);
    }

    public static void demostracionDeclaracionAsignacion() {
        // Declaración de variables de diferentes tipos
        int edad;
        String nombre;
        boolean esEstudiante;
        // Asignación de valores a las variables
        edad = 25;
        nombre = "Jorge";
        esEstudiante = true;
        // Imprimir los valores de las variables
        System.out.println("tienes=" + edad + " años de edad");
        System.out.println(" Tu Nombre  es = " + nombre + " y eres bienvenido");
        System.out.println("¿Es estudiante? " + esEstudiante);
    }

    public static void demostracionConstantes() {
        // usa la palabra reservada final para declarar una constante
        final double PI = 3.14159;
        System.out.println("El valor de PI es =  " + PI);
    }
}
