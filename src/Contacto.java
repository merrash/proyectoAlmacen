public class Contacto {
    
    private String nombre;
    private String apellido;
    private int telefono;
    private String email;

    public Contacto() {}
	
    	//getters y setters
    	
    	//nombre
    	public String getNombre(){
    	    return nombre;
    	}
    	
    	public void setNombre(String nomcontact){
    	    this.nombre = nomcontact;
    	}
    	
    	//apellidos
    	public String getApellido(){
    	    return apellido;
    	}
    	
    	public void setApellido(String apell){
    	    this.apellido = apell;
    	}
    	
    
    	//telefono
    	public int getTelefono(){
    	    return telefono;
    	}
    	
    	public void setTelefono(int tlf){
    	    this.telefono = tlf;
    	}
    	
    	//email
    	public String getEmail(){
    	    return email;
    	}
    	
    	public void setEmail(String mail){
    	    this.email = mail;
    	}
	
}