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

}
