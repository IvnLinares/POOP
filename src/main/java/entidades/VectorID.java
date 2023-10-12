package entidades;
public class VectorID extends Entidad{
    private Integer id;    

    private void init(){
    AUTO_INCREMENT = false;
    PRIMARY_KEY = "id";
}    
 public VectorID()
 {
     init();
 }
    public VectorID(Integer id) {
        init();
        this.id = id;  
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}