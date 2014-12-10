public class Manzana {
    
    //propiedades
    private String tipoManzana;
    private String procedencia;
    private String color;
    private Double eurosKilo;
    private Distribuidor distribuidor;
    
    //métodos getter y setter
    
    //tipo manzana
	public String getTipoManzana(){
		return tipoManzana;
	}
	public void setTipoManzana(String tipomnz){
		this.tipoManzana = tipomnz;
	}

    //procedencia
    public String getProcedencia(){
        return procedencia;
    }			
    public void setProcedencia(String proc){
        this.procedencia = proc;
    }
    
    //color
    public String getColor(){
        return color;
    }
    
    public void setColor(String colmnz){
        this.color = colmnz;
    }
    // precio al kilo
    public Double getEurosKilo(){
        return eurosKilo;
    }
    public void setEurosKilo(Double precio){
        this.eurosKilo = precio;
    }
   
    public Distribuidor getDistribuidor() {
		return this.distribuidor;
	}
	public void setDistribuidor(Distribuidor distri) {
		this.distribuidor = distri;
	}
    
    
}