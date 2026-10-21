void main() {

    //EJERCICIO 1

    System.out.println("\nEJERCICIO 1 \n");
    Pila<Character> pila = new Pila<>();
    String texto = Depurar.texto("Escribe algo y te lo invertire: ", new Scanner(System.in));

    //Recorre el texto y lo añade a la pila
    for (int i = 0; i < texto.length(); i++) {
        pila.push(texto.charAt(i));
    }

    String inverso = "";

    //Añade los elementos de la pila a la variable inverso
    while (!pila.isEmpty()) {
        inverso = inverso + pila.pop();
    }
    System.out.print("La frase invertida es: " + inverso);

    //EJERCICIO 2
    System.out.println("\nEJERCICIO 2 \n");
    Cola<String> cola = new Cola<>();
    Boolean salir = false;

    //Menu
    while (!salir) {
        String opcion = Depurar.texto("\nCOLA CLIENTES\n" + "1. Llegada\n" + "2. Atender\n" + "3. Mostrar cola\n" + "4. Salir", new Scanner(System.in));
        switch (opcion) {
            case "1":
                String persona = Depurar.texto("Introduce un cliente", new Scanner(System.in));
                //Añado la persona a la cola
                cola.add(persona);
                break;
            case "2":
                if (cola.isEmpty()) {
                    System.out.println("La cola esta vacia");
                } else {
                    System.out.println(cola.elemento());
                    //Elimino a la persona de la cola
                    cola.remove();
                }
                break;
            case "3":
                int i = 0;
                if (cola.isEmpty()) {
                    System.out.println("La cola esta vacia");
                } else {
                    //Muestro la cola
                    cola.mostrar();
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

    System.out.println("\nEJERCICIO 3 \n");
    Pila<Character> pila2 = new Pila<>();
    Cola<Character> cola2 = new Cola<>();
    String palabra = Depurar.palabra("Escribe una palabra y comprobare que es palíndroma: ", new Scanner(System.in)).toLowerCase();

    String invertida = "";

    //Recorro la palabra y la añado a la pila y cola
    for (int i = 0; i < palabra.length(); i++) {
        pila2.push(palabra.charAt(i));
        cola2.add(palabra.charAt(i));
    }

    boolean iguales = true;
    //Compruebo valor a valor si son iguales
    while (!pila2.isEmpty() && !cola2.isEmpty()) {
        if (!pila2.pop().equals(cola2.remove())) {
            iguales = false;
        }
    }

    if (iguales) {
        System.out.println("La palabra " + palabra + " es palíndroma");
    } else {
        System.out.println("La palabra " + palabra + " no es palíndroma");
    }
    //Ejercicio 4

    System.out.println("\nEJERCICIO 4 \n");
    int num = Depurar.entero("Dime un número y te lo pasare a binario", new Scanner(System.in));
    Pila<Integer> binarios = new Pila<>();
    //Divido entre 2 hasta que el número sea 0
    while (num != 0) {
        int resto = num % 2;
        binarios.push(resto);
        num = num / 2;
    }
    String resultado = "";
    //Añado la pila a una variable y luego la muestro
    while (!binarios.isEmpty()) {
        resultado = resultado + binarios.pop();
    }
    System.out.println("El resultado es: " + resultado);
}