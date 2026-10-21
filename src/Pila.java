//Clase Pila
public class Pila<T> {
    private Nodo<T> tope;

    //Metodo para ver si esta vacio. Si lo esta devuelve null, sino devuelve false
    public boolean isEmpty() {
        return tope == null;
    }


    //Metodo para meter un nuevo dato
    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(tope);
        tope = nuevo;
    }

    //Metodo para eliminar y mostrar el primer elemento de la Pila
    public T pop() {
        if (tope == null) {
            throw new IllegalStateException("La pila está vacía.");
        }
        T dato = tope.getDato();
        tope = tope.getSiguiente();
        return dato;
    }
}