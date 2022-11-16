package com.company;
/**
 * @author francesco.fassino
 * @author giulio.semenzato
 * @author giacomo.esposito
 * @author filippo.schierato
 * @version 0.1
 */


/**
 * queue implementata con logica FIFO (IL PRIMO CHE ENTRA è il primo che esce)
 *
 */
public interface IQueue {
    void enqueue(Object o);

    Object dequeue();

    Object front();

    int size();

    boolean isEmpty();
}
