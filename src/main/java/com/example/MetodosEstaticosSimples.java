package com.example;

public class MetodosEstaticosSimples {

    // Un método estático simple sin parámetros ni retorno y cómo llamarlo
    public static void ejemploDeclaracionLlamada() {
        System.out.println("Este es el método sin parámetros.");
    }

    // Un método estático con parámetros
    public static void ejemploPasoDeParametros(String nombre) {
        System.out.println("Su nombre: " + nombre);
    }

    // Alias para mantener compatibilidad con llamadas existentes (si las hay)
    public static void ejemploPasoParametros(String nombre) {
        ejemploPasoDeParametros(nombre);
    }

    // Métodos estáticos con retorno (sobrecarga)
    public static int ejemploRetornoValores(int a, int b) {
        return a + b;
    }

    public static double ejemploRetornoValores(double a, double b) {
        return a + b;
    }
}
