
//Nodo generico para usarlo con las pilas y las colas
public class Nodo<T> {
    //El "T" representa cualquier tipo de Dato
    private T dato;
    private Nodo<T> siguiente;

    //Constructor
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    //Getters y Setters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
