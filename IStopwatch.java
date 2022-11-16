/**
 * @author francesco.fassino
 * @author giulio.semenzato
 * @author giacomo.esposito
 * @author filippo.schierato
 * @version 0.1
 */

package com.company;

public interface IStopwatch {
    void start();
    void stop();
    void pause();
    void resume();
    void reset();
    long getTime();
}
