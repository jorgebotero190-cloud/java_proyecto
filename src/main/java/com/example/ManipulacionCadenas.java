package com.example;

public class ManipulacionCadenas {

    public static void demostrarConcatenacion() {
        System.out.println("=== CONCATENACIÓN ===");
        String saludo = "Hola";
        String nombre = "Mundo";
        String mensajeCompleto = saludo + " " + nombre + " ¿cómo estás?";
        System.out.println("Concatenación: " + mensajeCompleto + "\n");
    }

    public static void demostrarLongitud() {
        System.out.println("=== LONGITUD ===");
        String texto = "Java Programming";
        int longitud = texto.length();
        System.out.println("Longitud de '" + texto + "': " + longitud + "\n");
    }

    public static void demostrarSubstring() {
        System.out.println("=== SUBSTRING ===");
        String texto = "Programación";
        String subCadena1 = texto.substring(0, 7);
        String subCadena2 = texto.substring(7);
        System.out.println("Substring (0,7): " + subCadena1);
        System.out.println("Substring (7): " + subCadena2 + "\n");
    }

    public static void demostrarIndexOf() {
        System.out.println("=== INDEXOF ===");
        String texto = "Bienvenido a Java";
        int posicion = texto.indexOf("Java");
        int posicionA = texto.indexOf("a");
        System.out.println("Posición de 'Java': " + posicion);
        System.out.println("Posición de 'a': " + posicionA + "\n");
    }

    public static void demostrarReplace() {
        System.out.println("=== REPLACE ===");
        String texto = "Hola mundo, mundo es lindo";
        String reemplazado = texto.replace("mundo", "Java");
        System.out.println("Original: " + texto);
        System.out.println("Reemplazado: " + reemplazado + "\n");
    }

    public static void demostrarMayusculasMinusculas() {
        System.out.println("=== MAYÚSCULAS / MINÚSCULAS ===");
        String texto = "Java Programming";
        System.out.println("Original: " + texto);
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase() + "\n");
    }

    public static void demostrarSplit() {
        System.out.println("=== SPLIT ===");
        String texto = "Python,Java,JavaScript,C#,Ruby";
        String[] lenguajes = texto.split(",");
        System.out.println("Lenguajes encontrados:");
        for (String lenguaje : lenguajes) {
            System.out.println("  - " + lenguaje);
        }
        System.out.println();
    }

    public static void demostrarTrim() {
        System.out.println("=== TRIM ===");
        String texto = "   JavA   ";
        System.out.println("Original: '" + texto + "'");
        System.out.println("Con trim(): '" + texto.trim() + "'\n");
    }

    public static void demostrarStartsWithEndsWith() {
        System.out.println("=== STARTSWITH / ENDSWITH ===");
        String texto = "archivo.java";
        System.out.println("¿Comienza con 'archivo'? " + texto.startsWith("archivo"));
        System.out.println("¿Termina con '.java'? " + texto.endsWith(".java") + "\n");
    }

    public static void demostrarCompareTo() {
        System.out.println("=== COMPARETO ===");
        String texto1 = "pera";
        String texto2 = "Banana";
        int resultado = texto1.compareTo(texto2);
        System.out.println("Comparación '" + texto1 + "' vs '" + texto2 + "': " + resultado);

        if (resultado < 0) {
            System.out.println("'" + texto1 + "' es menor que '" + texto2 + "'\n");
        } else if (resultado > 0) {
            System.out.println("'" + texto1 + "' es mayor que '" + texto2 + "'\n");
        } else {
            System.out.println("Ambas cadenas son iguales\n");
        }
    }

    public static void demostrarContains() {
        System.out.println("=== CONTAINS ===");
        String texto = "Java es un lenguaje de programación";
        System.out.println("¿Contiene 'lenguaje'? " + texto.contains("lenguaje"));
        System.out.println("¿Contiene 'Python'? " + texto.contains("Python") + "\n");
    }

    public static void demostrarCharAt() {
        System.out.println("=== CHARAT ===");
        String texto = "Java";
        System.out.println("Carácter en posición 0: " + texto.charAt(0));
        System.out.println("Carácter en posición 2: " + texto.charAt(2) + "\n");
    }
}