public class leche {

    //propiedades
    private String tipo;
    private String procedencia;
    private Double eurosLitro;
    private Distribuidor distribuidor;
    
    //métodos getter y setter
    
    //tipo leche
    public getTipo(){
        return tipo;
    }
    
    public void setTipo(tipoleche){
        this.tipo = tipoleche;
    }
    
    //procedencia
     public getProcedencia(){
        return procedencia;
    }
    public void setProcedencia(procleche){
        this.procedencia = procleche;
    }
    
    //precio litro
    public Double getEurosLitro(){
        return eurosLitro;
    }
    
    public void setEurosLitro(preclitro){
        this.eurosLitro = preclitro;
    }
}