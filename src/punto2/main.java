
package punto2;


public class main {
   public static void main(String[] args) {
        // Creamos la lista enlazada
        NodoVehiculo cabeza = new NodoVehiculo();
        cabeza.marca = "Ford";
        cabeza.modelo = "Mustang";
        cabeza.color = "Rojo";
        cabeza.dueño = "Juan Pérez";
        cabeza.siguiente = new NodoVehiculo();
        cabeza.siguiente.marca = "Yamaha";
        cabeza.siguiente.modelo = "MT-09";
        cabeza.siguiente.color = "Negro";
        cabeza.siguiente.dueño = "María Gómez";
        cabeza.siguiente.siguiente = new NodoVehiculo();
        cabeza.siguiente.siguiente.marca = "Volvo";
        cabeza.siguiente.siguiente.modelo = "FH";
        cabeza.siguiente.siguiente.color = "Azul";
        cabeza.siguiente.siguiente.dueño = "José Rodríguez";
        cabeza.siguiente.siguiente.siguiente = new NodoVehiculo();
        cabeza.siguiente.siguiente.siguiente.marca = "Trek";
        cabeza.siguiente.siguiente.siguiente.modelo = "Fuel EX";
        cabeza.siguiente.siguiente.siguiente.color = "Verde";
        cabeza.siguiente.siguiente.siguiente.dueño = "Laura Torres";

        // Recorremos la lista e imprimimos la información de cada vehículo
        NodoVehiculo actual = cabeza;
        while (actual != null) {
            System.out.println("Marca: " + actual.marca);
            System.out.println("Modelo: " + actual.modelo);
            System.out.println("Color: " + actual.color);
            System.out.println("Dueño: " + actual.dueño);
            System.out.println();
            actual = actual.siguiente;
        }
    }
}
