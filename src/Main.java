void main() {

    //EJERCICIO 1

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

    Pila<Character> pila2 = new Pila<>();
    Cola<Character> cola2 = new Cola<>();
    String palabra = Depurar.palabra("Escribe una palabra y comprobare que es palíndroma: ", new Scanner(System.in)).toLowerCase();

    String invertida = "";

    //Recorro la palabra y la añado a la pila y cola
    for (int i = 0; i < palabra.length(); i++) {
        pila2.push(palabra.charAt(i));
        cola2.add(palabra.charAt(i));
    }

    System.out.println("USANDO PILA");
    //Añado los elementos de la pila a la variable invertida
    while (!pila2.isEmpty()) {
        invertida = invertida.trim() + pila2.pop();
    }
    //Compruebo
    if (invertida.equals(palabra)) {
        System.out.println("La palabra " + palabra + " es palíndroma");
    } else {
        System.out.println("La palabra " + palabra + " no es palíndroma");
    }

  /* System.out.println("USANDO COLA");
    invertida = "";
    //Voy quitando el ultimo elemento (Al quitar un elemento apar
    while(!cola2.isEmpty()){
        invertida = invertida.trim() + cola2.remove();
    }
    //Compruebo
    if (invertida.equals(palabra)) {
        System.out.println("La palabra " + palabra + " es palíndroma");
    } else {
        System.out.println("La palabra " + palabra + " no es palíndroma");
    }
    */
    
    //Ejercicio 4
    int num = Depurar.entero("Dime un número y te lo pasare a binario", new Scanner(System.in));
    Pila<Integer> binarios = new Pila<>();
    while (num != 0) {
        int resto = num % 2;
        binarios.push(resto);
        num = num / 2;
    }
    String resultado = "";
    while (!binarios.isEmpty()) {
        resultado = resultado + binarios.pop();
    }
    System.out.println("El resultado es: " + resultado);
}