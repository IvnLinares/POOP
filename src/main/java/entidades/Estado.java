package entidades;
public class Estado extends Entidad{
    private Integer idEstado;    
    private String estado;   
    
    private void init(){
        AUTO_INCREMENT = true;
        PRIMARY_KEY = "idEstado";
    }

    public Estado() {
        init();
    }

    public Estado(Integer idEstado) {
        init();
        this.idEstado = idEstado;
    }

    public Estado(Integer idEstado, String estado) {
        init();
        this.idEstado = idEstado;
        this.estado = estado;
    }
    public Estado(String estado) {
        init();
        this.estado = estado;
    }
    public Integer getIdEstado() {
        return idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

        
}

