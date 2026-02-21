package com.example;

public class Operadores {

    public static void demostrarOperadoresAritmeticos() {
        int a = 10;
        int b = 5;

        System.out.println("OPERADORES ARITMÉTICOS");
        System.out.println();
        System.out.println("Suma : " + (a + b));
                System.err.println();

        System.out.println("Resta : " + (a - b));
                System.err.println();

        System.out.println("Multiplicación : " + (a * b));
                System.err.println();

        System.out.println("División : " + (a / b));
                System.err.println();

        System.out.println("Módulo : " + (a % b));
                System.err.println();

        System.out.println();
    }

    public static void demostracionIncrementoDecremento() {
        int x = 5;

        System.out.println("INCREMENTO Y DECREMENTO");
        System.out.println();
        System.out.println("Valor inicial de x : " + x);
        System.err.println();
        System.out.println("x++ (post-incremento) : " + (x++));
         System.err.println();

        System.out.println("Valor de x después de post-incremento : " + x);
                System.err.println();

        System.out.println("++x (pre-incremento) : " + (++x));
                System.err.println();

        System.out.println("Valor de x después de pre-incremento : " + x);
                System.err.println();

        System.out.println("x-- (post-decremento) : " + (x--));
                System.err.println();

        System.out.println("Valor de x después de post-decremento : " + x);
                System.err.println();

        System.out.println("--x (pre-decremento) : " + (--x));
                System.err.println();

        System.out.println("Valor de x después de pre-decremento : " + x);
                System.err.println();

    }

    public static void demostrarRelacionales() {
        int a = 10;
        int b = 5;

        System.out.println("OPERADORES RELACIONALES");
        System.out.println();
        System.out.println("a == b -- es igual : " + (a == b));
        System.out.println("a != b -- es diferente : " + (a != b));
        System.out.println("a > b -- mayor que : " + (a > b));
        System.out.println("a < b -- menor que : " + (a < b));
        System.out.println("a >= b -- mayor o igual que : " + (a >= b));
        System.out.println("a <= b -- menor o igual que : " + (a <= b));
        System.out.println();
    }

    public static void demostrarOperadoresLogicos() {
        boolean x = true;
        boolean y = false;

        System.out.println("OPERADORES LÓGICOS");
        System.out.println();
        System.out.println("x && y -- AND lógico : " + (x && y));
        System.out.println("x || y -- OR lógico : " + (x || y));
        System.out.println("!x -- NOT lógico : " + (!x));
        System.out.println();
    }

    public static void demostrarAsignacionesCompuestas() {
        int a = 10;

        System.out.println("ASIGNACIONES COMPUESTAS");
        System.out.println();
        System.out.println("Valor inicial de a : " + a);
        a += 5; // a = a + 5
        System.out.println("Después de a += 5 : " + a);
        a -= 3; // a = a - 3
        System.out.println("Después de a -= 3 : " + a);
        a *= 2; // a = a * 2
        System.out.println("Después de a *= 2 : " + a);
        a /= 4; // a = a / 4
        System.out.println("Después de a /= 4 : " + a);
        System.out.println();
    }

    public static void demostrarOperadoresTernarios() {
        int a = 10;
        int b = 5;
        int max = (a > b) ? a : b;
        
        System.out.println("OPERADORES TERNARIOS");
        System.out.println();
        System.out.println("El valor máximo entre " + a + " y " + b + " es: " + max);
        System.out.println();
    }
}
