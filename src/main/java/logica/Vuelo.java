package logica;

import java.io.Serializable;

public class Vuelo implements Serializable{

    private String ID;
    private double precio;
    private String fechasalida;
    private String horasalida;
    private String fechallegada;
    private String horallegada;

    public Vuelo(String ID, double precio, String fechasalida, String horasalida, String fechallegada, String horallegada) {
        this.ID = ID;
        this.precio = precio;
        this.fechasalida = fechasalida;
        this.horasalida = horasalida;
        this.fechallegada = fechallegada;
        this.horallegada = horallegada;
    }

    public Vuelo() {
        ID = "";
        precio = 0;
        fechasalida = "";
        horasalida = "";
        fechallegada = "";
        horallegada = "";
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }  

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public void setFechallegada(String fechallegada) {
        this.fechallegada = fechallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    public String getID() {
        return ID;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public String getFechallegada() {
        return fechallegada;
    }

    public String getHorallegada() {
        return horallegada;
    }
}
