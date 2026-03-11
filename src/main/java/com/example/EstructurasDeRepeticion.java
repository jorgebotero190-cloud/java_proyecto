package com.example;

public class EstructurasDeRepeticion {

    public static void ejemplosWhile() {
        System.out.println("=== WHILE ===");
        int i = 0;
        while (i < 5) {
            System.out.println("El valor de i es: " + i);
            i++;
        }
        System.out.println();
    }

    public static void ejemplosDoWhile() {
        System.out.println("=== DO-WHILE ===");
        int i = 1;
        do {
            System.out.println("El valor de i es: " + i);
            i++;
        } while (i < 5);
        System.out.println();
    }

    public static void ejemplosForClasico() {
        System.out.println("=== FOR CLÁSICO ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("El valor de i es: " + i);
        }
        System.out.println();
    }

    public static void ejemplosForAnidado() {
        System.out.println("=== FOR ANIDADO ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println();
    }

    public static void ejemplosBreakContinue() {
        System.out.println("=== BREAK ===");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Se encontró i = 5, se rompe el bucle.");
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== CONTINUE ===");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Se encontró i = 5, se salta esta iteración.");
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println();
    }

    public static void ejemplosEtiquetas() {
        System.out.println("=== ETIQUETAS ===");
        externo:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("Se encontró i=1 y j=1, se rompe el bucle externo.");
                    break externo;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println();
    }
}