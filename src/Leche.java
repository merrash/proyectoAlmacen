public class Leche {

    //propiedades
    private String tipo;
    private String procedencia;
    private Double eurosLitro;
    private Distribuidor distribuidor;
    
    //métodos getter y setter
    
    //tipo leche
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipoleche){
        this.tipo = tipoleche;
    }
    
    //procedencia
     public String getProcedencia(){
        return procedencia;
    }
    public void setProcedencia(String procleche){
        this.procedencia = procleche;
    }
    
    //precio litro
    public Double getEurosLitro(){
        return eurosLitro;
    }
    
    public void setEurosLitro(Double preclitro){
        this.eurosLitro = preclitro;
    }
    
    public Distribuidor getDistribuidor() {
		return this.distribuidor;
	}
	public void setDistribuidor(Distribuidor distri) {
		this.distribuidor = distri;
	}
}