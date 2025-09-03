
package logica;

public class Usuario extends Persona {
    private String usuario;
    private String contraseña;
    private String tipoUsuario;

    public Usuario(String usuario, String contraseña, String tipoUsuario, String nombres, String apellidos, String DNI, String correo, String celular) {
        super(nombres, apellidos, DNI, correo, celular);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }   
    
    public Usuario(){
        super("","","","","");
        usuario = "";
        contraseña = "";
        tipoUsuario = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
