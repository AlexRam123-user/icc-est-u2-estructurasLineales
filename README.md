# Proyecto de Algoritmos y Estructuras de Datos

## Nuevas Clases

### Ejercicio 01: Validación de Signos (`SignValidator`)
Esta clase valida si un string compuesto por los caracteres `(`, `)`, `{`, `}`, `[`, `]` es válido siguiendo las siguientes reglas:

1. Cada símbolo abierto debe cerrarse en el orden correcto.
2. Los símbolos deben estar correctamente anidados.

#### Método principal:
- **`isValid(String s)`**:
  - Recibe un string como entrada.
  - Devuelve `true` si los signos son válidos, o `false` en caso contrario.

#### Ejemplo de uso:
```java
SignValidator validar = new SignValidator();
boolean resultado = validar.isValid("([]){}"); // Resultado: true
```

---

### Ejercicio 02: Ordenar un Stack (`StackSorter`)
Esta clase implementa un algoritmo para ordenar un `Stack` de números de forma ascendente, de modo que el elemento más pequeño quede en la parte superior (tope del stack). La restricción es que solo se pueden usar stacks adicionales para realizar el proceso.

#### Método principal:
- **`sortStack(Stack stack)`**:
  - Recibe un stack como entrada.
  - Ordena el stack directamente sin usar estructuras de datos adicionales que no sean stacks.

#### Ejemplo de uso:
```java
Stack<Integer> stack = new Stack<>();
stack.push(5);
stack.push(1);
stack.push(4);
stack.push(2);

StackSorter sorter = new StackSorter();
sorter.sortStack(stack);

stack.printStack(); // Salida: 1 -> 2 -> 4 -> 5
```

---

## Cambios en `App`
Se agregó un menú principal para seleccionar entre los dos ejercicios implementados. El usuario puede interactuar con las siguientes opciones:

1. **Validar símbolos:** Solicita un string con los caracteres `(`, `)`, `{`, `}`, `[`, `]` e indica si es válido según las reglas descritas en el ejercicio 01.
2. **Ordenar Stack:** Solicita al usuario ingresar un stack de números y lo ordena en orden ascendente.

### Flujo del programa:
El programa utiliza la clase `Scanner` para recibir entradas del usuario y ejecutar las funciones según la selección realizada en el menú.

#### Ejemplo de ejecución:
**Menú principal:**
```
---MENU---

1. Validar simbolos
2. Ordenar Stack
Seleccione el algoritmo que desea ejecutar: 1
Ingrese un string con los símbolos a validar: ([])
Si esta bien true y si no false
Resultado: true
```

**Ordenar Stack:**
```
---MENU---

1. Validar simbolos
2. Ordenar Stack
Seleccione el algoritmo que desea ejecutar: 2
Ingrese la cantidad de elementos del stack: 4
Elemento 1: 5
Elemento 2: 1
Elemento 3: 4
Elemento 4: 2
Stack original:
2 -> 4 -> 1 -> 5 ->
Stack ordenado:
1 -> 2 -> 4 -> 5 ->
```

Con este menú, se facilita la ejecución y prueba de los dos ejercicios implementados.
