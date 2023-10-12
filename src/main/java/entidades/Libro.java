package entidades;
public class Libro extends Entidad{
    private String idLibro;    
    private Integer idCategoria; 
    private Integer idEstado;    
    private String titulo; 
    private String isbn; 
    private String numEdicion;    
    private String anoEdicion; 
    private Integer existencias;
    private Integer disponibles;    
    
    private void init(){
        AUTO_INCREMENT = false;
        PRIMARY_KEY = "idLibro";
    }        
    public Libro() {
        init();
    }        

    public Libro(String idLibro) {
        init();
        this.idLibro = idLibro;        
    }
  
    public Libro(String idLibro, Integer idCategoria, Integer idEstado, String titulo, String isbn, String numEdicion, String anoEdicion, Integer existencias) {
       init();
        this.idLibro = idLibro;
        this.idCategoria = idCategoria;
        this.idEstado = idEstado;
        this.titulo = titulo;
        this.isbn = isbn;
        this.numEdicion = numEdicion;
        this.anoEdicion = anoEdicion;
        this.existencias = existencias;
    }

    public Libro(Integer idCategoria, Integer idEstado, String titulo, String isbn, String numEdicion, String anoEdicion, Integer existencias, Integer disponibles) {
        init();
        this.idCategoria = idCategoria;
        this.idEstado = idEstado;
        this.titulo = titulo;
        this.isbn = isbn;
        this.numEdicion = numEdicion;
        this.anoEdicion = anoEdicion;
        this.existencias = existencias;
        this.disponibles = disponibles;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(String numEdicion) {
        this.numEdicion = numEdicion;
    }

    public String getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(String anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }


}
