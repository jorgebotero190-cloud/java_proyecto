package com.example;

public class EstructurasDeRepeticion {

public static void ejemplosWhile() {
    int i = 0;

    while (i < 5) {
        System.out.println("El valor de i es: " + i);
}
}

public static void ejemplosDoWhile() {
    int i = 1;
    do {
        System.out.println("El valor de i es: " + i);

}
    while (i < 5);
}

public static void ejemplosForClásico(){
    for (int i = 0; i < 5; i++) {
        System.out.println("El valor de i es: " + i);
}
}
public static void ejemplosForAnidado(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

            System.out.println("El valor de i es: " + i + " y el valor de j es: " + j);
        }
    }
}
public static void ejemplosBreakContinue(){
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            break;
        }
    }
    for (int i = 0; i < 10; i++) {
        if (i == 5) {
            continue;
        }
        System.out.println("El valor de i es: " + i);
    }

}
public static void ejemplosEtiquetas(){
    externo:
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (i == 1 && j == 1) {
                break externo;
            }
            System.out.println( i + ", " + j);
        }
    }
}


}







