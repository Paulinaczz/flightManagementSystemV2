
package logica;

import java.io.Serializable;

public class Asiento implements Serializable {
    private int fila;
    private int columna;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public Asiento() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
}
