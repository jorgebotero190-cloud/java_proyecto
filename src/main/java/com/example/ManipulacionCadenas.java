package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        String saludo = "Hola";
        String nombre = "Mundo";
        String mensajeCompleto = saludo + " " + nombre + " ¿cómo estás?";
        System.out.println("Concatenación: " + mensajeCompleto);
    }

    public static void demostrarLongitud() {
        String texto = "Java Programming";
        int longitud = texto.length();
        System.out.println("Longitud de '" + texto + "': " + longitud);
    }

    public static void demostrarSubstring() {
        String texto = "Programación";
        String subCadena1 = texto.substring(0, 7);
        String subCadena2 = texto.substring(7);
        System.out.println("Substring (0,7): " + subCadena1);
        System.out.println("Substring (7): " + subCadena2);
    }

    public static void demostrarIndexOf() {
        String texto = "Bienvenido a Java";
        int posicion = texto.indexOf("Java");
        int posicionA = texto.indexOf("a");
        System.out.println("Posición de 'Java': " + posicion);
        System.out.println("Posición de 'a': " + posicionA);
    }

    public static void demostrarReplace() {
        String texto = "Hola mundo, mundo es lindo";
        String reemplazado = texto.replace("mundo", "Java");
        System.out.println("Original: " + texto);
        System.out.println("Reemplazado: " + reemplazado);
    }

    public static void demostrarMayusculasMinusculas() {
        String texto = "Java Programming";
        System.out.println("Original: " + texto);
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
    }

    public static void demostrarSplit() {
        String texto = "Python,Java,JavaScript,C#,Ruby";
        String[] lenguajes = texto.split(",");
        System.out.println("Lenguajes encontrados:");
        for (String lenguaje : lenguajes) {
            System.out.println("  - " + lenguaje);
        }
    }

    public static void demostrarTrim() {
        String texto = "   JavA   ";
        System.out.println("Original: '" + texto + "'");
        System.out.println("Con trim(): '" + texto.trim() + "'");
    }

    public static void demostrarStartsWithEndsWith() {
        String texto = "archivo.java";
        System.out.println("¿Comienza con 'archivo'? " + texto.startsWith("archivo"));
        System.out.println("¿Termina con '.java'? " + texto.endsWith(".java"));
    }

    public static void demostrarCompareTo() {
        String texto1 = "pera";
        String texto2 = "Banana";
        int resultado = texto1.compareTo(texto2);
        System.out.println("Comparación 'pera' vs 'Banana': " + resultado);
        if (resultado < 0) {
            System.out.println("'Apple' es menor que 'Bananlasea'");
        }
    }

    public static void demostrarContains() {
        String texto = "Java es un lenguaje de programación";
        System.out.println("¿Contiene 'lenguaje'? " + texto.contains("lenguaje"));
        System.out.println("¿Contiene 'Python'? " + texto.contains("Python"));
    }

    public static void demostrarCharAt() {
        String texto = "Java";
        System.out.println("Carácter en posición 0: " + texto.charAt(0));
        System.out.println("Carácter en posición 2: " + texto.charAt(2));
    }

}
