package logica;

public class VueloNacional extends Vuelo {

    private String departamentoOrigen;
    private String departamentoDestino;

    public VueloNacional(String ID, double precio, String fechasalida, String horasalida, String fechallegada, String horallegada, String departamentoOrigen, String departamentoDestino) {
        super(ID, precio, fechasalida, horasalida, fechallegada, horallegada);
        this.departamentoOrigen = departamentoOrigen;
        this.departamentoDestino = departamentoDestino;
    }

    public VueloNacional() {
        super();
    }

    public void setDepartamentoOrigen(String departamentoOrigen) {
        this.departamentoOrigen = departamentoOrigen;
    }

    public void setDepartamentoDestino(String departamentoDestino) {
        this.departamentoDestino = departamentoDestino;
    }

    public String getDepartamentoOrigen() {
        return departamentoOrigen;
    }

    public String getDepartamentoDestino() {
        return departamentoDestino;
    }

    public void mostrarVuelo() {
        //super.mostrarVuelo();
        System.out.println("Desde: " + departamentoOrigen);
        System.out.println("Hasta: " + departamentoDestino);

    }
}
