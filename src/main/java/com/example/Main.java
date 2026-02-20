package com.example;

public class Main {
    public static void main(String[] args) {

        VariablesYConstantes.demostrarConvencionesNombres();
        System.out.println();
        VariablesYConstantes.demostracionDeclaracionAsignacion();
        System.out.println();
        VariablesYConstantes.demostracionConstantes();
        System.out.println();

        TiposDeDatosPrimitivos.demostrarEnteros();
        System.out.println();
        TiposDeDatosPrimitivos.demostrarFlotantes();
        System.out.println();
        TiposDeDatosPrimitivos.demostrarCaracteres();
        System.out.println();
        TiposDeDatosPrimitivos.demostrarBooleanos();
        System.out.println();
        TiposDeDatosPrimitivos.demostrarValoresPorDefecto();
        System.out.println();

        ConversionDeTipos.demostrarCastingImplicito();
        System.out.println();
        ConversionDeTipos.demostrarCastingExplicito();
        System.out.println();
        ConversionDeTipos.demostrarProblemasDePrecision();
        System.out.println();

        Operadores.demostrarOperadoresAritmeticos();
        System.out.println();
        Operadores.demostracionIncrementoDecremento();
        System.out.println();
        Operadores.demostrarRelacionales();
        System.out.println();
        Operadores.demostrarOperadoresLogicos();
        System.out.println();
        Operadores.demostrarAsignacionesCompuestas();
        System.out.println();
        Operadores.demostrarOperadoresTernarios();
    }
}
