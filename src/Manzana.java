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
	public void setTipoManzana(tipomnz){
		this.tipoManzana = tipo;
	}

    //procedencia
    public String getProcedencia(){
        return procedencia;
    }			
    public void setProcedencia(proc){
        this.procedencia = proc;
    }
    
    //color
    public String getColor(){
        return color;
    }
    
    public void setColor(colmnz){
        this.color = col;
    }
    // precio al kilo
    public Double getEurosKilo(){
        return eurosKilo;
    }
    public void setEurosKilo(precio){
        this.eurosKilo = precio;
    }
    
    
}