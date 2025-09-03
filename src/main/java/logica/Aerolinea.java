package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Aerolinea implements Serializable {

    private String nombre; 
    private int maxVuelos;
    private ArrayList<Vuelo> vuelos;

    public Aerolinea(String nombre, int maxVuelos) {
        this.nombre = nombre;
        this.maxVuelos = maxVuelos;
        this.vuelos = new ArrayList<>();
    }

    public Aerolinea() {
        nombre = "";
        maxVuelos = 5;
        vuelos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaxVuelos(int maxVuelos) {
        this.maxVuelos = maxVuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getMaxVuelos() {
        return maxVuelos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }
    
    public boolean existeVuelo(String ID) {
        for (int i = 0; i < vuelos.size(); i++) {
            if (ID.equals(vuelos.get(i).getID())) {
                return true;
            }
        }
        return false;
    }
    
    public Vuelo obtenerVueloPorPosicion(int i) {
        return (Vuelo) vuelos.get(i);
    }

    public int buscarVueloPorId(String ID) {
        int posicion = -1;
        for (int i = 0; i < vuelos.size(); i++) {
            if (ID.equals(vuelos.get(i).getID())) {
                posicion = i;
            }
        }
        return posicion;
    }

    public boolean eliminarPasajero(String ID) {
        if (buscarVueloPorId(ID) != -1) {
            vuelos.remove(buscarVueloPorId(ID));
            return true;
        } else {
            return false;
        }
    }

    public Vuelo obtenerVueloPorID(String ID) {
        if (buscarVueloPorId(ID) != -1) {
            return vuelos.get(buscarVueloPorId(ID));
        } else {
            return null;
        }
    }
}
