package com.example;

public class ArreglosUnidimensionales {

    public static void declararCrearInicializar() {
        
        //primera forma: declarar y luego asignar
        int[] numeros;
        numeros = new int[8];
        System.out.println("Arreglo numeros creado con " + numeros.length + " elementos");
        
        //segunda manera: declara y crear en la misma linea
        int[] num1 = new int[3];
        System.out.println("Arreglo num1 creado con " + num1.length + " elementos");
        
        //tercera manera: declarar y crear con valores iniciales
        int[] num = {1, 2, 34, 45, 234};
        System.out.println("Arreglo num creado con " + num.length + " elementos");
    }

}