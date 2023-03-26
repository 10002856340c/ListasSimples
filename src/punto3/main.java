
package punto3;


public class main {

    public static void main(String[] args) {
        // Creamos la lista enlazada con los números 20, 22, 24, 26 y 30
        NodoSerie cabeza = new NodoSerie();
        cabeza.numero = 20;
        cabeza.siguiente = new NodoSerie();
        cabeza.siguiente.numero = 22;
        cabeza.siguiente.siguiente = new NodoSerie();
        cabeza.siguiente.siguiente.numero = 24;
        cabeza.siguiente.siguiente.siguiente = new NodoSerie();
        cabeza.siguiente.siguiente.siguiente.numero = 26;
        cabeza.siguiente.siguiente.siguiente.siguiente = new NodoSerie();
        cabeza.siguiente.siguiente.siguiente.siguiente.numero = 30;

        // Recorremos la lista e imprimimos los números de la serie
        NodoSerie actual = cabeza;
        while (actual != null) {
            System.out.print(actual.numero + " ");
            actual = actual.siguiente;
        }
    }
}

