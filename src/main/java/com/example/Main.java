package com.example;

public class Main {

    private static final String SEPARADOR_CLASE = "\n" + "=".repeat(80) + "\n";
    private static final String SEPARADOR_SECCION = "-".repeat(80);

    public static void main(String[] args) {
        mostrarTitulo();

        System.out.println(SEPARADOR_CLASE);
        System.out.println("CLASE: VariablesYConstantes");
        System.out.println(SEPARADOR_CLASE);
        VariablesYConstantes.demostrarConvencionesNombres();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        VariablesYConstantes.demostracionDeclaracionAsignacion();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        VariablesYConstantes.demostracionConstantes();

        System.out.println(SEPARADOR_CLASE);
        System.out.println("CLASE: TiposDeDatosPrimitivos");
        System.out.println(SEPARADOR_CLASE);
        TiposDeDatosPrimitivos.demostrarEnteros();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        TiposDeDatosPrimitivos.demostrarFlotantes();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        TiposDeDatosPrimitivos.demostrarCaracteres();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        TiposDeDatosPrimitivos.demostrarBooleanos();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();

        System.out.println(SEPARADOR_CLASE);
        System.out.println(" CLASE : ConversionDeTipos");
        System.out.println(SEPARADOR_CLASE);
        ConversionDeTipos.demostrarCastingImplicito();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        ConversionDeTipos.demostrarCastingExplicito();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        ConversionDeTipos.demostrarProblemasDePrecision();

        System.out.println(SEPARADOR_CLASE);
        System.out.println("CLASE: Operadores");
        System.out.println(SEPARADOR_CLASE);
        Operadores.demostrarOperadoresAritmeticos();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        Operadores.demostracionIncrementoDecremento();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        Operadores.demostrarRelacionales();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        Operadores.demostrarOperadoresLogicos();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        Operadores.demostrarAsignacionesCompuestas();
        System.out.println("\n" + SEPARADOR_SECCION + "\n");
        Operadores.demostrarOperadoresTernarios();

        System.out.println("\n" + SEPARADOR_CLASE);
        System.out.println("FIN DE LA DEMOSTRACIÓN");
        System.out.println(SEPARADOR_CLASE);
    }

    private static void mostrarTitulo() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("           PROYECTO SABIDURÍA JAVA - DEMOSTRACIONES");
        System.out.println("=".repeat(80) + "\n");
    }
}
