public class personaContacto extends Contacto {
    
    private String nombre;
    private String apellidos;
    private String funcion;
    private String telefono;

    public personaContacto() {
	super();
	}
	
	//getters y setters
	
	//nombre
	public String getNombre(){
	    return nombre;
	}
	
	public void setNombre(nomcontact){
	    this.nombre = nomcontact;
	}
	
	//apellidos
	public String getApellidos(){
	    return apellidos;
	}
	
	public void setApellidos(apell){
	    this.apellidos = apell;
	}
	
	//funcion
	public String getFuncion(){
	    return funcion;
	}
	
	public void setFuncion(func){
	    this.funcion = func;
	}
	
	//telefono
	public String getTelefono(){
	    return telefono;
	}
	
	public void setTelefono(tlf){
	    this.telefono = tlf;
	}
}
    