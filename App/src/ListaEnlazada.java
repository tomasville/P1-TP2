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

    public Nodo buscarNodo(int valor) {
        Nodo actual;
        actual = this.inicio;
        while (actual.getDato() != valor && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        if (actual.getDato() == valor) {
            return actual;
        } else {
            return null;
        }
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


    public void eliminarNodo(int valor) {
        if (inicio == null) {
            return;
        }

        if (inicio.getDato() == valor) {
            inicio = inicio.getSiguiente();
            return;
        }

        Nodo actual = inicio;
        while (actual.getSiguiente() != null && actual.getSiguiente().getDato() != valor) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }
}
