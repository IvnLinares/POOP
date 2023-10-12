package entidades;
public class Categoria extends Entidad{
    private Integer idCategoria;    
    private String categoria;
    
    private void init(){
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idCategoria";
    }
       
    public Categoria() {
        init();
    }

    public Categoria(Integer idCategoria) {
        init();
        this.idCategoria = idCategoria;
    }

    public Categoria(Integer idCategoria, String categoria) {
        init();
        this.idCategoria = idCategoria;
        this.categoria = categoria;
    }

    public Categoria(String categoria) {
        init();
        this.categoria = categoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
 
}
