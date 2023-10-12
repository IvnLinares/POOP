package entidades;
public class Usuario extends Entidad {
    private String login;
    private Integer idRol;
    private String nombres;
    private String apellidos;   
    private String email;
    private String password;
    

    private void init() {
        AUTO_INCREMENT = false;
        PRIMARY_KEY = "login";   
    }    
    public Usuario() {
        init();
    }

    public Usuario(String login) {      
        init();
        this.login = login;
    }

    public Usuario(String login, Integer idRol, String nombres, String apellidos, String email, String password) {
        init();
        this.login = login;
        this.idRol = idRol;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
    }

    public Usuario(Integer idRol, String nombres, String apellidos, String email, String password) {
        init();
        this.idRol = idRol;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
