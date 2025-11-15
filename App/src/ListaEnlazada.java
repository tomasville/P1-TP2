public class ListaEnlazada {
     private Nodo inicio;
    // private Nodo fin;
    int edad;

    // 18 - 50
    public boolean validateEdad(int edad) {
        if (edad >= 18 && edad <= 50) {
            return true;
        } else {
            return false;
        }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ListaEnlazada() {
        this.inicio = null;
        // this.fin = null;
    }

    public ListaEnlazada(Nodo inicio) {
        this.inicio = inicio;
        // this.fin = null;
    }

    public void recorrer() {
        Nodo aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    public Nodo buscar(Object valor) {
        Nodo actual = this.inicio;
        while (actual != null) {
            if (actual.getDato().equals(valor)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
    public void agregarAlInicio(Materia valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.inicio == null) {
            this.inicio = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(this.inicio);
            this.inicio = nuevoNodo;
        }
    }
    
    public void agregarAlFinal(int valor) {
        // Todo: implementar
       
        
    }

    public void agregarAlMedio(int valor, int valorAnterior) {
        // Todo: implementar

    }


    public Nodo getInicio() {
        return this.inicio;
    }


    public void eliminarNodo(Object valor) {
        if (inicio == null) {
            return;
        }

        if (inicio.getDato().equals(valor)) {
            inicio = inicio.getSiguiente();
            return;
        }

        Nodo actual = inicio;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(valor)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }
}
