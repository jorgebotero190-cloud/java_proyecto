package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        // Primera forma: declarar y luego asignar
        int[] numeros;
        numeros = new int[8];
        System.out.println("Arreglo numeros creado con " + numeros.length + " elementos");

        // Asignar valores manualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println("Valores asignados en 'numeros':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // Segunda manera: declarar y crear en la misma línea
        int[] num1 = new int[3];
        num1[0] = 5;
        num1[1] = 15;
        num1[2] = 25;
        System.out.println("\nArreglo num1 creado con " + num1.length + " elementos");
        for (int valor : num1) {
            System.out.println("Valor: " + valor);
        }

        // Tercera manera: declarar y crear con valores iniciales
        int[] num = {1, 2, 34, 45, 234};
        System.out.println("\nArreglo num creado con " + num.length + " elementos");
        for (int valor : num) {
            System.out.println("Valor: " + valor);
        }
    }
}