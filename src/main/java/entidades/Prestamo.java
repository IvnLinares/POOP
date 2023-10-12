package entidades;
public class Prestamo extends Entidad{
    private Integer idPrestamo;    
    private String idLector;
    private String idLibro;
    private String login;    
    private String fechaPrestamo; 
    private String fechaDevolucion; 
    private Integer idEstadoP;    

private void init(){
    AUTO_INCREMENT = true;
    PRIMARY_KEY = "idPrestamo";
}    
 public Prestamo()
 {
     init();
 }
    public Prestamo(Integer idPrestamo) {
        init();
        this.idPrestamo = idPrestamo;        
    }
    public Prestamo(Integer idPrestamo, String idLector, String idLibro, String login, String fechaPrestamo, String fechaDevolucion, Integer idEstadoP) {
        init();
        this.idPrestamo = idPrestamo;
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.login = login;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.idEstadoP = idEstadoP;
    }

    public Prestamo(String idLector, String idLibro, String login, String fechaPrestamo, String fechaDevolucion, Integer idEstadoP) {
        init();
        this.idLector = idLector;
        this.idLibro = idLibro;
        this.login = login;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.idEstadoP = idEstadoP;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getIdLector() {
        return idLector;
    }

    public void setIdLector(String idLector) {
        this.idLector = idLector;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getIdEstadoP() {
        return idEstadoP;
    }

    public void setIdEstadoP(Integer idEstadoP) {
        this.idEstadoP = idEstadoP;
    }

}