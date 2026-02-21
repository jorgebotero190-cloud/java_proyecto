package com.example;



public class EstructurasCondicionales {

    public static void ejemplosIF() {
        int edad = 20;

        System.out.println("ESTRUCTURA IF");
        System.out.println();
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        System.out.println();
    }

    public static void ejemplosIfElse() {
        int numero = -5;

        System.out.println("ESTRUCTURA IF-ELSE");
        System.out.println();
        System.out.println("Número: " + numero);

        if (numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        System.out.println();
    }

    public static void ejemplosIfElseIf() {
        int nota = 75;

        System.out.println("ESTRUCTURA IF-ELSE IF-ELSE");
        System.out.println();
        System.out.println("Nota: " + nota);

        if (nota >= 90) {
            System.out.println("Calificación: Excelente");
        } else if (nota >= 70) {
            System.out.println("Calificación: Bueno");
        } else if (nota >= 60) {
            System.out.println("Calificación: Suficiente");
        } else {
            System.out.println("Calificación: Insuficiente");
        }
        System.out.println();
    }
    

    public static void ejemplosSwitch() {        
        int dia =3;

        System.out.println("ESTRUCTURA SWITCH");
        System.out.println();
        System.out.println("Día número: " + dia);

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            default -> System.out.println("Fin de semana");
        }
        System.out.println();
    }
}
