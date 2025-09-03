
package logica;

import java.io.Serializable;

public abstract class Persona implements Serializable{
    private String nombres;
    private String apellidos;
    private String DNI;
    private String correo;
    private String telefono;

    public Persona(String nombre, String apellido, String DNI, String correo, String telefono) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.DNI = DNI;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona() {
    }
    

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombres() {
        return nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
}
