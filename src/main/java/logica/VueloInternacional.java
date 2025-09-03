package logica;

public class VueloInternacional extends Vuelo {

    private String paisOrigen;
    private String paisDestino;

    public VueloInternacional(String ID, double precio, String fechasalida, String horasalida, String fechallegada, String horallegada,String paisOrigen, String paisDestino) {
        super(ID, precio, fechasalida, horasalida, fechallegada,  horallegada);
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
    }

    public VueloInternacional() {
        super();
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getPaisDestino() {
        return paisDestino;
    }
    

    public void mostrarVuelo() {
        //super.mostrarVuelo();
        System.out.println("Desde: " + paisOrigen);
        System.out.println("Hasta: " + paisDestino);
    }
}
