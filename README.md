# Estructuras de datos con Nodo: Pilas y Colas
 
Aplicación de consola en Java que resuelve cuatro ejercicios usando **Pilas** y **Colas** implementadas desde cero. Ambas estructuras comparten una misma clase `Nodo<T>`.
 
## Diseño y reutilización de código
 
La clase `Nodo<T>` es la única pieza de almacenamiento. `Pila<T>` y `Cola<T>` la reutilizan y solo añaden su lógica propia:
 
El uso de genéricos (`<T>`) permite que las mismas clases sirvan para `Character`, `Integer` y `String`.
 
## Ejercicios
 
### Ejercicio 01: Invertir texto (Pila)
Cada carácter del texto se apila con `push` y después se desapila con `pop` mientras `isEmpty()` sea falso, construyendo la cadena invertida. No se recorre el texto hacia atrás.
 
### Ejercicio 02: Fila de clientes (Cola)
Simula una fila de clientes atendidos por orden de llegada.
 
```
1) Llegada       -> se encola el nombre
2) Atender       -> se desencola y se muestra el cliente atendido
3) Mostrar cola  -> lista los clientes en espera (sin modificarla)
4) Salir
```
 
### Ejercicio 03: Palíndromo (Pila + Cola)
El texto se normaliza (minúsculas y sin espacios). Cada carácter se inserta a la vez en una pila (lectura inversa) y en una cola (lectura directa). Después se comparan `pop()` y `remove()` uno a uno: si todos coinciden, es palíndromo.
 
### Ejercicio 04: Decimal a binario (Pila)
Se apilan los restos de dividir el número entre 2 hasta llegar a 0. Al desapilar, los restos salen en el orden correcto y forman el número binario.
 
## Ejemplos de uso
 
```
Ejercicio 01   "hola"                 ->  aloh
Ejercicio 03   "Anita lava la tina"   ->  SÍ es un palíndromo
Ejercicio 03   "hola"                 ->  NO es un palíndromo
Ejercicio 04   10                     ->  1010
Ejercicio 04   0                      ->  0
```
