package logica;

import java.util.ArrayList;

public class Aeropuerto {

    private String nombre;
    private String pais;
    private String ciudad;
    private int numVuelos;
    private ArrayList<Avion> aviones;

    public Aeropuerto(String nombre, String pais, String ciudad, int numVuelos, ArrayList<Avion> aviones) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.numVuelos = numVuelos;
        this.aviones = aviones;
    }

    public Aeropuerto() {
        this.pais = "";
        this.ciudad = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNumVuelos(int numVuelos) {
        this.numVuelos = numVuelos;
    }

    public void setAviones(ArrayList<Avion> aviones) {
        this.aviones = aviones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNumVuelos() {
        return numVuelos;
    }

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public boolean existeAvion(String codigo) {
        for (Avion avion : aviones) {
            if (avion.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public Avion obtenerAvion(String codigo) {
        for (int i = 0; i < aviones.size(); i++) {
            Avion avion = aviones.get(i);
            if (avion.getCodigo().equals(codigo)) {
                return avion;
            }
        }
        return null;
    }
    
    public int obtenerPosicion(String codigo){
        int posicion = -1;
        for (int i = 0; i < aviones.size(); i++){
            Avion avion = aviones.get(i);
            if (avion.getCodigo().equals(codigo)){
                posicion = i;
            }
        }
        return posicion;
    }
    
}
