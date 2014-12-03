public class Distribuidor {
    
    //propiedades
    private String nombre;
    private String cif;
    private Direccion direccion;
    private Contacto personaContacto;
    
	public Distribuidor() {}

    //metodos getter y setter

    //nombre 
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nomdist){
        this.nombre = nomdist;
    }
    
    //cif
    public String getCif(){
        return this.cif;
    }
    public void setCif(String cif){
        this.cif = cif;
    }
    
    //direccion
    public Direccion getDireccion(){
        return this.direccion;
    }
        
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    
    //contacto
    public Contacto getContacto(){
        return this.personaContacto;
    }
    public void setContacto(Contacto contacto){
        this.personaContacto = contacto;
    }
        
}