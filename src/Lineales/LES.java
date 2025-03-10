/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lineales;

import Nodos.Nodo;

/**
 *
 * @author ManuelRios
 */
public class LES {
    
    /**
     *Inicializa los valores
     */
    private Nodo Inicial;
    private int tam;
/**
 * Nos permite conocer si la lista esta (true) vacía o no (false)
 *
 * @return true si "Inicial" es nulo (la lista está vacía), false en caso de que contenga algún nodo.
 */
public boolean isEmpty() {
    return Inicial == null;  // Devuelve true si 'Inicial' es null, indicando que la lista está vacía.
}
/**
 * Devuelve el tamaño actual de la lista.
 *
 * @return El tamaño de la lista, es decir, la cantidad de nodos en ella.
 */
public int size() {
    return tam;  // Retorna el valor de 'tam', que representa la cantidad de elementos en la lista.
}
/**
 * Añade un nodo al inicio de la lista.
 *
 * @param nN El nodo a ser añadido al principio de la lista.
 * @return true si el nodo fue añadido correctamente, false en caso de algún error.
 */
public boolean addFirst(Nodo nN) {
    if (this.isEmpty()) {  // Si la lista está vacía (Inicial es null)
        Inicial = nN;  // El nodo se convierte en el primer nodo de la lista.
        tam++;  // Se incrementa el tamaño de la lista.
        return true;  // El nodo fue añadido correctamente.
    } else if (size() > 0) {  // Si la lista no está vacía
        nN.setSiguiente(Inicial);  // El nuevo nodo apunta al nodo que estaba al principio.
        Inicial = nN;  // Ahora, el nuevo nodo es el primero en la lista.
        tam++;  // Se incrementa el tamaño de la lista.
        return true;  // El nodo fue añadido correctamente.
    }
    return false;  // Si no se pudo añadir el nodo, retorna false.
}
/**
 * Imprime la lista en la consola de forma legible.
 * Se imprime cada valor de los nodos separados por " --> ".
 */
public void imprimirListaConsola() {
    Nodo nActual = Inicial;  // Inicia desde el primer nodo.
    while (nActual != null) {  // Mientras no se llegue al final de la lista (nActual sea null)
        System.out.print(nActual.getValor() + "-->");  // Imprime el valor del nodo seguido de "-->".
        nActual = nActual.getSiguiente();  // Avanza al siguiente nodo en la lista.
    }
}
/**
 * Elimina el último nodo de la lista.
 *
 * @return true si el nodo fue eliminado correctamente, false si no se pudo eliminar.
 */
public boolean removeLast() {
    if (size() == 1) {  // Si la lista tiene solo un nodo
        Inicial = null;  // Elimina el primer (y único) nodo, dejando la lista vacía.
        tam = 0;  // Se actualiza el tamaño de la lista.
        return true;  // Se eliminó el nodo correctamente.
    } else if (size() > 1) {  // Si la lista tiene más de un nodo
        Nodo nAuxiliar = Inicial;  // Empieza desde el primer nodo.
        // Se mueve hacia el penúltimo nodo para actualizar su siguiente referencia a null.
        while (nAuxiliar.getSiguiente().getSiguiente() != null) {
            nAuxiliar = nAuxiliar.getSiguiente();  // Avanza al siguiente nodo.
        }
        nAuxiliar.setSiguiente(null);  // El penúltimo nodo ya no apunta al último nodo.
        tam--;  // Se decrementa el tamaño de la lista.
        return true;  // El nodo fue eliminado correctamente.
    } else {
        return false;  // Si la lista está vacía, no se puede eliminar un nodo.
    }
}
/**
 * Añade un nodo al final de la lista.
 * 
 * @param nN El nodo que se desea agregar al final de la lista.
 * @return true si el nodo fue añadido correctamente, false en caso contrario.
 */
public boolean addLast(Nodo nN) {
    if (this.isEmpty()) {  // Si la lista está vacía
        Inicial = nN;  // El nodo se convierte en el primer nodo de la lista.
        tam++;  // Se incrementa el tamaño de la lista.
        return true;  // El nodo se añadió correctamente.
    } else {  // Si la lista no está vacía
        Nodo nActual = Inicial;  // Comienza desde el primer nodo.
        // Se recorre la lista hasta llegar al último nodo
        while (nActual.getSiguiente() != null) {
            nActual = nActual.getSiguiente();  // Avanza al siguiente nodo.
        }
        nActual.setSiguiente(nN);  // Establece el siguiente del último nodo al nuevo nodo.
        tam++;  // Se incrementa el tamaño de la lista.
        return true;  // El nodo fue añadido correctamente al final.
    }
}
/**
 * Elimina el primer nodo de la lista.
 * 
 * @return true si el primer nodo fue eliminado correctamente, false si la lista está vacía.
 */
public boolean removeFirst() {
    if (this.isEmpty()) {  // Si la lista está vacía
        return false;  // No se puede eliminar un nodo de una lista vacía.
    }

    Nodo nodoAEliminar = Inicial;  // Se guarda el primer nodo en una variable auxiliar.
    Inicial = Inicial.getSiguiente();  // El primer nodo se elimina al hacer que 'Inicial' apunte al siguiente nodo.
    
    tam--;  // Decrementa el tamaño de la lista.
    
    return true;  // El primer nodo fue eliminado correctamente.
}
/**
 * Verifica si un valor existe en la lista.
 * 
 * @param valor El valor que se busca en la lista.
 * @return true si el valor se encuentra en la lista, false en caso contrario.
 */
public boolean contains(int valor) {
    Nodo nActual = Inicial;  // Empieza desde el primer nodo.
    
    // Se recorre la lista buscando el valor.
    while (nActual != null) {
        if (nActual.getValor() == valor) {  // Si encontramos el valor en el nodo actual
            return true;  // El valor está presente en la lista.
        }
        nActual = nActual.getSiguiente();  // Avanzamos al siguiente nodo.
    }
    
    return false;  // El valor no se encuentra en la lista.
}
/**
 * Elimina todos los nodos de la lista, dejándola vacía.
 */
public void clear() {
    Inicial = null;  // Se desvincula la lista desde el primer nodo.
    tam = 0;  // Se resetea el tamaño de la lista.
}
@Override
public String toString() {
    Nodo nActual = Inicial;
    String resultado = "";

    while (nActual != null) {
        resultado += nActual.getValor() + (nActual.getSiguiente() != null ? " --> " : "");
        nActual = nActual.getSiguiente();
    }

    return resultado.isEmpty() ? "La lista está vacía." : resultado;
}

}
