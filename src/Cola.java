public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;

    //Metodo para ver si esta vacio. Si lo esta devuelve null, sino devuelve false
    public boolean isEmpty() {
        return frente == null;
    }

    //Metodo que añade un elemento a la fila
    public void add(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    //Metodo que elimina el ultimo elemento de la fila
    public T remove() {
        if (frente == null) {
            throw new IllegalStateException("La cola está vacía.");
        }
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        return dato;
    }

    //Metodo que recorre los nodos para mostrarlos
    public void mostrar() {
        if (frente == null) {
            System.out.println("(cola vacía)");
            return;
        }
        int pos = 1;
        //For que recorre los distintos nodos hasta encontrar uno null (Ya no hay más)
            for (Nodo<T> actual = frente; actual != null; actual = actual.getSiguiente()) {
                System.out.println("  " + pos++ + ". " + actual.getDato());
            }
    }
}