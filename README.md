# Proyecto Sabiduría Java — Demostraciones

Proyecto educativo en Java que reúne ejemplos prácticos de los fundamentos del lenguaje.
Cada tema está encapsulado en su propia clase con métodos de demostración independientes,
ejecutados secuencialmente desde `Main`.

---

## Tabla de contenidos

| # | Tema | Clase |
|---|------|-------|
| 1 | Variables y constantes | `VariablesYConstantes` |
| 2 | Tipos de datos primitivos | `TiposDeDatosPrimitivos` |
| 3 | Conversión de tipos (casting) | `ConversionDeTipos` |
| 4 | Operadores | `Operadores` |
| 5 | Entrada de datos por consola | `EntradaDeDatos` |
| 6 | Estructuras condicionales (`if`, `if-else`, `switch`) | `EstructurasCondicionales` |
| 7 | Estructuras de repetición (`while`, `do-while`, `for`, etiquetas) | `EstructurasDeRepeticion` |

---

## Requisitos

- **Java** 17 o superior
- **Maven** 3.6 o superior

---

## Compilar y ejecutar

### Con Maven (recomendado)

```bash
# Compilar
mvn compile

# Ejecutar
mvn exec:java
```

### Con javac (alternativa)

```bash
# Compilar todos los fuentes
javac -d out src/main/java/com/example/*.java

# Ejecutar
java -cp out com.example.Main
```

---

## Estructura del proyecto

```
java_proyecto/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/example/
                ├── Main.java
                ├── VariablesYConstantes.java
                ├── TiposDeDatosPrimitivos.java
                ├── ConversionDeTipos.java
                ├── Operadores.java
                ├── EntradaDeDatos.java
                ├── EstructurasCondicionales.java
                └── EstructurasDeRepeticion.java
```
