package entidades;
public class LibroAutor extends Entidad{
    private Integer id;    
    private String idLibro;
    private Integer idAutor; 

    private void init(){
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "id";
    }    
    public LibroAutor() {
        init();
    }

    public LibroAutor(Integer id) {
        init();
        this.id = id;
    }

    public LibroAutor(Integer id, String idLibro, Integer idAutor) {
        init();
        this.id = id;
        this.idLibro = idLibro;
        this.idAutor = idAutor;
    }

    public LibroAutor(String idLibro, Integer idAutor) {
        init();
        this.idLibro = idLibro;
        this.idAutor = idAutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

 
}
