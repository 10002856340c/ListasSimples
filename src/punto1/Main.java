
package punto1;



public class Main {
public static void main(String[] args) {
        Nodo cabeza = new Nodo(10); // Creamos el primer nodo con valor 10
        Nodo actual = cabeza; // Creamos una variable para recorrer la lista
        actual.siguiente = new Nodo(20); // Añadimos un nodo con valor 20 al siguiente de la cabeza
        actual = actual.siguiente; // Movemos el puntero al nodo recién creado
        actual.siguiente = new Nodo(30); // Añadimos un nodo con valor 30 al siguiente del nodo anterior
        actual = actual.siguiente; // Movemos el puntero al nodo recién creado
        actual.siguiente = new Nodo(40); // Añadimos un nodo con valor 40 al siguiente del nodo anterior
        actual = actual.siguiente; // Movemos el puntero al nodo recién creado
        actual.siguiente = new Nodo(50); // Añadimos un nodo con valor 50 al siguiente del nodo anterior
        actual = actual.siguiente; // Movemos el puntero al nodo recién creado
        actual.siguiente = new Nodo(60); // Añadimos un nodo con valor 60 al siguiente del nodo anterior
        actual = actual.siguiente; // Movemos el puntero al nodo recién creado
        actual.siguiente = new Nodo(75); // Añadimos un nodo con valor 75 al siguiente del nodo anterior
        actual = actual.siguiente; // Movemos el puntero al nodo recién creado
        actual.siguiente = new Nodo(80); // Añadimos un nodo con valor 80 al siguiente del nodo anterior

        // Recorremos la lista e imprimimos los valores
        actual = cabeza; // Movemos el puntero al inicio de la lista
        while (actual != null) {
            System.out.println(actual.valor);
            actual = actual.siguiente;
        }
    }
}
