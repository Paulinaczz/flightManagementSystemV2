package logica;

import java.io.Serializable;

public class Pasajero extends Persona implements Serializable {

    private String pasaporte;
    private String nacionalidad;
    private String codigo;
    private int fila;
    private int columna;

    public Pasajero(String nombre, String apellido, String DNI, String correo, String telefono, String pasaporte, String nacionalidad, String codigo, int fila, int columna) {
        super(nombre, apellido, DNI, correo, telefono);
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
        this.codigo = codigo;
        this.fila = fila;
        this.columna = columna;
    }


    public Pasajero() {
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

}
