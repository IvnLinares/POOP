package entidades;
public class Lector extends Entidad {
    private String idLector;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    public Lector() {
        init();
    }

    public Lector(String idLector) {      
        init();
        this.idLector = idLector;
    }
        private void init() {
        AUTO_INCREMENT = false;
        PRIMARY_KEY = "idLector";   
    }

    public Lector(String idLector, String nombres, String apellidos, String telefono, String correo) {
       init();
        this.idLector = idLector;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Lector(String nombres, String apellidos, String telefono, String correo) {
        init();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getIdLector() {
        return idLector;
    }

    public void setIdLector(String idLector) {
        this.idLector = idLector;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
  
    
}
