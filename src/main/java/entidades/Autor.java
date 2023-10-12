package entidades;
public class Autor extends Entidad {
    private Integer idAutor;
    private String nombre;
    private Integer idPais;

    public Autor() {
        init();
    }

    public Autor(Integer idAutor) {      
        init();
        this.idAutor = idAutor;
    }
        private void init() {
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idAutor";   
    }

    public Autor(Integer idAutor, String nombre, Integer idPais) {
        init();
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.idPais = idPais;
    }

    public Autor(String nombre, Integer idPais) {
        init();
        this.nombre = nombre;
        this.idPais = idPais;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    
}
