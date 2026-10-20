//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //EJERCICIO 1

    Deque<Character> pila = new ArrayDeque<>();
    String texto = Depurar.texto("Escribe algo y te lo invertire: ", new Scanner(System.in));

    for (int i = 0; i < texto.length(); i++) {
        pila.push(texto.charAt(i));
    }

    String inverso = "";

    while (!pila.isEmpty()) {
        inverso = inverso + pila.pop();
    }
    System.out.print("La frase invertida es: " + inverso);

    //EJERCICIO 2
    Queue<String> cola = new LinkedList<>();
    Boolean salir = false;
    while (!salir) {
        String opcion = Depurar.texto("\n \nCOLA CLIENTES\n" + "1. Llegada\n" + "2. Atender\n" + "3. Mostrar cola\n" + "4. Salir", new Scanner(System.in));
        switch (opcion) {
            case "1":
                String persona = Depurar.texto("Introduce un cliente", new Scanner(System.in));
                cola.add(persona);
                break;
            case "2":
                if (cola.isEmpty()) {
                    System.out.println("La cola esta vacia");
                } else {
                    System.out.println(cola.element());
                    cola.remove();
                }
                break;
            case "3":
                int i = 0;
                if (cola.isEmpty()) {
                    System.out.println("La cola esta vacia");
                } else {
                    for (String a : cola) {
                        i++;
                        System.out.println(i + "º " + a);
                    }
                }
                break;
            case "4":
                salir = true;
                break;
            default:
                System.out.println("Elige una opcion valida.");
        }
    }

    //EJERCICIO 3
}
