package logica;

public class Tarjeta {
    private String propietario;
    private String tipo;
    private String numero;
    private String fechaVencimiento;
    private String cvv;
    private String monto;

    public Tarjeta(String propietario, String tipo, String numero, String fechaVencimiento, String cvv, String monto) {
        this.propietario = propietario;
        this.tipo = tipo;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
        this.monto = monto;
    }

    public Tarjeta() {
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getCvv() {
        return cvv;
    }

    public String getMonto() {
        return monto;
    }
}
