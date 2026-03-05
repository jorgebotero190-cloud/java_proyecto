package com.example;

public class ArreglosBidimensionales {

    public static void declararCrearMatrices() {
        int[][] matriz1 = new int[3][3];
        matriz1[0][0] = 9;
        matriz1[1][1] = 7;
        System.out.println("Valor en matriz1[0][0]: " + matriz1[0][0]);
        System.out.println("Valor en matriz1[0][1]: " + matriz1[0][1]);
    }

    public static void recorrerMatriz() {
        int[][] matriz2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Recorriendo la matriz:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejemploUsosTipicos() {
        int[][] matriz3 = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int[][] matriz4 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] suma = new int[3][4];

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                suma[i][j] = matriz3[i][j] + matriz4[i][j];
            }
        }
        System.out.println("Suma de todos los elementos en matriz3: ");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
    }


