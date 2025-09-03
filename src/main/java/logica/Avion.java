package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Avion implements Serializable {

    private String codigo;
    private ArrayList<Pasajero> pasajeros;

    public Avion(String codigo) {
        this.codigo = codigo;
        this.pasajeros = new ArrayList<>();
    }

    public Avion() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean existePasajero(String DNI) {
        for (Pasajero pasajero : pasajeros) {
            if (pasajero.getDNI().equals(DNI)) {
                return true;
            }
        }
        return false;
    }

    public Pasajero obtenerPasajeroPorDNI(String DNI) {
        for (Pasajero pasajero : pasajeros) {
            if (pasajero.getDNI().equals(DNI)) {
                return pasajero;
            }
        }
        return null;
    }

    public int buscarPasajeroPorDNI(String DNI) {
        int posicion = -1;
        for (int i = 0; i < pasajeros.size(); i++) {
            if (DNI.equals(pasajeros.get(i).getDNI())) {
                posicion = i;
            }
        }
        return posicion;
    }
    
    public int buscarPasajeroPorCodigo(String codigo) {
        int posicion = -1;
        for (int i = 0; i < pasajeros.size(); i++) {
            if (codigo.equals(pasajeros.get(i).getCodigo())) {
                posicion = i;
            }
        }
        return posicion;
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }
    
    public boolean verificarOcupadoAsiento(int fila, int columna){
        for (int i = 0; i < pasajeros.size(); i++) {
            if(pasajeros.get(i).getFila() == fila && pasajeros.get(i).getColumna() == columna){
                return true;
            }
        }
        return false;
    }
}
