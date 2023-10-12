package entidades;
public class Pais extends Entidad{
    private Integer idPais;    
    private String pais;
    
    private void init(){
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idPais";
    }
       
    public Pais() {
        init();
    }
    public Pais(Integer idPais) {
        init();
        this.idPais = idPais;
    }
    public Pais(Integer idPais, String pais) {
        init();
        this.idPais = idPais;
        this.pais = pais;
    }

    public Pais(String pais) {
        init();
        this.pais = pais;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
