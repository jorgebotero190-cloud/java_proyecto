# Proyecto Sabiduría Java — Demostraciones

Proyecto educativo en Java que reúne ejemplos prácticos de los fundamentos del lenguaje.
Cada tema está encapsulado en su propia clase con métodos de demostración independientes,
ejecutados secuencialmente desde `Main`.

---

## Tabla de contenidos

### Implementados

| # | Tema | Clase |
|---|------|-------|
| 1 | Variables y constantes | `VariablesYConstantes` |
| 2 | Tipos de datos primitivos | `TiposDeDatosPrimitivos` |
| 3 | Conversión de tipos (casting) | `ConversionDeTipos` |
| 4 | Operadores (aritméticos, relacionales, lógicos, ternario) | `Operadores` |
| 5 | Entrada de datos por consola | `EntradaDeDatos` |
| 6 | Estructuras condicionales (`if`, `if-else`, `switch`) | `EstructurasCondicionales` |
| 7 | Estructuras de repetición (`while`, `do-while`, `for`, etiquetas) | `EstructurasDeRepeticion` |
| 8 | Métodos estáticos simples | `MetodosEstaticosSimples` |
| 9 | Arreglos unidimensionales | `ArreglosUnidimensionales` |
| 10 | Arreglos bidimensionales (matrices) | `ArreglosBidimensionales` |
| 11 | Manipulación de cadenas (strings) | `ManipulacionCadenas` |
| 12 | Manejo básico de excepciones | `ManejoBasicoExcepciones` |

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
                ├── EstructurasDeRepeticion.java
                ├── MetodosEstaticosSimples.java
                ├── ArreglosUnidimensionales.java
                ├── ArreglosBidimensionales.java
                ├── ManipulacionCadenas.java
                └── ManejoBasicoExcepciones.java
```

---

## Descripción detallada de las clases

### 1. **VariablesYConstantes**
Demuestra la declaración y uso de variables y constantes en Java.
- Declara variables con diferentes tipos de datos
- Muestra cómo crear constantes usando la palabra clave `final`
- Explica el alcance de las variables

### 2. **TiposDeDatosPrimitivos**
Proporciona ejemplos de todos los tipos de datos primitivos disponibles en Java:
- Tipos enteros: `byte`, `short`, `int`, `long`
- Tipos flotantes: `float`, `double`
- Tipo booleano: `boolean`
- Tipo carácter: `char`
- Demuestra valores mínimos y máximos de cada tipo

### 3. **ConversionDeTipos**
Ilustra las conversiones entre diferentes tipos de datos:
- **Conversión implícita (casting automático)**: de tipos menores a mayores
- **Conversión explícita (casting manual)**: de tipos mayores a menores
- Ejemplos prácticos con números enteros y flotantes

### 4. **Operadores**
Cubre todos los operadores disponibles en Java:
- **Operadores aritméticos**: `+`, `-`, `*`, `/`, `%`
- **Operadores relacionales**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Operadores lógicos**: `&&`, `||`, `!`
- **Operador ternario**: `? :`
- Demuestra la precedencia de operadores

### 5. **EntradaDeDatos**
Muestra cómo capturar datos del usuario desde la consola:
- Uso de `Scanner` para leer diferentes tipos de datos
- Lectura de enteros, decimales y texto
- Manejo básico de entrada de usuario

### 6. **EstructurasCondicionales**
Implementa todas las estructuras condicionales:
- **Sentencia `if`**: condición simple
- **Sentencia `if-else`**: condición con alternativa
- **Sentencia `if-else if-else`**: múltiples condiciones
- **Sentencia `switch-case`**: selección entre múltiples opciones
- Ejemplos de comparación de valores

### 7. **EstructurasDeRepeticion**
Demuestra los ciclos de repetición en Java:
- **Ciclo `while`**: repetición mientras se cumple condición
- **Ciclo `do-while`**: al menos una ejecución garantizada
- **Ciclo `for`**: iteración controlada
- **Ciclo `for-each`**: iteración sobre colecciones
- Uso de etiquetas para controlar el flujo (`break`, `continue`)

### 8. **MetodosEstaticosSimples**
Introduce el concepto de métodos estáticos:
- **Métodos sin parámetros ni retorno**: rutinas simples
- **Métodos con parámetros**: paso de argumentos
- **Métodos con retorno**: devolución de valores
- **Sobrecarga de métodos**: múltiples versiones del mismo método
- Cómo llamar métodos estáticos desde `main`

### 9. **ArreglosUnidimensionales**
Trabajo con arreglos de una dimensión:
- **Declaración y creación**: diferentes formas de crear arreglos
- **Inicialización**: asignación de valores a elementos
- **Acceso a elementos**: lectura mediante índice
- **Propiedad `length`**: obtener el tamaño del arreglo
- Diferentes formas de creación (con `new` o con inicializador)

### 10. **ArreglosBidimensionales**
Trabajo con matrices (arreglos de dos dimensiones):
- **Declaración de matrices**: `int[][] matriz`
- **Inicialización manual**: asignación de valores específicos
- **Inicialización con valores iniciales**: declaración directa
- **Recorrimiento de matrices**: uso de ciclos anidados
- **Operaciones comunes**: suma de matrices, búsqueda de valores
- Acceso a elementos mediante dos índices `[i][j]`

### 11. **ManipulacionCadenas**
Proporciona ejemplos de operaciones con cadenas de texto:
- **Concatenación**: unión de cadenas con `+`
- **Longitud**: obtener tamaño con `length()`
- **Substring**: extraer parte de una cadena con `substring()`
- **Búsqueda**: encontrar posición con `indexOf()`
- **Reemplazo**: sustituir texto con `replace()`
- **Conversión de caso**: `toUpperCase()`, `toLowerCase()`
- **División**: separar cadena con `split()`
- Métodos útiles de la clase `String`

### 12. **ManejoBasicoExcepciones**
Enseña a manejar errores y excepciones:
- **Bloque `try-catch`**: captura y manejo de excepciones
- **Manejo de `ArithmeticException`**: errores en cálculos (ej: división por cero)
- **Manejo de `InputMismatchException`**: entrada inválida de usuario
- **Manejo de `ArrayIndexOutOfBoundsException`**: acceso a índices inválidos
- **Bloque `finally`**: código que se ejecuta siempre, con o sin excepción
- **Try-with-resources**: gestión automática de recursos
- Importancia de la liquidación limpia de recursos
