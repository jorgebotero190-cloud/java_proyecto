package com.example;

public class ConversionDeTipos {

    // Ejemplo de widening conversion (casting implícito)
    public static void demostrarCastingImplicito() {
        int numeroEntero = 100;
        double numeroDouble = numeroEntero; // Conversión automática

        System.out.println("=== CASTING IMPLÍCITO ===");
        System.out.println("int original = " + numeroEntero);
        System.out.println("Convertido a double sin casting = " + numeroDouble);
        System.out.println("No se pierde información.\n");
    }

    // Ejemplo de narrowing conversion (casting explícito)
    public static void demostrarCastingExplicito() {
        double numeroDouble = 9.78;
        int numeroEntero = (int) numeroDouble; // Casting explícito

        System.out.println("=== CASTING EXPLÍCITO ===");
        System.out.println("double original = " + numeroDouble);
        System.out.println("Convertido a int con casting = " + numeroEntero);
        System.out.println("Se pierde la parte decimal.\n");
    }

    // Ejemplo donde el casting puede causar pérdida de precisión
    public static void demostrarProblemasDePrecision() {
        int numeroGrande = 130;
        byte numeroByte = (byte) numeroGrande; // Overflow

        double valorPreciso = 12345.6789;
        float valorMenosPreciso = (float) valorPreciso; // Pérdida de precisión

        System.out.println("=== PROBLEMAS DE PRECISIÓN EN CASTING ===");
        System.out.println("int original (130) convertido a byte = " + numeroByte);
        System.out.println("Rango del byte = -128 a 127 → Se produce desbordamiento (overflow).\n");

        System.out.println("double original = " + valorPreciso);
        System.out.println("Convertido a float = " + valorMenosPreciso);
        System.out.println("Puede haber pérdida de precisión decimal.\n");
    }
}