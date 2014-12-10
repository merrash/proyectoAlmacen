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
    public void setTipoLechuga(String tipolchg){
        this.tipoLechuga = tipolchg;
    }
    
    //procedencia
    public String getProcedencia(){
        return procedencia;
    }
    public void setProcedencia(String proclchg){
        this.procedencia = proclchg;
    }
    
    //color
    public String getColor(){
        return color;
    }
    
    public void setColor(String colchg){
        this.color = colchg;
    }
    
    //precio unidad
    public Double getEurosUnidad(){
        return eurosUnidad;
    }
    
    public void setEurosUnidad(Double precuni){
        this.eurosUnidad = precuni;
    }
    
    public Distribuidor getDistribuidor() {
		return this.distribuidor;
	}
	public void setDistribuidor(Distribuidor distri) {
		this.distribuidor = distri;
	}
}