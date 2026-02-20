package com.example;

public class TiposDeDatosPrimitivos {

    public static void demostrarEnteros() {

    // Muestra ejemplos y rangos de byte, short, int, long

        byte numeroByte = 100;
        short numeroShort = 20000;
        int numeroInt = 1500000;
        long numeroLong = 9000000000L;

        System.out.println("===== TIPOS ENTEROS =====");
        System.out.println("byte: " + numeroByte + 
                " | Rango: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);

        System.out.println("short: " + numeroShort + 
                " | Rango: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);

        System.out.println("int: " + numeroInt + 
                " | Rango: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);

        System.out.println("long: " + numeroLong + 
                " | Rango: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);

        System.out.println();
    }

    // Muestra ejemplos de float y double
    public static void demostrarFlotantes() {

        float numeroFloat = 3.1416f;
        double numeroDouble = 3.14159265359;

        System.out.println("===== TIPOS FLOTANTES =====");
        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);

        System.out.println("Rango float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("Rango double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        System.out.println();
    }

    // Muestra ejemplos de char
    public static void demostrarCaracteres() {

        char letra = 'A';
        char numero = '5';
        char simbolo = '@';
        char unicode = '\u2764'; // Corazón

        System.out.println("===== TIPO CHAR =====");
        System.out.println("Letra: " + letra);
        System.out.println("Número como carácter: " + numero);
        System.out.println("Símbolo: " + simbolo);
        System.out.println("Unicode: " + unicode);

        System.out.println();
    }

    // Muestra ejemplos de boolean
    public static void demostrarBooleanos() {

        boolean esMayor = 10 > 5;
        boolean esIgual = (5 == 3);

        System.out.println("===== TIPO BOOLEANOS =====");
        System.out.println("¿10 es mayor que 5? " + esMayor);
        System.out.println("¿5 es igual a 3? " + esIgual);

        System.out.println();
    }

    // Explica valores por defecto (en contexto de instancia)
    static byte byteDefault;
    static short shortDefault;
    static int intDefault;
    static long longDefault;
    static float floatDefault;
    static double doubleDefault;
    static char charDefault;
    static boolean booleanDefault;

    public static void demostrarValoresPorDefecto() {

        System.out.println("===== VALORES POR DEFECTO =====");
        System.out.println("byte: " + byteDefault);
        System.out.println("short: " + shortDefault);
        System.out.println("int: " + intDefault);
        System.out.println("long: " + longDefault);
        System.out.println("float: " + floatDefault);
        System.out.println("double: " + doubleDefault);
        System.out.println("char (valor numérico): " + (int)charDefault);
        System.out.println("boolean: " + booleanDefault);

        System.out.println("\nNota: Los valores por defecto solo aplican a variables de instancia o estáticas.");
    }
}
