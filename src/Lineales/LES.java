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

}
