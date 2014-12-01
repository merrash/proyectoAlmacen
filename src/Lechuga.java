public class Lechuga {

    //propiedades
    private String tipoLechuga;
    private String procedencia;
    private String color;
    private Double eurosUnidad;
    private Distribuidor distribuidor;
    
    //métodos getter y setter
    
    //tipo lechuga
    public String getTipoLechuga(){
        return tipoLechuga;
        
    }
    public void setTipoLechuga(tipolchg){
        this.tipoLechuga = tipolchg;
    }
    
    //procedencia
    public getProcedencia(){
        return procedencia;
    }
    public void setProcedencia(proclchg){
        this.procedencia = proclchg;
    }
    
    //color
    public String getColor(){
        return color;
    }
    
    public void setColor(colchg){
        this.color = colchg;
    }
    
    //precio unidad
    public Double getEurosUnidad(){
        return eurosUnidad;
    }
    
    public void setEurosUnidad(precuni){
        this.eurosUnidad = precuni;
    }
}