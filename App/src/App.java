public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ListaEnlazada l1 = new ListaEnlazada();
        l1.agregarAlInicio(3);
        l1.agregarAlInicio(2);
        l1.agregarAlInicio(1);
        l1.recorrer();
        
        ListaEnlazada l2;
        Nodo nodito = new Nodo(10);
        l2 = new ListaEnlazada(nodito);
        l2.agregarAlInicio(20);
        l2.recorrer(); 
    
        
    }
}